
package com.joaquinonsoft.bot.museum.victoriaandalbert.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "other_terms_record_count",
    "terms"
})
public class Collection {

    @JsonProperty("other_terms_record_count")
    private Integer otherTermsRecordCount;
    @JsonProperty("terms")
    private List<Term__3> terms = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("other_terms_record_count")
    public Integer getOtherTermsRecordCount() {
        return otherTermsRecordCount;
    }

    @JsonProperty("other_terms_record_count")
    public void setOtherTermsRecordCount(Integer otherTermsRecordCount) {
        this.otherTermsRecordCount = otherTermsRecordCount;
    }

    @JsonProperty("terms")
    public List<Term__3> getTerms() {
        return terms;
    }

    @JsonProperty("terms")
    public void setTerms(List<Term__3> terms) {
        this.terms = terms;
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
