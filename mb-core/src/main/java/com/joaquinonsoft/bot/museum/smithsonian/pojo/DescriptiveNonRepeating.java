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
package com.joaquinonsoft.bot.museum.smithsonian.pojo;

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
    "record_ID",
    "online_media",
    "unit_code",
    "title_sort",
    "guid",
    "record_link",
    "title",
    "metadata_usage",
    "data_source"
})
public class DescriptiveNonRepeating {

    @JsonProperty("record_ID")
    private String recordID;
    @JsonProperty("online_media")
    private OnlineMedia onlineMedia;
    @JsonProperty("unit_code")
    private String unitCode;
    @JsonProperty("title_sort")
    private String titleSort;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("record_link")
    private String recordLink;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("metadata_usage")
    private MetadataUsage metadataUsage;
    @JsonProperty("data_source")
    private String dataSource;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("record_ID")
    public String getRecordID() {
        return recordID;
    }

    @JsonProperty("record_ID")
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    @JsonProperty("online_media")
    public OnlineMedia getOnlineMedia() {
        return onlineMedia;
    }

    @JsonProperty("online_media")
    public void setOnlineMedia(OnlineMedia onlineMedia) {
        this.onlineMedia = onlineMedia;
    }

    @JsonProperty("unit_code")
    public String getUnitCode() {
        return unitCode;
    }

    @JsonProperty("unit_code")
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @JsonProperty("title_sort")
    public String getTitleSort() {
        return titleSort;
    }

    @JsonProperty("title_sort")
    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("record_link")
    public String getRecordLink() {
        return recordLink;
    }

    @JsonProperty("record_link")
    public void setRecordLink(String recordLink) {
        this.recordLink = recordLink;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("metadata_usage")
    public MetadataUsage getMetadataUsage() {
        return metadataUsage;
    }

    @JsonProperty("metadata_usage")
    public void setMetadataUsage(MetadataUsage metadataUsage) {
        this.metadataUsage = metadataUsage;
    }

    @JsonProperty("data_source")
    public String getDataSource() {
        return dataSource;
    }

    @JsonProperty("data_source")
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
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
