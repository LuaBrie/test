//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-01/24/2006 06:08 PM(kohsuke)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.17 at 12:28:37 PM CET 
//


package it.latraccia.entity.sic.risposta;


/**
 * Java content class for MessaggioRisposta_Types complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/simonebrunox/Desktop/SIC/RispostaSIC.xsd line 5)
 * <p>
 * <pre>
 * &lt;complexType name="MessaggioRisposta_Types">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Intestazione" type="{}Intestazione_Types"/>
 *         &lt;choice>
 *           &lt;element name="Successo" type="{}Successo_Types"/>
 *           &lt;element name="Eccezione" type="{}Eccezione_Types"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface MessaggioRispostaTypes {


    /**
     * Header contenente informazioni su mittente, destinatario e tipo di richiesta
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.sic.risposta.IntestazioneTypes}
     */
    it.latraccia.entity.sic.risposta.IntestazioneTypes getIntestazione();

    /**
     * Header contenente informazioni su mittente, destinatario e tipo di richiesta
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.sic.risposta.IntestazioneTypes}
     */
    void setIntestazione(it.latraccia.entity.sic.risposta.IntestazioneTypes value);

    /**
     * Contiene tutti i tipi di ritorno in caso di successo
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.sic.risposta.SuccessoTypes}
     */
    it.latraccia.entity.sic.risposta.SuccessoTypes getSuccesso();

    /**
     * Contiene tutti i tipi di ritorno in caso di successo
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.sic.risposta.SuccessoTypes}
     */
    void setSuccesso(it.latraccia.entity.sic.risposta.SuccessoTypes value);

    /**
     * Rappresenta un generico messaggio di errore
     * 
     * @return
     *     possible object is
     *     {@link it.latraccia.entity.sic.risposta.EccezioneTypes}
     */
    it.latraccia.entity.sic.risposta.EccezioneTypes getEccezione();

    /**
     * Rappresenta un generico messaggio di errore
     * 
     * @param value
     *     allowed object is
     *     {@link it.latraccia.entity.sic.risposta.EccezioneTypes}
     */
    void setEccezione(it.latraccia.entity.sic.risposta.EccezioneTypes value);

}
