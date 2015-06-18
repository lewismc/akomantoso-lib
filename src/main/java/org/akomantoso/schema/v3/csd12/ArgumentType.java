//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;argumentType&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the complex type argumentType defines the empty content model and the list of attributes for metadata elements in the analysis section&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for argumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="argumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}anyOtherType">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}modifiers"/>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}pos"/>
 *       &lt;attribute name="upTo" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "argumentType")
public class ArgumentType
    extends AnyOtherType
{

    @XmlAttribute(name = "upTo")
    @XmlSchemaType(name = "anyURI")
    protected String upTo;
    @XmlAttribute(name = "exclusion")
    protected Boolean exclusion;
    @XmlAttribute(name = "incomplete")
    protected Boolean incomplete;
    @XmlAttribute(name = "pos")
    protected PosType pos;

    /**
     * Gets the value of the upTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpTo() {
        return upTo;
    }

    /**
     * Sets the value of the upTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpTo(String value) {
        this.upTo = value;
    }

    /**
     * Gets the value of the exclusion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusion() {
        return exclusion;
    }

    /**
     * Sets the value of the exclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusion(Boolean value) {
        this.exclusion = value;
    }

    /**
     * Gets the value of the incomplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncomplete() {
        return incomplete;
    }

    /**
     * Sets the value of the incomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncomplete(Boolean value) {
        this.incomplete = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link PosType }
     *     
     */
    public PosType getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosType }
     *     
     */
    public void setPos(PosType value) {
        this.pos = value;
    }

}