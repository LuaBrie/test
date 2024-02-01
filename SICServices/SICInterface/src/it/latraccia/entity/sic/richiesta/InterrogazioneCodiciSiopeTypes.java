//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.27 at 01:25:11 AM CEST 
//


package it.latraccia.entity.sic.richiesta;


/**
 * Java content class for InterrogazioneCodiciSiope_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RichiestaSIC.xsd line 1142)
 * <p>
 * <pre>
 * &lt;complexType name="InterrogazioneCodiciSiope_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Anno" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="CodiceCapitolo">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="U\d{5}"/>
 *             &lt;minLength value="6"/>
 *             &lt;maxLength value="6"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InterrogazioneCodiciSiopeTypes {


    /**
     * Anno
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAnno();

    /**
     * Anno
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAnno(java.lang.String value);

    /**
     * Codice del capitolo: Uxxxxx (lettera U seguita da 5 cifre) – Uscite
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCodiceCapitolo();

    /**
     * Codice del capitolo: Uxxxxx (lettera U seguita da 5 cifre) – Uscite
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCodiceCapitolo(java.lang.String value);

}
