package tut01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import javax.jws.WebService;

@WebService(endpointInterface = "tut01.WorkDistributor")
public class WorkDistributorImpl implements WorkDistributor {

	
	static final String OnlyEmployeeName = "Satya_Nadella";
	
	static final String AdminUsername = "admin", AdminPassword = "admin123";
	
	List<PhoneNumberMetadata> unassignedPhoneNumbers = new ArrayList<>();
	
	HashMap<String, PhoneNumberProgress> progressPerNumber = new HashMap<>();
	
	HashMap<String, List<PhoneNumberMetadata>> assignedPhoneNumbersPerEmployee = new HashMap<>();
	{
		List<PhoneNumberMetadata> list = new ArrayList<>();
		list.add(new PhoneNumberMetadata() {{
			phoneNumber = "736637745";
			countryCode = "en-GB";
			userName = "Count Olaf";
		}});
		list.add(new PhoneNumberMetadata() {{
			phoneNumber = "1006637745";
			countryCode = "en-US";
			userName = "Emil";
		}});
		list.add(new PhoneNumberMetadata() {{
			phoneNumber = "600525737";
			countryCode = "cs-CZ";
			userName = "Mr. Tau";
		}});
		list.add(new PhoneNumberMetadata() {{
			phoneNumber = "600525738";
			countryCode = "cs-CZ";
			userName = "Křemílek";
		}}); 
		list.add(new PhoneNumberMetadata() {{
			phoneNumber = "600525739";
			countryCode = "cs-CZ";
			userName = "Vochomůrka";
		}});

		
		assignedPhoneNumbersPerEmployee.put(OnlyEmployeeName, list);
	}
	
	
	
	@Override
	public String[] getListOfAssignedPhoneNumbers(String username) {
		List<PhoneNumberMetadata> phones = assignedPhoneNumbersPerEmployee.get(username);
		if(phones == null) return new String[0];
		String[] ret = new String[phones.size()];
		for(int t=0;t<phones.size();++t) ret[t] = phones.get(t).phoneNumber;
		return ret;
	}

	@Override
	public PhoneNumberMetadata getMetadataForPhoneNumber(String phoneNum) {
		for(PhoneNumberMetadata m : unassignedPhoneNumbers) if(Objects.equals(m.phoneNumber, phoneNum)) return m;
		for(List<PhoneNumberMetadata> l: assignedPhoneNumbersPerEmployee.values())
			for(PhoneNumberMetadata m : l) if(Objects.equals(m.phoneNumber, phoneNum)) return m;
		return null;
	}

	@Override
	public PhoneNumberProgress getPhoneNumberCurrentProgress(String phoneNumber) {
		PhoneNumberProgress ret = progressPerNumber.get(phoneNumber);
		return ret != null ? ret : PhoneNumberProgress.NONE;
	}

	@Override
	public String getEmployeeResponsibleForAssignment(String assignedPhoneNumber) {
		for(String user: assignedPhoneNumbersPerEmployee.keySet()) {
			List<PhoneNumberMetadata> nums = assignedPhoneNumbersPerEmployee.get(user);
			for(PhoneNumberMetadata m : nums) 
				if(Objects.equals(m.phoneNumber,assignedPhoneNumber)) 
					return user;
		}
		return null;
	}

	@Override
	public int setPhoneNumberCurrentProgress(String phoneNumber, PhoneNumberProgress progress) {
		progressPerNumber.put(phoneNumber, progress);
		return 0;
	}

	@Override
	public int pushNewPhoneNumber(String adminUsername, String adminPassword, PhoneNumberMetadata newPhoneNumber) {
		if(!Objects.equals(adminUsername, AdminUsername) || !Objects.equals(adminPassword, AdminPassword)) return 403;
		unassignedPhoneNumbers.add(newPhoneNumber);
		return 0;
	}

}
