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
    "category",
    "person",
    "organisation",
    "collection",
    "gallery",
    "style",
    "place",
    "object_type",
    "technique",
    "material"
})
public class Clusters {

    @JsonProperty("category")
    private Category category;
    @JsonProperty("person")
    private Person person;
    @JsonProperty("organisation")
    private Organisation organisation;
    @JsonProperty("collection")
    private Collection collection;
    @JsonProperty("gallery")
    private Gallery gallery;
    @JsonProperty("style")
    private Style style;
    @JsonProperty("place")
    private Place place;
    @JsonProperty("object_type")
    private ObjectType objectType;
    @JsonProperty("technique")
    private Technique technique;
    @JsonProperty("material")
    private Material material;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonProperty("organisation")
    public Organisation getOrganisation() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    @JsonProperty("collection")
    public Collection getCollection() {
        return collection;
    }

    @JsonProperty("collection")
    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    @JsonProperty("gallery")
    public Gallery getGallery() {
        return gallery;
    }

    @JsonProperty("gallery")
    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }

    @JsonProperty("place")
    public Place getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Place place) {
        this.place = place;
    }

    @JsonProperty("object_type")
    public ObjectType getObjectType() {
        return objectType;
    }

    @JsonProperty("object_type")
    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("technique")
    public Technique getTechnique() {
        return technique;
    }

    @JsonProperty("technique")
    public void setTechnique(Technique technique) {
        this.technique = technique;
    }

    @JsonProperty("material")
    public Material getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(Material material) {
        this.material = material;
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
