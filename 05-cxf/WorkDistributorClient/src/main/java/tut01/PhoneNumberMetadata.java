
package tut01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoneNumberMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumberMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="approximateLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="approximateLattitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="approximateYearlyIncomeInUSD" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="approximateAge" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumberMetadata", propOrder = {
    "phoneNumber",
    "userName",
    "countryCode",
    "approximateLongitude",
    "approximateLattitude",
    "approximateYearlyIncomeInUSD",
    "approximateAge"
})
public class PhoneNumberMetadata {

    protected String phoneNumber;
    protected String userName;
    protected String countryCode;
    protected double approximateLongitude;
    protected double approximateLattitude;
    protected long approximateYearlyIncomeInUSD;
    protected long approximateAge;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the approximateLongitude property.
     * 
     */
    public double getApproximateLongitude() {
        return approximateLongitude;
    }

    /**
     * Sets the value of the approximateLongitude property.
     * 
     */
    public void setApproximateLongitude(double value) {
        this.approximateLongitude = value;
    }

    /**
     * Gets the value of the approximateLattitude property.
     * 
     */
    public double getApproximateLattitude() {
        return approximateLattitude;
    }

    /**
     * Sets the value of the approximateLattitude property.
     * 
     */
    public void setApproximateLattitude(double value) {
        this.approximateLattitude = value;
    }

    /**
     * Gets the value of the approximateYearlyIncomeInUSD property.
     * 
     */
    public long getApproximateYearlyIncomeInUSD() {
        return approximateYearlyIncomeInUSD;
    }

    /**
     * Sets the value of the approximateYearlyIncomeInUSD property.
     * 
     */
    public void setApproximateYearlyIncomeInUSD(long value) {
        this.approximateYearlyIncomeInUSD = value;
    }

    /**
     * Gets the value of the approximateAge property.
     * 
     */
    public long getApproximateAge() {
        return approximateAge;
    }

    /**
     * Sets the value of the approximateAge property.
     * 
     */
    public void setApproximateAge(long value) {
        this.approximateAge = value;
    }

}
