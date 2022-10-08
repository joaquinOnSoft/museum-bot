
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
    "Height",
    "Width"
})
//@Generated("jsonschema2pojo")
public class ElementMeasurements implements Serializable
{

    @JsonProperty("Height")
    private Double height;
    @JsonProperty("Width")
    private Double width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2901676814497565965L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ElementMeasurements() {
    }

    /**
     * 
     * @param width
     * @param height
     */
    public ElementMeasurements(Double height, Double width) {
        super();
        this.height = height;
        this.width = width;
    }

    @JsonProperty("Height")
    public Double getHeight() {
        return height;
    }

    @JsonProperty("Height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("Width")
    public Double getWidth() {
        return width;
    }

    @JsonProperty("Width")
    public void setWidth(Double width) {
        this.width = width;
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
