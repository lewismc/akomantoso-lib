//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.12 at 12:10:39 PM EAT 
//


package org.oasis_open.docs.legaldocml.ns.akn._3_0.csd06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="placementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="side"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="inline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "placementType")
@XmlEnum
public enum PlacementType {

    @XmlEnumValue("side")
    SIDE("side"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("inline")
    INLINE("inline");
    private final String value;

    PlacementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacementType fromValue(String v) {
        for (PlacementType c: PlacementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
