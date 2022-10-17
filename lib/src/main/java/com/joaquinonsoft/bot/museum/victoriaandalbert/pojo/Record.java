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
    "systemNumber",
    "accessionNumber",
    "objectType",
    "_currentLocation",
    "_primaryTitle",
    "_primaryMaker",
    "_primaryImageId",
    "_primaryDate",
    "_primaryPlace",
    "_warningTypes",
    "_images"
})
public class Record {

    @JsonProperty("systemNumber")
    private String systemNumber;
    @JsonProperty("accessionNumber")
    private String accessionNumber;
    @JsonProperty("objectType")
    private String objectType;
    @JsonProperty("_currentLocation")
    private CurrentLocation currentLocation;
    @JsonProperty("_primaryTitle")
    private String primaryTitle;
    @JsonProperty("_primaryMaker")
    private PrimaryMaker primaryMaker;
    @JsonProperty("_primaryImageId")
    private String primaryImageId;
    @JsonProperty("_primaryDate")
    private String primaryDate;
    @JsonProperty("_primaryPlace")
    private String primaryPlace;
    @JsonProperty("_warningTypes")
    private List<Object> warningTypes = null;
    @JsonProperty("_images")
    private Images images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("systemNumber")
    public String getSystemNumber() {
        return systemNumber;
    }

    @JsonProperty("systemNumber")
    public void setSystemNumber(String systemNumber) {
        this.systemNumber = systemNumber;
    }

    @JsonProperty("accessionNumber")
    public String getAccessionNumber() {
        return accessionNumber;
    }

    @JsonProperty("accessionNumber")
    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    @JsonProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("objectType")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("_currentLocation")
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    @JsonProperty("_currentLocation")
    public void setCurrentLocation(CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    @JsonProperty("_primaryTitle")
    public String getPrimaryTitle() {
        return primaryTitle;
    }

    @JsonProperty("_primaryTitle")
    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    @JsonProperty("_primaryMaker")
    public PrimaryMaker getPrimaryMaker() {
        return primaryMaker;
    }

    @JsonProperty("_primaryMaker")
    public void setPrimaryMaker(PrimaryMaker primaryMaker) {
        this.primaryMaker = primaryMaker;
    }

    @JsonProperty("_primaryImageId")
    public String getPrimaryImageId() {
        return primaryImageId;
    }

    @JsonProperty("_primaryImageId")
    public void setPrimaryImageId(String primaryImageId) {
        this.primaryImageId = primaryImageId;
    }

    @JsonProperty("_primaryDate")
    public String getPrimaryDate() {
        return primaryDate;
    }

    @JsonProperty("_primaryDate")
    public void setPrimaryDate(String primaryDate) {
        this.primaryDate = primaryDate;
    }

    @JsonProperty("_primaryPlace")
    public String getPrimaryPlace() {
        return primaryPlace;
    }

    @JsonProperty("_primaryPlace")
    public void setPrimaryPlace(String primaryPlace) {
        this.primaryPlace = primaryPlace;
    }

    @JsonProperty("_warningTypes")
    public List<Object> getWarningTypes() {
        return warningTypes;
    }

    @JsonProperty("_warningTypes")
    public void setWarningTypes(List<Object> warningTypes) {
        this.warningTypes = warningTypes;
    }

    @JsonProperty("_images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("_images")
    public void setImages(Images images) {
        this.images = images;
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
