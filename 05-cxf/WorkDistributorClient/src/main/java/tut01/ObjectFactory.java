
package tut01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tut01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeResponsibleForAssignment_QNAME = new QName("http://tut01/", "getEmployeeResponsibleForAssignment");
    private final static QName _GetEmployeeResponsibleForAssignmentResponse_QNAME = new QName("http://tut01/", "getEmployeeResponsibleForAssignmentResponse");
    private final static QName _GetListOfAssignedPhoneNumbers_QNAME = new QName("http://tut01/", "getListOfAssignedPhoneNumbers");
    private final static QName _GetListOfAssignedPhoneNumbersResponse_QNAME = new QName("http://tut01/", "getListOfAssignedPhoneNumbersResponse");
    private final static QName _GetMetadataForPhoneNumber_QNAME = new QName("http://tut01/", "getMetadataForPhoneNumber");
    private final static QName _GetMetadataForPhoneNumberResponse_QNAME = new QName("http://tut01/", "getMetadataForPhoneNumberResponse");
    private final static QName _GetPhoneNumberCurrentProgress_QNAME = new QName("http://tut01/", "getPhoneNumberCurrentProgress");
    private final static QName _GetPhoneNumberCurrentProgressResponse_QNAME = new QName("http://tut01/", "getPhoneNumberCurrentProgressResponse");
    private final static QName _PushNewPhoneNumber_QNAME = new QName("http://tut01/", "pushNewPhoneNumber");
    private final static QName _PushNewPhoneNumberResponse_QNAME = new QName("http://tut01/", "pushNewPhoneNumberResponse");
    private final static QName _SetPhoneNumberCurrentProgress_QNAME = new QName("http://tut01/", "setPhoneNumberCurrentProgress");
    private final static QName _SetPhoneNumberCurrentProgressResponse_QNAME = new QName("http://tut01/", "setPhoneNumberCurrentProgressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tut01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeResponsibleForAssignment }
     * 
     */
    public GetEmployeeResponsibleForAssignment createGetEmployeeResponsibleForAssignment() {
        return new GetEmployeeResponsibleForAssignment();
    }

    /**
     * Create an instance of {@link GetEmployeeResponsibleForAssignmentResponse }
     * 
     */
    public GetEmployeeResponsibleForAssignmentResponse createGetEmployeeResponsibleForAssignmentResponse() {
        return new GetEmployeeResponsibleForAssignmentResponse();
    }

    /**
     * Create an instance of {@link GetListOfAssignedPhoneNumbers }
     * 
     */
    public GetListOfAssignedPhoneNumbers createGetListOfAssignedPhoneNumbers() {
        return new GetListOfAssignedPhoneNumbers();
    }

    /**
     * Create an instance of {@link GetListOfAssignedPhoneNumbersResponse }
     * 
     */
    public GetListOfAssignedPhoneNumbersResponse createGetListOfAssignedPhoneNumbersResponse() {
        return new GetListOfAssignedPhoneNumbersResponse();
    }

    /**
     * Create an instance of {@link GetMetadataForPhoneNumber }
     * 
     */
    public GetMetadataForPhoneNumber createGetMetadataForPhoneNumber() {
        return new GetMetadataForPhoneNumber();
    }

    /**
     * Create an instance of {@link GetMetadataForPhoneNumberResponse }
     * 
     */
    public GetMetadataForPhoneNumberResponse createGetMetadataForPhoneNumberResponse() {
        return new GetMetadataForPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link GetPhoneNumberCurrentProgress }
     * 
     */
    public GetPhoneNumberCurrentProgress createGetPhoneNumberCurrentProgress() {
        return new GetPhoneNumberCurrentProgress();
    }

    /**
     * Create an instance of {@link GetPhoneNumberCurrentProgressResponse }
     * 
     */
    public GetPhoneNumberCurrentProgressResponse createGetPhoneNumberCurrentProgressResponse() {
        return new GetPhoneNumberCurrentProgressResponse();
    }

    /**
     * Create an instance of {@link PushNewPhoneNumber }
     * 
     */
    public PushNewPhoneNumber createPushNewPhoneNumber() {
        return new PushNewPhoneNumber();
    }

    /**
     * Create an instance of {@link PushNewPhoneNumberResponse }
     * 
     */
    public PushNewPhoneNumberResponse createPushNewPhoneNumberResponse() {
        return new PushNewPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link SetPhoneNumberCurrentProgress }
     * 
     */
    public SetPhoneNumberCurrentProgress createSetPhoneNumberCurrentProgress() {
        return new SetPhoneNumberCurrentProgress();
    }

    /**
     * Create an instance of {@link SetPhoneNumberCurrentProgressResponse }
     * 
     */
    public SetPhoneNumberCurrentProgressResponse createSetPhoneNumberCurrentProgressResponse() {
        return new SetPhoneNumberCurrentProgressResponse();
    }

    /**
     * Create an instance of {@link PhoneNumberMetadata }
     * 
     */
    public PhoneNumberMetadata createPhoneNumberMetadata() {
        return new PhoneNumberMetadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponsibleForAssignment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponsibleForAssignment }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getEmployeeResponsibleForAssignment")
    public JAXBElement<GetEmployeeResponsibleForAssignment> createGetEmployeeResponsibleForAssignment(GetEmployeeResponsibleForAssignment value) {
        return new JAXBElement<GetEmployeeResponsibleForAssignment>(_GetEmployeeResponsibleForAssignment_QNAME, GetEmployeeResponsibleForAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponsibleForAssignmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponsibleForAssignmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getEmployeeResponsibleForAssignmentResponse")
    public JAXBElement<GetEmployeeResponsibleForAssignmentResponse> createGetEmployeeResponsibleForAssignmentResponse(GetEmployeeResponsibleForAssignmentResponse value) {
        return new JAXBElement<GetEmployeeResponsibleForAssignmentResponse>(_GetEmployeeResponsibleForAssignmentResponse_QNAME, GetEmployeeResponsibleForAssignmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAssignedPhoneNumbers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListOfAssignedPhoneNumbers }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getListOfAssignedPhoneNumbers")
    public JAXBElement<GetListOfAssignedPhoneNumbers> createGetListOfAssignedPhoneNumbers(GetListOfAssignedPhoneNumbers value) {
        return new JAXBElement<GetListOfAssignedPhoneNumbers>(_GetListOfAssignedPhoneNumbers_QNAME, GetListOfAssignedPhoneNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAssignedPhoneNumbersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListOfAssignedPhoneNumbersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getListOfAssignedPhoneNumbersResponse")
    public JAXBElement<GetListOfAssignedPhoneNumbersResponse> createGetListOfAssignedPhoneNumbersResponse(GetListOfAssignedPhoneNumbersResponse value) {
        return new JAXBElement<GetListOfAssignedPhoneNumbersResponse>(_GetListOfAssignedPhoneNumbersResponse_QNAME, GetListOfAssignedPhoneNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadataForPhoneNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMetadataForPhoneNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getMetadataForPhoneNumber")
    public JAXBElement<GetMetadataForPhoneNumber> createGetMetadataForPhoneNumber(GetMetadataForPhoneNumber value) {
        return new JAXBElement<GetMetadataForPhoneNumber>(_GetMetadataForPhoneNumber_QNAME, GetMetadataForPhoneNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadataForPhoneNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMetadataForPhoneNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getMetadataForPhoneNumberResponse")
    public JAXBElement<GetMetadataForPhoneNumberResponse> createGetMetadataForPhoneNumberResponse(GetMetadataForPhoneNumberResponse value) {
        return new JAXBElement<GetMetadataForPhoneNumberResponse>(_GetMetadataForPhoneNumberResponse_QNAME, GetMetadataForPhoneNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneNumberCurrentProgress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPhoneNumberCurrentProgress }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getPhoneNumberCurrentProgress")
    public JAXBElement<GetPhoneNumberCurrentProgress> createGetPhoneNumberCurrentProgress(GetPhoneNumberCurrentProgress value) {
        return new JAXBElement<GetPhoneNumberCurrentProgress>(_GetPhoneNumberCurrentProgress_QNAME, GetPhoneNumberCurrentProgress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneNumberCurrentProgressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPhoneNumberCurrentProgressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "getPhoneNumberCurrentProgressResponse")
    public JAXBElement<GetPhoneNumberCurrentProgressResponse> createGetPhoneNumberCurrentProgressResponse(GetPhoneNumberCurrentProgressResponse value) {
        return new JAXBElement<GetPhoneNumberCurrentProgressResponse>(_GetPhoneNumberCurrentProgressResponse_QNAME, GetPhoneNumberCurrentProgressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushNewPhoneNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PushNewPhoneNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "pushNewPhoneNumber")
    public JAXBElement<PushNewPhoneNumber> createPushNewPhoneNumber(PushNewPhoneNumber value) {
        return new JAXBElement<PushNewPhoneNumber>(_PushNewPhoneNumber_QNAME, PushNewPhoneNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushNewPhoneNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PushNewPhoneNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "pushNewPhoneNumberResponse")
    public JAXBElement<PushNewPhoneNumberResponse> createPushNewPhoneNumberResponse(PushNewPhoneNumberResponse value) {
        return new JAXBElement<PushNewPhoneNumberResponse>(_PushNewPhoneNumberResponse_QNAME, PushNewPhoneNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPhoneNumberCurrentProgress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPhoneNumberCurrentProgress }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "setPhoneNumberCurrentProgress")
    public JAXBElement<SetPhoneNumberCurrentProgress> createSetPhoneNumberCurrentProgress(SetPhoneNumberCurrentProgress value) {
        return new JAXBElement<SetPhoneNumberCurrentProgress>(_SetPhoneNumberCurrentProgress_QNAME, SetPhoneNumberCurrentProgress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPhoneNumberCurrentProgressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPhoneNumberCurrentProgressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tut01/", name = "setPhoneNumberCurrentProgressResponse")
    public JAXBElement<SetPhoneNumberCurrentProgressResponse> createSetPhoneNumberCurrentProgressResponse(SetPhoneNumberCurrentProgressResponse value) {
        return new JAXBElement<SetPhoneNumberCurrentProgressResponse>(_SetPhoneNumberCurrentProgressResponse_QNAME, SetPhoneNumberCurrentProgressResponse.class, null, value);
    }

}
