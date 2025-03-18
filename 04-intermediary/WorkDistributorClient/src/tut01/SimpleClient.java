package tut01;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.*;
import javax.xml.ws.Service;


public class SimpleClient {
	
	
	public static void main(String[] args) throws Exception {
		workDistributorClient();
	}
	
	
	public static void workDistributorClient() throws Exception{
		
		System.out.println("Starting!");
		
		final String NAMESPACE = "http://tut01/";
		SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
		SOAPConnection soapc = soapcf.createConnection();
	
		MessageFactory mf = MessageFactory.newInstance();
		SOAPMessage soapm = mf.createMessage();
		   
		SOAPPart soapp = soapm.getSOAPPart();
		SOAPEnvelope soape = soapp.getEnvelope();
		SOAPBody soapb = soape.getBody();
	
		soape.getHeader().detachNode();
		QName name = new QName(NAMESPACE, "getListOfAssignedPhoneNumbers", "tut");
		SOAPElement soapel = soapb.addBodyElement(name);
	
		soapel.addChildElement( "arg0").addTextNode("Satya_Nadella");
		String endpoint = "http://127.0.0.1:8000/WorkDistributor";
		SOAPMessage response = soapc.call(soapm, endpoint);
		
		ByteArrayOutputStream wrt = new ByteArrayOutputStream();
		soapm.writeTo(wrt);
		
		//System.out.printf("Sending:\n%s\n\n", wrt.toString());
		
		soapc.close();
		
		
		
		SOAPBody responseBody = response.getSOAPBody();
		wrt = new ByteArrayOutputStream();
		response.writeTo(wrt);
		
		//System.out.printf("Received:\n%s\n\n", wrt.toString());
		
		if (responseBody.hasFault()) {
		    System.out.println(responseBody.getFault().getFaultString());
		} else {

			QName ResponseName = new QName(NAMESPACE, "getListOfAssignedPhoneNumbersResponse");
			QName ResultName = new QName("return");
	
			SOAPBodyElement AddResponse = (SOAPBodyElement) responseBody.getChildElements(ResponseName).next();
			
			System.out.println("Responses...");
			for(Iterator<SOAPBodyElement> results = AddResponse.getChildElements(ResultName); results.hasNext() ;) {
				SOAPBodyElement result = results.next();
				System.out.println(result.getValue());
			}
		}
		System.out.println("FINISHED!");
	}
	


}
