
package ns.cdm.reisinformatie.data.vi._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Geeft de regels voor de herhaling van het tijdvak aan.
 * 						Bij D kan in de Regel alleen dagelijkse herhaling voorkomen (Dag= Ma tm/ Zo aanwezig) of herhaling op werkdagen (Dag = Ma t/m Vr aanwezig).
 * 							De begindatum van het eerste tijdvak moet op één van de meegegeven weekdagen vallen.
 * 							De duur van het tijdvak is kleiner dan 24 uur. Wel kan de begintijd op een bepaalde datum liggen en de eindtijd op de volgende dag.
 * 						Bij W is minimaal één dag aanwezig, en zijn maximaal 7 dagen aanwezig. 
 * 							Als maar één dag is meegegeven moet deze kloppen met de begindatum van het eerste tijdvak. 
 * 							Als er meer dagen meegegeven zijn, moet de begindatum van het eerste tijdvak overeenstemmen met één van de (week)dagen.
 * 							De duur van het tijdvak mag groter zijn dan 24 uur.
 * 			
 * 
 * <p>Java class for RegelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Frequentie" type="{urn:ns:cdm:reisinformatie:data:vi:1}FrequentieType"/&gt;
 *         &lt;element name="Dag" type="{urn:ns:cdm:reisinformatie:data:vi:1}DagenType" maxOccurs="7"/&gt;
 *         &lt;element name="PeriodeDatumTot" type="{urn:ns:cdm:reisinformatie:data:vi:1}PeriodeDatumTotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegelType", propOrder = {
    "frequentie",
    "dag",
    "periodeDatumTot"
})
public class RegelType {

    @XmlElement(name = "Frequentie", required = true)
    @XmlSchemaType(name = "string")
    protected FrequentieType frequentie;
    @XmlElement(name = "Dag", required = true)
    @XmlSchemaType(name = "string")
    protected List<DagenType> dag;
    @XmlElement(name = "PeriodeDatumTot", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodeDatumTot;

    /**
     * Gets the value of the frequentie property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentieType }
     *     
     */
    public FrequentieType getFrequentie() {
        return frequentie;
    }

    /**
     * Sets the value of the frequentie property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentieType }
     *     
     */
    public void setFrequentie(FrequentieType value) {
        this.frequentie = value;
    }

    /**
     * Gets the value of the dag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DagenType }
     * 
     * 
     */
    public List<DagenType> getDag() {
        if (dag == null) {
            dag = new ArrayList<DagenType>();
        }
        return this.dag;
    }

    /**
     * Gets the value of the periodeDatumTot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodeDatumTot() {
        return periodeDatumTot;
    }

    /**
     * Sets the value of the periodeDatumTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodeDatumTot(XMLGregorianCalendar value) {
        this.periodeDatumTot = value;
    }

}
