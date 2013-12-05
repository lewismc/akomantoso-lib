//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:37 PM EAT 
//


package org.akomantoso.schema.v2;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.akomantoso.org/2.0}documentType"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}idreq"/>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}core"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amendmentList",
    "officialGazette",
    "documentCollection",
    "act",
    "bill",
    "debateReport",
    "debate",
    "amendment",
    "judgement",
    "fragment",
    "doc"
})
@XmlRootElement(name = "component")
public class Component {

    protected CollectionStructure amendmentList;
    protected CollectionStructure officialGazette;
    protected DocumentCollection documentCollection;
    protected HierarchicalStructure act;
    protected HierarchicalStructure bill;
    protected OpenStructure debateReport;
    protected DebateStructure debate;
    protected AmendmentStructure amendment;
    protected JudgementStructure judgement;
    protected FragmentStructure fragment;
    protected OpenStructure doc;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "evolvingId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String evolvingId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the amendmentList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getAmendmentList() {
        return amendmentList;
    }

    /**
     * Sets the value of the amendmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setAmendmentList(CollectionStructure value) {
        this.amendmentList = value;
    }

    /**
     * Gets the value of the officialGazette property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getOfficialGazette() {
        return officialGazette;
    }

    /**
     * Sets the value of the officialGazette property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setOfficialGazette(CollectionStructure value) {
        this.officialGazette = value;
    }

    /**
     * Gets the value of the documentCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCollection }
     *     
     */
    public DocumentCollection getDocumentCollection() {
        return documentCollection;
    }

    /**
     * Sets the value of the documentCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCollection }
     *     
     */
    public void setDocumentCollection(DocumentCollection value) {
        this.documentCollection = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setAct(HierarchicalStructure value) {
        this.act = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setBill(HierarchicalStructure value) {
        this.bill = value;
    }

    /**
     * Gets the value of the debateReport property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDebateReport() {
        return debateReport;
    }

    /**
     * Sets the value of the debateReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDebateReport(OpenStructure value) {
        this.debateReport = value;
    }

    /**
     * Gets the value of the debate property.
     * 
     * @return
     *     possible object is
     *     {@link DebateStructure }
     *     
     */
    public DebateStructure getDebate() {
        return debate;
    }

    /**
     * Sets the value of the debate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebateStructure }
     *     
     */
    public void setDebate(DebateStructure value) {
        this.debate = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentStructure }
     *     
     */
    public AmendmentStructure getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentStructure }
     *     
     */
    public void setAmendment(AmendmentStructure value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the judgement property.
     * 
     * @return
     *     possible object is
     *     {@link JudgementStructure }
     *     
     */
    public JudgementStructure getJudgement() {
        return judgement;
    }

    /**
     * Sets the value of the judgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgementStructure }
     *     
     */
    public void setJudgement(JudgementStructure value) {
        this.judgement = value;
    }

    /**
     * Gets the value of the fragment property.
     * 
     * @return
     *     possible object is
     *     {@link FragmentStructure }
     *     
     */
    public FragmentStructure getFragment() {
        return fragment;
    }

    /**
     * Sets the value of the fragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FragmentStructure }
     *     
     */
    public void setFragment(FragmentStructure value) {
        this.fragment = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDoc(OpenStructure value) {
        this.doc = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the evolvingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvolvingId() {
        return evolvingId;
    }

    /**
     * Sets the value of the evolvingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvolvingId(String value) {
        this.evolvingId = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}