/**   
 *  (C) Copyright 2022 joaquinonsoft.com and others.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   Contributors:
 *     Joaquín Garzón - initial implementation
 *
 */
package com.joaquinonsoft.bot.museum.victoriaandalbert.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "record_count",
    "record_count_exact",
    "parameters",
    "page_size",
    "pages",
    "page",
    "image_count"
})
public class Info {

    @JsonProperty("version")
    private String version;
    @JsonProperty("record_count")
    private Integer recordCount;
    @JsonProperty("record_count_exact")
    private Boolean recordCountExact;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("image_count")
    private Integer imageCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("record_count")
    public Integer getRecordCount() {
        return recordCount;
    }

    @JsonProperty("record_count")
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    @JsonProperty("record_count_exact")
    public Boolean getRecordCountExact() {
        return recordCountExact;
    }

    @JsonProperty("record_count_exact")
    public void setRecordCountExact(Boolean recordCountExact) {
        this.recordCountExact = recordCountExact;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("image_count")
    public Integer getImageCount() {
        return imageCount;
    }

    @JsonProperty("image_count")
    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
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
