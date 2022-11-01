
package com.joaquinonsoft.bot.museum.nhm.pojo;

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
    "affiliation",
    "author",
    "author_email",
    "contributors",
    "creator_user_id",
    "dataset_category",
    "id",
    "isopen",
    "license_id",
    "license_title",
    "license_url",
    "maintainer",
    "maintainer_email",
    "metadata_created",
    "metadata_modified",
    "name",
    "notes",
    "num_resources",
    "num_tags",
    "organization",
    "owner_org",
    "private",
    "spatial",
    "state",
    "temporal_extent",
    "title",
    "type",
    "update_frequency",
    "url",
    "version",
    "resources",
    "tags",
    "groups",
    "relationships_as_subject",
    "relationships_as_object",
    "doi",
    "doi_status",
    "domain",
    "doi_date_published",
    "doi_publisher"
})
public class Result {

    @JsonProperty("affiliation")
    private String affiliation;
    @JsonProperty("author")
    private String author;
    @JsonProperty("author_email")
    private Object authorEmail;
    @JsonProperty("contributors")
    private String contributors;
    @JsonProperty("creator_user_id")
    private String creatorUserId;
    @JsonProperty("dataset_category")
    private List<String> datasetCategory = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("isopen")
    private Boolean isopen;
    @JsonProperty("license_id")
    private String licenseId;
    @JsonProperty("license_title")
    private String licenseTitle;
    @JsonProperty("license_url")
    private String licenseUrl;
    @JsonProperty("maintainer")
    private Object maintainer;
    @JsonProperty("maintainer_email")
    private Object maintainerEmail;
    @JsonProperty("metadata_created")
    private String metadataCreated;
    @JsonProperty("metadata_modified")
    private String metadataModified;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("num_resources")
    private Integer numResources;
    @JsonProperty("num_tags")
    private Integer numTags;
    @JsonProperty("organization")
    private Organization organization;
    @JsonProperty("owner_org")
    private String ownerOrg;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("spatial")
    private String spatial;
    @JsonProperty("state")
    private String state;
    @JsonProperty("temporal_extent")
    private String temporalExtent;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
    @JsonProperty("update_frequency")
    private String updateFrequency;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("version")
    private Object version;
    @JsonProperty("resources")
    private List<Resource> resources = null;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("groups")
    private List<Object> groups = null;
    @JsonProperty("relationships_as_subject")
    private List<Object> relationshipsAsSubject = null;
    @JsonProperty("relationships_as_object")
    private List<Object> relationshipsAsObject = null;
    @JsonProperty("doi")
    private String doi;
    @JsonProperty("doi_status")
    private Boolean doiStatus;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("doi_date_published")
    private String doiDatePublished;
    @JsonProperty("doi_publisher")
    private String doiPublisher;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("affiliation")
    public String getAffiliation() {
        return affiliation;
    }

    @JsonProperty("affiliation")
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("author_email")
    public Object getAuthorEmail() {
        return authorEmail;
    }

    @JsonProperty("author_email")
    public void setAuthorEmail(Object authorEmail) {
        this.authorEmail = authorEmail;
    }

    @JsonProperty("contributors")
    public String getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("creator_user_id")
    public String getCreatorUserId() {
        return creatorUserId;
    }

    @JsonProperty("creator_user_id")
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    @JsonProperty("dataset_category")
    public List<String> getDatasetCategory() {
        return datasetCategory;
    }

    @JsonProperty("dataset_category")
    public void setDatasetCategory(List<String> datasetCategory) {
        this.datasetCategory = datasetCategory;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("isopen")
    public Boolean getIsopen() {
        return isopen;
    }

    @JsonProperty("isopen")
    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    @JsonProperty("license_id")
    public String getLicenseId() {
        return licenseId;
    }

    @JsonProperty("license_id")
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @JsonProperty("license_title")
    public String getLicenseTitle() {
        return licenseTitle;
    }

    @JsonProperty("license_title")
    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    @JsonProperty("license_url")
    public String getLicenseUrl() {
        return licenseUrl;
    }

    @JsonProperty("license_url")
    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    @JsonProperty("maintainer")
    public Object getMaintainer() {
        return maintainer;
    }

    @JsonProperty("maintainer")
    public void setMaintainer(Object maintainer) {
        this.maintainer = maintainer;
    }

    @JsonProperty("maintainer_email")
    public Object getMaintainerEmail() {
        return maintainerEmail;
    }

    @JsonProperty("maintainer_email")
    public void setMaintainerEmail(Object maintainerEmail) {
        this.maintainerEmail = maintainerEmail;
    }

    @JsonProperty("metadata_created")
    public String getMetadataCreated() {
        return metadataCreated;
    }

    @JsonProperty("metadata_created")
    public void setMetadataCreated(String metadataCreated) {
        this.metadataCreated = metadataCreated;
    }

    @JsonProperty("metadata_modified")
    public String getMetadataModified() {
        return metadataModified;
    }

    @JsonProperty("metadata_modified")
    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("num_resources")
    public Integer getNumResources() {
        return numResources;
    }

    @JsonProperty("num_resources")
    public void setNumResources(Integer numResources) {
        this.numResources = numResources;
    }

    @JsonProperty("num_tags")
    public Integer getNumTags() {
        return numTags;
    }

    @JsonProperty("num_tags")
    public void setNumTags(Integer numTags) {
        this.numTags = numTags;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @JsonProperty("owner_org")
    public String getOwnerOrg() {
        return ownerOrg;
    }

    @JsonProperty("owner_org")
    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("spatial")
    public String getSpatial() {
        return spatial;
    }

    @JsonProperty("spatial")
    public void setSpatial(String spatial) {
        this.spatial = spatial;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("temporal_extent")
    public String getTemporalExtent() {
        return temporalExtent;
    }

    @JsonProperty("temporal_extent")
    public void setTemporalExtent(String temporalExtent) {
        this.temporalExtent = temporalExtent;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("update_frequency")
    public String getUpdateFrequency() {
        return updateFrequency;
    }

    @JsonProperty("update_frequency")
    public void setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("version")
    public Object getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Object version) {
        this.version = version;
    }

    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    @JsonProperty("relationships_as_subject")
    public List<Object> getRelationshipsAsSubject() {
        return relationshipsAsSubject;
    }

    @JsonProperty("relationships_as_subject")
    public void setRelationshipsAsSubject(List<Object> relationshipsAsSubject) {
        this.relationshipsAsSubject = relationshipsAsSubject;
    }

    @JsonProperty("relationships_as_object")
    public List<Object> getRelationshipsAsObject() {
        return relationshipsAsObject;
    }

    @JsonProperty("relationships_as_object")
    public void setRelationshipsAsObject(List<Object> relationshipsAsObject) {
        this.relationshipsAsObject = relationshipsAsObject;
    }

    @JsonProperty("doi")
    public String getDoi() {
        return doi;
    }

    @JsonProperty("doi")
    public void setDoi(String doi) {
        this.doi = doi;
    }

    @JsonProperty("doi_status")
    public Boolean getDoiStatus() {
        return doiStatus;
    }

    @JsonProperty("doi_status")
    public void setDoiStatus(Boolean doiStatus) {
        this.doiStatus = doiStatus;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("doi_date_published")
    public String getDoiDatePublished() {
        return doiDatePublished;
    }

    @JsonProperty("doi_date_published")
    public void setDoiDatePublished(String doiDatePublished) {
        this.doiDatePublished = doiDatePublished;
    }

    @JsonProperty("doi_publisher")
    public String getDoiPublisher() {
        return doiPublisher;
    }

    @JsonProperty("doi_publisher")
    public void setDoiPublisher(String doiPublisher) {
        this.doiPublisher = doiPublisher;
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
