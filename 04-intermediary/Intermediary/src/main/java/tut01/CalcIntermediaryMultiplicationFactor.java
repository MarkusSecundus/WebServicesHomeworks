package tut01;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

/**
 * Servlet implementation class CalcIntermediaryMultiplicationFactor
 */
@WebServlet("/CalcIntermediaryMultiplicationFactor")
public class CalcIntermediaryMultiplicationFactor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcIntermediaryMultiplicationFactor() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse responseRaw) throws ServletException, IOException {
		try {
			final String NAMESPACE = "http://tut01/";
			
			SOAPConnectionFactory soapcf = SOAPConnectionFactory.newInstance();
			SOAPConnection soapc = soapcf.createConnection();
		
			MessageFactory mf = MessageFactory.newInstance();
			SOAPMessage soapm = mf.createMessage(null, request.getInputStream());
			   
			SOAPPart soapp = soapm.getSOAPPart();
			SOAPEnvelope soape = soapp.getEnvelope();
			SOAPHeader header = soape.getHeader();
			final String ADDITIONAL_NUMBERS_NAME = "additionalNumbers";
			String additionalNumbers[] = new String[0];
			try{
				additionalNumbers = header.getAttribute(ADDITIONAL_NUMBERS_NAME).split(" ");
				header.removeAttribute(ADDITIONAL_NUMBERS_NAME);
			}catch(Exception e){}
		
			String endpoint = "http://127.0.0.1:8000/WorkDistributor";
			SOAPMessage responseSoap = soapc.call(soapm, endpoint);
			soapc.close();
			
			
			SOAPBody responseBody = responseSoap.getSOAPPart().getEnvelope().getBody();

			
			if (! responseBody.hasFault()) { 
				
				QName ResponseName = new QName(NAMESPACE, "getListOfAssignedPhoneNumbersResponse");
				QName ResultName = new QName("return");
		
				SOAPBodyElement AddResponse = (SOAPBodyElement) responseBody.getChildElements(ResponseName).next();
				for(String num : additionalNumbers) {
					AddResponse.addChildElement(ResultName).setValue(num);
				}
			}

			ByteArrayOutputStream wrt = new ByteArrayOutputStream();
			responseSoap.writeTo(wrt);
			System.out.println(wrt.toString());
			responseSoap.writeTo(responseRaw.getOutputStream());
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
	}

}
