
package tut01.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.11
 * Wed Mar 26 22:07:14 CET 2025
 * Generated source version: 3.5.11
 */

@XmlRootElement(name = "getListOfAssignedPhoneNumbersResponse", namespace = "http://tut01/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListOfAssignedPhoneNumbersResponse", namespace = "http://tut01/")

public class GetListOfAssignedPhoneNumbersResponse {

    @XmlElement(name = "return")
    private String[] _return;

    public String[] getReturn() {
        return this._return;
    }

    public void setReturn(String[] new_return)  {
        this._return = new_return;
    }

}

