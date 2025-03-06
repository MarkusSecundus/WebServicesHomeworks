package tut01;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import javax.jws.WebService;

@WebService(endpointInterface = "tut01.WorkerWageManager")
public class WorkerWageManagerImpl implements WorkerWageManager {

	
	static final String OnlyEmployeeName = "Satya_Nadella";
	
	static final String AdminUsername = "admin", AdminPassword = "admin123";

	class EmployeeWageInfo{
		String username;
		long moneyEarnedForCompanySinceLastPayout_rupees;
		LocalDate lastPayoutDate;
	}
	HashMap<String, EmployeeWageInfo> wageInfo = new HashMap<>();
	{
		wageInfo.put(OnlyEmployeeName, new EmployeeWageInfo() {{
			username = OnlyEmployeeName;
			moneyEarnedForCompanySinceLastPayout_rupees = 500000;
			lastPayoutDate = LocalDate.of(2024, 11, 30);
		}});
	}
	
	
	
	@Override
	public long getCurrentWageEstimate(String username) {
		EmployeeWageInfo info = wageInfo.get(username);
		if(info == null) return -1;
		return (long)(info.moneyEarnedForCompanySinceLastPayout_rupees * 0.001f);
	}

	@Override
	public String getLastPayoutDate(String username) {
		EmployeeWageInfo info = wageInfo.get(username);
		if(info == null) return null;
		return info.lastPayoutDate.toString();
	}

	@Override
	public String getExplanationWhyPayoutIsLate(String username) {
		return "These are challenging times. But rest assured we are all doing our best to ensure you get paid as much in time as possible.";
	}

	@Override
	public int doPayout(String adminUsername, String adminPassword, String username) {
		if(!Objects.equals(adminUsername, AdminUsername) || !Objects.equals(adminPassword, AdminPassword)) return 403;
		EmployeeWageInfo info = wageInfo.get(username);
		if(info == null) return 404;
		long howMuchToPayOut = getCurrentWageEstimate(username);
		System.out.printf("Paying out %s rupees to %s\n", howMuchToPayOut, username);
		info.lastPayoutDate = LocalDate.now();
		info.moneyEarnedForCompanySinceLastPayout_rupees = 0;
		return 0;
	}

	@Override
	public int recordMoneyEarnedForCompany(String adminUsername, String adminPassword, String username, long amountEarned_rupees) {
		if(!Objects.equals(adminUsername, AdminUsername) || !Objects.equals(adminPassword, AdminPassword)) return 403;
		EmployeeWageInfo info = wageInfo.get(username);
		if(info == null) return 404;
		
		info.moneyEarnedForCompanySinceLastPayout_rupees += amountEarned_rupees;
		
		return 0;
	}

	@Override
	public int addNewEmployee(String adminUsername, String adminPassword, String userName) {
		if(!Objects.equals(adminUsername, AdminUsername) || !Objects.equals(adminPassword, AdminPassword)) return 403;
		if(wageInfo.get(userName) != null) return 404;
		wageInfo.put(userName, new EmployeeWageInfo() {{
			this.username = userName;
			this.lastPayoutDate = LocalDate.now();
			this.moneyEarnedForCompanySinceLastPayout_rupees = 0;
		}});
		return 0;
	}
	
	
	
	
}
