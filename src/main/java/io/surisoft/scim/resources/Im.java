package io.surisoft.scim.resources;

import io.surisoft.scim.annotation.ScimAttribute;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;

/**
 * Scim core schema, <a href="https://tools.ietf.org/html/rfc7643#section-4.1.2>section 4.1.2</a>
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class Im implements Serializable, TypedAttribute {
  @XmlElement(nillable=true)
  @ScimAttribute(canonicalValueList={"aim", "qtalk", "icq", "xmpp", "msn", "skype", "qq", "yahoo"}, description="A label indicating the attribute's function; e.g., 'aim', 'gtalk', 'mobile' etc.")
  private String type;
  
  @XmlElement
  @ScimAttribute(description="Instant messaging address for the User.")
  private String value;
  
  @XmlElement
  @ScimAttribute(description="A human readable name, primarily used for display purposes. READ-ONLY.")
  private String display;
  
  @XmlElement
  @ScimAttribute(description="A Boolean value indicating the 'primary' or preferred attribute value for this attribute, e.g. the preferred mailing address or primary e-mail address. The primary attribute value 'true' MUST appear no more than once.")
  private Boolean primary = false;

  @Override
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }
}
