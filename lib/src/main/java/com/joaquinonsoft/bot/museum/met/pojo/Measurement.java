
package com.joaquinonsoft.bot.museum.met.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "elementName",
    "elementDescription",
    "elementMeasurements"
})
//@Generated("jsonschema2pojo")
public class Measurement implements Serializable
{

    @JsonProperty("elementName")
    private String elementName;
    @JsonProperty("elementDescription")
    private Object elementDescription;
    @JsonProperty("elementMeasurements")
    private ElementMeasurements elementMeasurements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8291849568446365980L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Measurement() {
    }

    /**
     * 
     * @param elementMeasurements
     * @param elementDescription
     * @param elementName
     */
    public Measurement(String elementName, Object elementDescription, ElementMeasurements elementMeasurements) {
        super();
        this.elementName = elementName;
        this.elementDescription = elementDescription;
        this.elementMeasurements = elementMeasurements;
    }

    @JsonProperty("elementName")
    public String getElementName() {
        return elementName;
    }

    @JsonProperty("elementName")
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    @JsonProperty("elementDescription")
    public Object getElementDescription() {
        return elementDescription;
    }

    @JsonProperty("elementDescription")
    public void setElementDescription(Object elementDescription) {
        this.elementDescription = elementDescription;
    }

    @JsonProperty("elementMeasurements")
    public ElementMeasurements getElementMeasurements() {
        return elementMeasurements;
    }

    @JsonProperty("elementMeasurements")
    public void setElementMeasurements(ElementMeasurements elementMeasurements) {
        this.elementMeasurements = elementMeasurements;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
