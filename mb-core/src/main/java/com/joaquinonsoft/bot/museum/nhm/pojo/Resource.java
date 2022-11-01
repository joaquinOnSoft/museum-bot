
package com.joaquinonsoft.bot.museum.nhm.pojo;

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
    "cache_last_updated",
    "cache_url",
    "created",
    "datastore_active",
    "description",
    "format",
    "hash",
    "id",
    "last_modified",
    "metadata_modified",
    "mimetype",
    "mimetype_inner",
    "name",
    "package_id",
    "position",
    "resource_type",
    "size",
    "state",
    "url",
    "url_type"
})
public class Resource {

    @JsonProperty("cache_last_updated")
    private Object cacheLastUpdated;
    @JsonProperty("cache_url")
    private Object cacheUrl;
    @JsonProperty("created")
    private String created;
    @JsonProperty("datastore_active")
    private Boolean datastoreActive;
    @JsonProperty("description")
    private String description;
    @JsonProperty("format")
    private String format;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("id")
    private String id;
    @JsonProperty("last_modified")
    private Object lastModified;
    @JsonProperty("metadata_modified")
    private String metadataModified;
    @JsonProperty("mimetype")
    private Object mimetype;
    @JsonProperty("mimetype_inner")
    private Object mimetypeInner;
    @JsonProperty("name")
    private String name;
    @JsonProperty("package_id")
    private String packageId;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("resource_type")
    private Object resourceType;
    @JsonProperty("size")
    private Object size;
    @JsonProperty("state")
    private String state;
    @JsonProperty("url")
    private String url;
    @JsonProperty("url_type")
    private Object urlType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cache_last_updated")
    public Object getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    @JsonProperty("cache_last_updated")
    public void setCacheLastUpdated(Object cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    @JsonProperty("cache_url")
    public Object getCacheUrl() {
        return cacheUrl;
    }

    @JsonProperty("cache_url")
    public void setCacheUrl(Object cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("datastore_active")
    public Boolean getDatastoreActive() {
        return datastoreActive;
    }

    @JsonProperty("datastore_active")
    public void setDatastoreActive(Boolean datastoreActive) {
        this.datastoreActive = datastoreActive;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("last_modified")
    public Object getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(Object lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("metadata_modified")
    public String getMetadataModified() {
        return metadataModified;
    }

    @JsonProperty("metadata_modified")
    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    @JsonProperty("mimetype")
    public Object getMimetype() {
        return mimetype;
    }

    @JsonProperty("mimetype")
    public void setMimetype(Object mimetype) {
        this.mimetype = mimetype;
    }

    @JsonProperty("mimetype_inner")
    public Object getMimetypeInner() {
        return mimetypeInner;
    }

    @JsonProperty("mimetype_inner")
    public void setMimetypeInner(Object mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("package_id")
    public String getPackageId() {
        return packageId;
    }

    @JsonProperty("package_id")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("resource_type")
    public Object getResourceType() {
        return resourceType;
    }

    @JsonProperty("resource_type")
    public void setResourceType(Object resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("size")
    public Object getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Object size) {
        this.size = size;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("url_type")
    public Object getUrlType() {
        return urlType;
    }

    @JsonProperty("url_type")
    public void setUrlType(Object urlType) {
        this.urlType = urlType;
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
