
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
    "constituentID",
    "role",
    "name",
    "constituentULAN_URL",
    "constituentWikidata_URL",
    "gender"
})
//@Generated("jsonschema2pojo")
public class Constituent implements Serializable
{

    @JsonProperty("constituentID")
    private Integer constituentID;
    @JsonProperty("role")
    private String role;
    @JsonProperty("name")
    private String name;
    @JsonProperty("constituentULAN_URL")
    private String constituentULANURL;
    @JsonProperty("constituentWikidata_URL")
    private String constituentWikidataURL;
    @JsonProperty("gender")
    private String gender;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5296795845954360201L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Constituent() {
    }

    /**
     * 
     * @param constituentID
     * @param constituentULANURL
     * @param constituentWikidataURL
     * @param role
     * @param gender
     * @param name
     */
    public Constituent(Integer constituentID, String role, String name, String constituentULANURL, String constituentWikidataURL, String gender) {
        super();
        this.constituentID = constituentID;
        this.role = role;
        this.name = name;
        this.constituentULANURL = constituentULANURL;
        this.constituentWikidataURL = constituentWikidataURL;
        this.gender = gender;
    }

    @JsonProperty("constituentID")
    public Integer getConstituentID() {
        return constituentID;
    }

    @JsonProperty("constituentID")
    public void setConstituentID(Integer constituentID) {
        this.constituentID = constituentID;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("constituentULAN_URL")
    public String getConstituentULANURL() {
        return constituentULANURL;
    }

    @JsonProperty("constituentULAN_URL")
    public void setConstituentULANURL(String constituentULANURL) {
        this.constituentULANURL = constituentULANURL;
    }

    @JsonProperty("constituentWikidata_URL")
    public String getConstituentWikidataURL() {
        return constituentWikidataURL;
    }

    @JsonProperty("constituentWikidata_URL")
    public void setConstituentWikidataURL(String constituentWikidataURL) {
        this.constituentWikidataURL = constituentWikidataURL;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
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
