//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.28 at 01:25:27 PM CET 
//


package it.latraccia.entity.anasic.richiesta;


/**
 * Java content class for InterrogaComuni_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/JAXB/XSD/Anagraf/RichiestaAnaSIC.xsd line 101)
 * <p>
 * <pre>
 * &lt;complexType name="InterrogaComuni_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeComune" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InterrogaComuniTypes {


    /**
     * Nome o parte del nome del Comune da ricercare
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNomeComune();

    /**
     * Nome o parte del nome del Comune da ricercare
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNomeComune(java.lang.String value);

}
