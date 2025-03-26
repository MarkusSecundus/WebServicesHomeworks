package tut01;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "WorkDistributor", targetNamespace = "http://tut01/")
public interface WorkDistributor {
    @WebMethod(operationName = "getListOfAssignedPhoneNumbers", action = "urn:GetListOfAssignedPhoneNumbers")
	public String[] getListOfAssignedPhoneNumbers(String username);   
	
	@WebMethod(operationName = "getMetadataForPhoneNumber", action = "urn:GetMetadataForPhoneNumber")
	public PhoneNumberMetadata getMetadataForPhoneNumber(String phoneNumber);

	@WebMethod(operationName = "getPhoneNumberCurrentProgress", action = "urn:GetPhoneNumberCurrentProgress")
	public PhoneNumberProgress getPhoneNumberCurrentProgress(String phoneNumber);	
	
	@WebMethod(operationName = "getEmployeeResponsibleForAssignment", action = "urn:GetEmployeeResponsibleForAssignment")
	public String getEmployeeResponsibleForAssignment(String assignedPhoneNumber);

	@WebMethod(operationName = "setPhoneNumberCurrentProgress", action = "urn:SetPhoneNumberCurrentProgress")
	public int setPhoneNumberCurrentProgress(String phoneNumber, PhoneNumberProgress progress);
	
	@WebMethod(operationName = "pushNewPhoneNumber", action = "urn:PushNewPhoneNumber")
	public int pushNewPhoneNumber(String adminUsername, String adminPassword, PhoneNumberMetadata newPhoneNumber);
}
