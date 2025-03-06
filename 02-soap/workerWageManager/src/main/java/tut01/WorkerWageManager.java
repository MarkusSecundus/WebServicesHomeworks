package tut01;

import java.time.LocalDate;

@javax.jws.WebService
public interface WorkerWageManager {
    
	@javax.jws.WebMethod
	public long getCurrentWageEstimate(String username);
	@javax.jws.WebMethod
	public String getLastPayoutDate(String username);
	@javax.jws.WebMethod
    public String getExplanationWhyPayoutIsLate(String username);   

	@javax.jws.WebMethod
    public int doPayout(String adminUsername, String adminPassword, String username);   
	
	@javax.jws.WebMethod
    public int recordMoneyEarnedForCompany(String adminUsername, String adminPassword, String username, long amountEarned_rupees);
	
	@javax.jws.WebMethod
    public int addNewEmployee(String adminUsername, String adminPassword, String username);
	
	
}
