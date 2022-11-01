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
    "_primary_thumbnail",
    "_iiif_image_base_url",
    "_iiif_presentation_url",
    "imageResolution"
})
public class Images {

    @JsonProperty("_primary_thumbnail")
    private String primaryThumbnail;
    @JsonProperty("_iiif_image_base_url")
    private String iiifImageBaseUrl;
    @JsonProperty("_iiif_presentation_url")
    private String iiifPresentationUrl;
    @JsonProperty("imageResolution")
    private String imageResolution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_primary_thumbnail")
    public String getPrimaryThumbnail() {
        return primaryThumbnail;
    }

    @JsonProperty("_primary_thumbnail")
    public void setPrimaryThumbnail(String primaryThumbnail) {
        this.primaryThumbnail = primaryThumbnail;
    }

    @JsonProperty("_iiif_image_base_url")
    public String getIiifImageBaseUrl() {
        return iiifImageBaseUrl;
    }

    @JsonProperty("_iiif_image_base_url")
    public void setIiifImageBaseUrl(String iiifImageBaseUrl) {
        this.iiifImageBaseUrl = iiifImageBaseUrl;
    }

    @JsonProperty("_iiif_presentation_url")
    public String getIiifPresentationUrl() {
        return iiifPresentationUrl;
    }

    @JsonProperty("_iiif_presentation_url")
    public void setIiifPresentationUrl(String iiifPresentationUrl) {
        this.iiifPresentationUrl = iiifPresentationUrl;
    }

    @JsonProperty("imageResolution")
    public String getImageResolution() {
        return imageResolution;
    }

    @JsonProperty("imageResolution")
    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
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
