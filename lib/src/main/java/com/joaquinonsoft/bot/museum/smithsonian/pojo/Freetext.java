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
    "setName",
    "date",
    "identifier",
    "creditLine",
    "name",
    "topic",
    "physicalDescription",
    "dataSource",
    "objectRights",
    "objectType"
})
public class Freetext {

    @JsonProperty("setName")
    private List<SetName> setName = null;
    @JsonProperty("date")
    private List<Date> date = null;
    @JsonProperty("identifier")
    private List<Identifier> identifier = null;
    @JsonProperty("creditLine")
    private List<CreditLine> creditLine = null;
    @JsonProperty("name")
    private List<Name> name = null;
    @JsonProperty("topic")
    private List<Topic> topic = null;
    @JsonProperty("physicalDescription")
    private List<PhysicalDescription> physicalDescription = null;
    @JsonProperty("dataSource")
    private List<DataSource> dataSource = null;
    @JsonProperty("objectRights")
    private List<ObjectRight> objectRights = null;
    @JsonProperty("objectType")
    private List<ObjectType> objectType = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("setName")
    public List<SetName> getSetName() {
        return setName;
    }

    @JsonProperty("setName")
    public void setSetName(List<SetName> setName) {
        this.setName = setName;
    }

    @JsonProperty("date")
    public List<Date> getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(List<Date> date) {
        this.date = date;
    }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("creditLine")
    public List<CreditLine> getCreditLine() {
        return creditLine;
    }

    @JsonProperty("creditLine")
    public void setCreditLine(List<CreditLine> creditLine) {
        this.creditLine = creditLine;
    }

    @JsonProperty("name")
    public List<Name> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<Name> name) {
        this.name = name;
    }

    @JsonProperty("topic")
    public List<Topic> getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }

    @JsonProperty("physicalDescription")
    public List<PhysicalDescription> getPhysicalDescription() {
        return physicalDescription;
    }

    @JsonProperty("physicalDescription")
    public void setPhysicalDescription(List<PhysicalDescription> physicalDescription) {
        this.physicalDescription = physicalDescription;
    }

    @JsonProperty("dataSource")
    public List<DataSource> getDataSource() {
        return dataSource;
    }

    @JsonProperty("dataSource")
    public void setDataSource(List<DataSource> dataSource) {
        this.dataSource = dataSource;
    }

    @JsonProperty("objectRights")
    public List<ObjectRight> getObjectRights() {
        return objectRights;
    }

    @JsonProperty("objectRights")
    public void setObjectRights(List<ObjectRight> objectRights) {
        this.objectRights = objectRights;
    }

    @JsonProperty("objectType")
    public List<ObjectType> getObjectType() {
        return objectType;
    }

    @JsonProperty("objectType")
    public void setObjectType(List<ObjectType> objectType) {
        this.objectType = objectType;
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
