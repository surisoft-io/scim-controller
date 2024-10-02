package io.surisoft.scim.schema;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.surisoft.scim.annotation.ScimAttribute;


import java.io.Serializable;
import java.util.Calendar;

/**
 * Defines the structure of the meta attribute for all SCIM resources as defined
 * by section 3.1 of the SCIM schema specification. See
 * <a href="https://tools.ietf.org/html/draft-ietf-scim-core-schema-17#section-3.1">...</a> for more
 * details.
 */
//@XmlType(name = "meta")
//@XmlAccessorType(XmlAccessType.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meta implements Serializable {
  //@XmlElement
  //@Size(min = 1)
  //@ScimAttribute(mutability = Schema.Attribute.Mutability.READ_ONLY, caseExact = true, description = "The name of the resource type of the resource.")
  private String resourceType;
  
  //@XmlElement
  //@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
  //@ScimAttribute(mutability = Schema.Attribute.Mutability.READ_ONLY, description = "The DateTime that the resource was added to the service provider.")
  private Calendar created;
  
  //@XmlElement
  //@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
  //@ScimAttribute(mutability = Schema.Attribute.Mutability.READ_ONLY, description = "The most recent DateTime that the details of this resource were updated at the service provider.")
  private Calendar lastModified;
  
  //@XmlElement
  @ScimAttribute(mutability = Schema.Attribute.Mutability.READ_ONLY, description = "The URI of the resource being returned.")
  private String location;
  
  //@XmlElement
  @ScimAttribute(mutability = Schema.Attribute.Mutability.READ_ONLY, description = "The version of the resource being returned.  This value must be the same as the entity-tag (ETag) HTTP response header")
  private String version;

  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public Calendar getCreated() {
    return created;
  }

  public void setCreated(Calendar created) {
    this.created = created;
  }

  public Calendar getLastModified() {
    return lastModified;
  }

  public void setLastModified(Calendar lastModified) {
    this.lastModified = lastModified;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
