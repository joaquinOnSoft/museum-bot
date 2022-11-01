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
    "free",
    "case",
    "shelf",
    "box"
})
public class Detail {

    @JsonProperty("free")
    private String free;
    @JsonProperty("case")
    private String _case;
    @JsonProperty("shelf")
    private String shelf;
    @JsonProperty("box")
    private String box;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("free")
    public String getFree() {
        return free;
    }

    @JsonProperty("free")
    public void setFree(String free) {
        this.free = free;
    }

    @JsonProperty("case")
    public String getCase() {
        return _case;
    }

    @JsonProperty("case")
    public void setCase(String _case) {
        this._case = _case;
    }

    @JsonProperty("shelf")
    public String getShelf() {
        return shelf;
    }

    @JsonProperty("shelf")
    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @JsonProperty("box")
    public String getBox() {
        return box;
    }

    @JsonProperty("box")
    public void setBox(String box) {
        this.box = box;
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
