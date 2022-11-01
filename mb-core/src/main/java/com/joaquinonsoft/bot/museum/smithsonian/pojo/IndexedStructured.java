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
    "date",
    "object_type",
    "geoLocation",
    "name",
    "topic",
    "place",
    "online_media_type"
})
public class IndexedStructured {

    @JsonProperty("date")
    private List<String> date = null;
    @JsonProperty("object_type")
    private List<String> objectType = null;
    @JsonProperty("geoLocation")
    private List<GeoLocation> geoLocation = null;
    @JsonProperty("name")
    private List<String> name = null;
    @JsonProperty("topic")
    private List<String> topic = null;
    @JsonProperty("place")
    private List<String> place = null;
    @JsonProperty("online_media_type")
    private List<String> onlineMediaType = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public List<String> getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(List<String> date) {
        this.date = date;
    }

    @JsonProperty("object_type")
    public List<String> getObjectType() {
        return objectType;
    }

    @JsonProperty("object_type")
    public void setObjectType(List<String> objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("geoLocation")
    public List<GeoLocation> getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("geoLocation")
    public void setGeoLocation(List<GeoLocation> geoLocation) {
        this.geoLocation = geoLocation;
    }

    @JsonProperty("name")
    public List<String> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    @JsonProperty("topic")
    public List<String> getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    @JsonProperty("place")
    public List<String> getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(List<String> place) {
        this.place = place;
    }

    @JsonProperty("online_media_type")
    public List<String> getOnlineMediaType() {
        return onlineMediaType;
    }

    @JsonProperty("online_media_type")
    public void setOnlineMediaType(List<String> onlineMediaType) {
        this.onlineMediaType = onlineMediaType;
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
