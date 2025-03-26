package tut01;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.11
 * 2025-03-26T21:45:32.450+01:00
 * Generated source version: 3.5.11
 *
 */
@WebService(targetNamespace = "http://tut01/", name = "WorkDistributor")
@XmlSeeAlso({ObjectFactory.class})
public interface WorkDistributor {

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/getPhoneNumberCurrentProgressRequest", output = "http://tut01/WorkDistributor/getPhoneNumberCurrentProgressResponse")
    @RequestWrapper(localName = "getPhoneNumberCurrentProgress", targetNamespace = "http://tut01/", className = "tut01.GetPhoneNumberCurrentProgress")
    @ResponseWrapper(localName = "getPhoneNumberCurrentProgressResponse", targetNamespace = "http://tut01/", className = "tut01.GetPhoneNumberCurrentProgressResponse")
    @WebResult(name = "return", targetNamespace = "")
    public tut01.PhoneNumberProgress getPhoneNumberCurrentProgress(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/getEmployeeResponsibleForAssignmentRequest", output = "http://tut01/WorkDistributor/getEmployeeResponsibleForAssignmentResponse")
    @RequestWrapper(localName = "getEmployeeResponsibleForAssignment", targetNamespace = "http://tut01/", className = "tut01.GetEmployeeResponsibleForAssignment")
    @ResponseWrapper(localName = "getEmployeeResponsibleForAssignmentResponse", targetNamespace = "http://tut01/", className = "tut01.GetEmployeeResponsibleForAssignmentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getEmployeeResponsibleForAssignment(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/getListOfAssignedPhoneNumbersRequest", output = "http://tut01/WorkDistributor/getListOfAssignedPhoneNumbersResponse")
    @RequestWrapper(localName = "getListOfAssignedPhoneNumbers", targetNamespace = "http://tut01/", className = "tut01.GetListOfAssignedPhoneNumbers")
    @ResponseWrapper(localName = "getListOfAssignedPhoneNumbersResponse", targetNamespace = "http://tut01/", className = "tut01.GetListOfAssignedPhoneNumbersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<java.lang.String> getListOfAssignedPhoneNumbers(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/setPhoneNumberCurrentProgressRequest", output = "http://tut01/WorkDistributor/setPhoneNumberCurrentProgressResponse")
    @RequestWrapper(localName = "setPhoneNumberCurrentProgress", targetNamespace = "http://tut01/", className = "tut01.SetPhoneNumberCurrentProgress")
    @ResponseWrapper(localName = "setPhoneNumberCurrentProgressResponse", targetNamespace = "http://tut01/", className = "tut01.SetPhoneNumberCurrentProgressResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int setPhoneNumberCurrentProgress(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        tut01.PhoneNumberProgress arg1
    );

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/pushNewPhoneNumberRequest", output = "http://tut01/WorkDistributor/pushNewPhoneNumberResponse")
    @RequestWrapper(localName = "pushNewPhoneNumber", targetNamespace = "http://tut01/", className = "tut01.PushNewPhoneNumber")
    @ResponseWrapper(localName = "pushNewPhoneNumberResponse", targetNamespace = "http://tut01/", className = "tut01.PushNewPhoneNumberResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int pushNewPhoneNumber(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        tut01.PhoneNumberMetadata arg2
    );

    @WebMethod
    @Action(input = "http://tut01/WorkDistributor/getMetadataForPhoneNumberRequest", output = "http://tut01/WorkDistributor/getMetadataForPhoneNumberResponse")
    @RequestWrapper(localName = "getMetadataForPhoneNumber", targetNamespace = "http://tut01/", className = "tut01.GetMetadataForPhoneNumber")
    @ResponseWrapper(localName = "getMetadataForPhoneNumberResponse", targetNamespace = "http://tut01/", className = "tut01.GetMetadataForPhoneNumberResponse")
    @WebResult(name = "return", targetNamespace = "")
    public tut01.PhoneNumberMetadata getMetadataForPhoneNumber(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
