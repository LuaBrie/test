//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.27 at 01:25:11 AM CEST 
//


package it.latraccia.entity.sic.richiesta;


/**
 * Java content class for InterrogaCapitoloEntrata_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RichiestaSIC.xsd line 1064)
 * <p>
 * <pre>
 * &lt;complexType name="InterrogaCapitoloEntrata_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnoBilancio" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InterrogaCapitoloEntrataTypes {


    /**
     * Anno Bilancio
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAnnoBilancio();

    /**
     * Anno Bilancio
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAnnoBilancio(java.lang.String value);

}
