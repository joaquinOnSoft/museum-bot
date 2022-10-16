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
    "L1",
    "L2",
    "L3"
})
public class GeoLocation {

    @JsonProperty("L1")
    private L1 l1;
    @JsonProperty("L2")
    private L2 l2;
    @JsonProperty("L3")
    private L3 l3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("L1")
    public L1 getL1() {
        return l1;
    }

    @JsonProperty("L1")
    public void setL1(L1 l1) {
        this.l1 = l1;
    }

    @JsonProperty("L2")
    public L2 getL2() {
        return l2;
    }

    @JsonProperty("L2")
    public void setL2(L2 l2) {
        this.l2 = l2;
    }

    @JsonProperty("L3")
    public L3 getL3() {
        return l3;
    }

    @JsonProperty("L3")
    public void setL3(L3 l3) {
        this.l3 = l3;
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
