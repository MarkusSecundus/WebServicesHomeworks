package tut01;

@javax.jws.WebService
public interface WorkDistributor {
	@javax.jws.WebMethod
    public String[] getListOfAssignedPhoneNumbers(String username);   
	

	@javax.jws.WebMethod
	public PhoneNumberMetadata getMetadataForPhoneNumber(String phoneNumber);

	@javax.jws.WebMethod
	public PhoneNumberProgress getPhoneNumberCurrentProgress(String phoneNumber);	
	@javax.jws.WebMethod
	public String getEmployeeResponsibleForAssignment(String assignedPhoneNumber);

	@javax.jws.WebMethod
	public int setPhoneNumberCurrentProgress(String phoneNumber, PhoneNumberProgress progress);
	

	@javax.jws.WebMethod
	public int pushNewPhoneNumber(String adminUsername, String adminPassword, PhoneNumberMetadata newPhoneNumber);

}
