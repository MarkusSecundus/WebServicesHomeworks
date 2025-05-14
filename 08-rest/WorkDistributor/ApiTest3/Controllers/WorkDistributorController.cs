using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ApiTest3.Controllers
{

    [System.Serializable]
    public enum PhoneNumberProgress
    {
        NONE, ASSIGNED, IN_PROCESS, FAILED, SUCCESS_WAITING_FOR_MONEY, SUCCESS_MONEY_ARRIVED
    }

    [System.Serializable]
    public class EmployeeData
    {
        public required string Name { get; init; }
    }

    /// <summary>
    /// Immutable record that's stored for each phone number at the moment it's obtained by the scam callcenter.
    /// </summary>
    [System.Serializable]
    public class PhoneNumberRecord
    {
        public required string PhoneNumber { get; init; }
        public required string UserName { get; init; }
        public required string CountryCode { get; init; }
        public double ApproximateLongitude { get; init; } = 0f;
        public double ApproximateLattitude { get; init; } = 0f;
        public long ApproximateYearlyIncomeInUSD { get; init; } = -1;
        public long ApproximateAge { get; init; } = -1;
    }

    [System.Serializable]
    public class PhoneNumberProcessingState
    {
        public string? AssignedEmployee { get; set; }
        public PhoneNumberProgress Progress { get; set; } = PhoneNumberProgress.NONE;
    }


    [ApiController]
    [Route("[controller]")]
    public class WorkDistributorController : Controller
    {

        static readonly string OnlyEmployee = "Satya_Nadella";

        static readonly Dictionary<string, PhoneNumberRecord> _phoneNumberRecords = new()
        {
            ["736637745"] = new PhoneNumberRecord
            {
                PhoneNumber = "736637745",
                CountryCode = "en-GB",
                UserName = "Count Olaf",
            },
            ["1006637745"] = new PhoneNumberRecord
            {
                PhoneNumber = "1006637745",
                CountryCode = "en-US",
                UserName = "Emil",
            },
            ["600525737"] = new PhoneNumberRecord
            {
                PhoneNumber = "600525737",
                CountryCode = "cs-CZ",
                UserName = "Mr. Tau",
            },
            ["600525738"] = new PhoneNumberRecord
            {
                PhoneNumber = "600525738",
                CountryCode = "cs-CZ",
                UserName = "Křemílek",
            },
            ["600525739"] = new PhoneNumberRecord
            {
                PhoneNumber = "600525739",
                CountryCode = "cs-CZ",
                UserName = "Vochomůrka",
            },
        };
        static readonly Dictionary<string, PhoneNumberProcessingState> _phoneNumberProcessingStates = new()
        {
            ["736637745"] = new PhoneNumberProcessingState
            {
                AssignedEmployee = OnlyEmployee,
                Progress = PhoneNumberProgress.ASSIGNED
            },
            ["600525739"] = new PhoneNumberProcessingState
            {
                AssignedEmployee = OnlyEmployee,
                Progress = PhoneNumberProgress.IN_PROCESS
            }
        };


        [HttpGet("/employee")]
        public IEnumerable<string> GetEmployees()
        {
            yield return OnlyEmployee;
        }


        [HttpGet("/phoneNumbers")]
        public IEnumerable<string> GetAllPhoneNumbers()
        {
            return _phoneNumberRecords.Keys;
        }


        [HttpGet("/phoneNumbers/byUser/{username}")]
        public IEnumerable<string> GetAssignedPhoneNumbers(string username)
        {
            foreach(var (num, state) in _phoneNumberProcessingStates)
            {
                if (state.AssignedEmployee == username) yield return num;
            }
        }

        [HttpGet("/phoneNumbers/records")]
        public IEnumerable<PhoneNumberRecord> GetPhoneNumberRecords()
        {
            return _phoneNumberRecords.Values;
        }
        

        [HttpGet("/phoneNumbers/records/{phoneNum}")]
        public PhoneNumberRecord? GetPhoneNumberRecord(string phoneNum)
        {
            return _phoneNumberRecords.GetValueOrDefault(phoneNum);
        }



        [HttpGet("/phoneNumbers/states")]
        public IEnumerable<PhoneNumberProcessingState> GetPhoneNumberProcessingStates()
        {
            return _phoneNumberProcessingStates.Values;
        }
        [HttpGet("/phoneNumbers/states/{phoneNum}")]
        public PhoneNumberProcessingState? GetPhoneNumberProcessingState(string phoneNum)
        {
            return _phoneNumberProcessingStates.GetValueOrDefault(phoneNum);
        }



        [HttpPut("/phoneNumbers/progress/{phoneNum}")]
        public IActionResult SetPhoneNumberCurrentProgress(string phoneNum, PhoneNumberProgress newProgress)
        {
            if(_phoneNumberProcessingStates.TryGetValue(phoneNum, out var state))
            {
                state.Progress = newProgress;
            }
            else
            {
                if(! _phoneNumberRecords.ContainsKey(phoneNum))
                {
                    return NotFound();
                }
                _phoneNumberProcessingStates[phoneNum] = new PhoneNumberProcessingState { Progress = newProgress };
            }
            return Ok();
        }
        
        [HttpPut("/phoneNumbers/byEmployee/{phoneNum}")]
        public IActionResult SetPhoneNumberEmployee(string phoneNum, string newEmployee)
        {
            if (newEmployee != OnlyEmployee)
                return NotFound();

            if(_phoneNumberProcessingStates.TryGetValue(phoneNum, out var state))
            {
                state.AssignedEmployee = newEmployee;
                return Ok();
            }
            else
            {
                if(! _phoneNumberRecords.ContainsKey(phoneNum))
                    return NotFound();
                _phoneNumberProcessingStates[phoneNum] = new PhoneNumberProcessingState { AssignedEmployee = newEmployee };
            }
            return Ok();
        }


        [HttpPost("/phoneNumbers/add/{phoneNum}")]
        public IActionResult PushNewPhoneNumber(string phoneNum, PhoneNumberRecord record)
        {
            if (record.PhoneNumber != phoneNum)
                return Conflict();
            if (_phoneNumberRecords.ContainsKey(record.PhoneNumber))
                return Conflict();

            _phoneNumberRecords[record.PhoneNumber] = record;
            return Ok();
            
        }

        [HttpDelete("/phoneNumbers/delete/{phoneNum}")]
        public IActionResult DeletePhoneNumber(string phoneNum)
        {
            bool wasDeleted = false;
            wasDeleted |= _phoneNumberRecords.Remove(phoneNum);
            wasDeleted |= _phoneNumberProcessingStates.Remove(phoneNum);

            return wasDeleted ? Ok() : NotFound();
        }


    }
}
