
package tut01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneNumberProgress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="phoneNumberProgress"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="IN_PROCESS"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="SUCCESS_WAITING_FOR_MONEY"/&gt;
 *     &lt;enumeration value="SUCCESS_MONEY_ARRIVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "phoneNumberProgress")
@XmlEnum
public enum PhoneNumberProgress {

    NONE,
    ASSIGNED,
    IN_PROCESS,
    FAILED,
    SUCCESS_WAITING_FOR_MONEY,
    SUCCESS_MONEY_ARRIVED;

    public String value() {
        return name();
    }

    public static PhoneNumberProgress fromValue(String v) {
        return valueOf(v);
    }

}
