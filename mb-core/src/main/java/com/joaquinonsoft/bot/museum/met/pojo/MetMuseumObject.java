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
package com.joaquinonsoft.bot.museum.met.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "objectID",
    "isHighlight",
    "accessionNumber",
    "accessionYear",
    "isPublicDomain",
    "primaryImage",
    "primaryImageSmall",
    "additionalImages",
    "constituents",
    "department",
    "objectName",
    "title",
    "culture",
    "period",
    "dynasty",
    "reign",
    "portfolio",
    "artistRole",
    "artistPrefix",
    "artistDisplayName",
    "artistDisplayBio",
    "artistSuffix",
    "artistAlphaSort",
    "artistNationality",
    "artistBeginDate",
    "artistEndDate",
    "artistGender",
    "artistWikidata_URL",
    "artistULAN_URL",
    "objectDate",
    "objectBeginDate",
    "objectEndDate",
    "medium",
    "dimensions",
    "measurements",
    "creditLine",
    "geographyType",
    "city",
    "state",
    "county",
    "country",
    "region",
    "subregion",
    "locale",
    "locus",
    "excavation",
    "river",
    "classification",
    "rightsAndReproduction",
    "linkResource",
    "metadataDate",
    "repository",
    "objectURL",
    "tags",
    "objectWikidata_URL",
    "isTimelineWork",
    "GalleryNumber"
})
//@Generated("jsonschema2pojo")
public class MetMuseumObject implements Serializable
{

    @JsonProperty("objectID")
    private Integer objectID;
    @JsonProperty("isHighlight")
    private Boolean isHighlight;
    @JsonProperty("accessionNumber")
    private String accessionNumber;
    @JsonProperty("accessionYear")
    private String accessionYear;
    @JsonProperty("isPublicDomain")
    private Boolean isPublicDomain;
    @JsonProperty("primaryImage")
    private String primaryImage;
    @JsonProperty("primaryImageSmall")
    private String primaryImageSmall;
    @JsonProperty("additionalImages")
    private List<Object> additionalImages = null;
    @JsonProperty("constituents")
    private List<Constituent> constituents = null;
    @JsonProperty("department")
    private String department;
    @JsonProperty("objectName")
    private String objectName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("culture")
    private String culture;
    @JsonProperty("period")
    private String period;
    @JsonProperty("dynasty")
    private String dynasty;
    @JsonProperty("reign")
    private String reign;
    @JsonProperty("portfolio")
    private String portfolio;
    @JsonProperty("artistRole")
    private String artistRole;
    @JsonProperty("artistPrefix")
    private String artistPrefix;
    @JsonProperty("artistDisplayName")
    private String artistDisplayName;
    @JsonProperty("artistDisplayBio")
    private String artistDisplayBio;
    @JsonProperty("artistSuffix")
    private String artistSuffix;
    @JsonProperty("artistAlphaSort")
    private String artistAlphaSort;
    @JsonProperty("artistNationality")
    private String artistNationality;
    @JsonProperty("artistBeginDate")
    private String artistBeginDate;
    @JsonProperty("artistEndDate")
    private String artistEndDate;
    @JsonProperty("artistGender")
    private String artistGender;
    @JsonProperty("artistWikidata_URL")
    private String artistWikidataURL;
    @JsonProperty("artistULAN_URL")
    private String artistULANURL;
    @JsonProperty("objectDate")
    private String objectDate;
    @JsonProperty("objectBeginDate")
    private Integer objectBeginDate;
    @JsonProperty("objectEndDate")
    private Integer objectEndDate;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("dimensions")
    private String dimensions;
    @JsonProperty("measurements")
    private List<Measurement> measurements = null;
    @JsonProperty("creditLine")
    private String creditLine;
    @JsonProperty("geographyType")
    private String geographyType;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("county")
    private String county;
    @JsonProperty("country")
    private String country;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("locus")
    private String locus;
    @JsonProperty("excavation")
    private String excavation;
    @JsonProperty("river")
    private String river;
    @JsonProperty("classification")
    private String classification;
    @JsonProperty("rightsAndReproduction")
    private String rightsAndReproduction;
    @JsonProperty("linkResource")
    private String linkResource;
    @JsonProperty("metadataDate")
    private String metadataDate;
    @JsonProperty("repository")
    private String repository;
    @JsonProperty("objectURL")
    private String objectURL;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("objectWikidata_URL")
    private String objectWikidataURL;
    @JsonProperty("isTimelineWork")
    private Boolean isTimelineWork;
    @JsonProperty("GalleryNumber")
    private String galleryNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6479149628656655968L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetMuseumObject() {
    }

    /**
     * 
     * @param artistDisplayName
     * @param country
     * @param objectDate
     * @param geographyType
     * @param artistULANURL
     * @param objectURL
     * @param isHighlight
     * @param reign
     * @param county
     * @param objectEndDate
     * @param artistGender
     * @param repository
     * @param artistWikidataURL
     * @param dynasty
     * @param portfolio
     * @param excavation
     * @param state
     * @param artistAlphaSort
     * @param objectWikidataURL
     * @param period
     * @param primaryImage
     * @param subregion
     * @param classification
     * @param tags
     * @param isTimelineWork
     * @param accessionYear
     * @param region
     * @param primaryImageSmall
     * @param isPublicDomain
     * @param artistSuffix
     * @param city
     * @param linkResource
     * @param artistPrefix
     * @param medium
     * @param title
     * @param locale
     * @param accessionNumber
     * @param artistEndDate
     * @param rightsAndReproduction
     * @param metadataDate
     * @param creditLine
     * @param artistRole
     * @param department
     * @param measurements
     * @param additionalImages
     * @param galleryNumber
     * @param objectBeginDate
     * @param artistBeginDate
     * @param culture
     * @param artistNationality
     * @param objectName
     * @param artistDisplayBio
     * @param locus
     * @param river
     * @param constituents
     * @param objectID
     * @param dimensions
     */
    public MetMuseumObject(Integer objectID, Boolean isHighlight, String accessionNumber, String accessionYear, Boolean isPublicDomain, String primaryImage, String primaryImageSmall, List<Object> additionalImages, List<Constituent> constituents, String department, String objectName, String title, String culture, String period, String dynasty, String reign, String portfolio, String artistRole, String artistPrefix, String artistDisplayName, String artistDisplayBio, String artistSuffix, String artistAlphaSort, String artistNationality, String artistBeginDate, String artistEndDate, String artistGender, String artistWikidataURL, String artistULANURL, String objectDate, Integer objectBeginDate, Integer objectEndDate, String medium, String dimensions, List<Measurement> measurements, String creditLine, String geographyType, String city, String state, String county, String country, String region, String subregion, String locale, String locus, String excavation, String river, String classification, String rightsAndReproduction, String linkResource, String metadataDate, String repository, String objectURL, Object tags, String objectWikidataURL, Boolean isTimelineWork, String galleryNumber) {
        super();
        this.objectID = objectID;
        this.isHighlight = isHighlight;
        this.accessionNumber = accessionNumber;
        this.accessionYear = accessionYear;
        this.isPublicDomain = isPublicDomain;
        this.primaryImage = primaryImage;
        this.primaryImageSmall = primaryImageSmall;
        this.additionalImages = additionalImages;
        this.constituents = constituents;
        this.department = department;
        this.objectName = objectName;
        this.title = title;
        this.culture = culture;
        this.period = period;
        this.dynasty = dynasty;
        this.reign = reign;
        this.portfolio = portfolio;
        this.artistRole = artistRole;
        this.artistPrefix = artistPrefix;
        this.artistDisplayName = artistDisplayName;
        this.artistDisplayBio = artistDisplayBio;
        this.artistSuffix = artistSuffix;
        this.artistAlphaSort = artistAlphaSort;
        this.artistNationality = artistNationality;
        this.artistBeginDate = artistBeginDate;
        this.artistEndDate = artistEndDate;
        this.artistGender = artistGender;
        this.artistWikidataURL = artistWikidataURL;
        this.artistULANURL = artistULANURL;
        this.objectDate = objectDate;
        this.objectBeginDate = objectBeginDate;
        this.objectEndDate = objectEndDate;
        this.medium = medium;
        this.dimensions = dimensions;
        this.measurements = measurements;
        this.creditLine = creditLine;
        this.geographyType = geographyType;
        this.city = city;
        this.state = state;
        this.county = county;
        this.country = country;
        this.region = region;
        this.subregion = subregion;
        this.locale = locale;
        this.locus = locus;
        this.excavation = excavation;
        this.river = river;
        this.classification = classification;
        this.rightsAndReproduction = rightsAndReproduction;
        this.linkResource = linkResource;
        this.metadataDate = metadataDate;
        this.repository = repository;
        this.objectURL = objectURL;
        this.tags = tags;
        this.objectWikidataURL = objectWikidataURL;
        this.isTimelineWork = isTimelineWork;
        this.galleryNumber = galleryNumber;
    }

    @JsonProperty("objectID")
    public Integer getObjectID() {
        return objectID;
    }

    @JsonProperty("objectID")
    public void setObjectID(Integer objectID) {
        this.objectID = objectID;
    }

    @JsonProperty("isHighlight")
    public Boolean getIsHighlight() {
        return isHighlight;
    }

    @JsonProperty("isHighlight")
    public void setIsHighlight(Boolean isHighlight) {
        this.isHighlight = isHighlight;
    }

    @JsonProperty("accessionNumber")
    public String getAccessionNumber() {
        return accessionNumber;
    }

    @JsonProperty("accessionNumber")
    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    @JsonProperty("accessionYear")
    public String getAccessionYear() {
        return accessionYear;
    }

    @JsonProperty("accessionYear")
    public void setAccessionYear(String accessionYear) {
        this.accessionYear = accessionYear;
    }

    @JsonProperty("isPublicDomain")
    public Boolean getIsPublicDomain() {
        return isPublicDomain;
    }

    @JsonProperty("isPublicDomain")
    public void setIsPublicDomain(Boolean isPublicDomain) {
        this.isPublicDomain = isPublicDomain;
    }

    @JsonProperty("primaryImage")
    public String getPrimaryImage() {
        return primaryImage;
    }

    @JsonProperty("primaryImage")
    public void setPrimaryImage(String primaryImage) {
        this.primaryImage = primaryImage;
    }

    @JsonProperty("primaryImageSmall")
    public String getPrimaryImageSmall() {
        return primaryImageSmall;
    }

    @JsonProperty("primaryImageSmall")
    public void setPrimaryImageSmall(String primaryImageSmall) {
        this.primaryImageSmall = primaryImageSmall;
    }

    @JsonProperty("additionalImages")
    public List<Object> getAdditionalImages() {
        return additionalImages;
    }

    @JsonProperty("additionalImages")
    public void setAdditionalImages(List<Object> additionalImages) {
        this.additionalImages = additionalImages;
    }

    @JsonProperty("constituents")
    public List<Constituent> getConstituents() {
        return constituents;
    }

    @JsonProperty("constituents")
    public void setConstituents(List<Constituent> constituents) {
        this.constituents = constituents;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("objectName")
    public String getObjectName() {
        return objectName;
    }

    @JsonProperty("objectName")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("culture")
    public String getCulture() {
        return culture;
    }

    @JsonProperty("culture")
    public void setCulture(String culture) {
        this.culture = culture;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("dynasty")
    public String getDynasty() {
        return dynasty;
    }

    @JsonProperty("dynasty")
    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    @JsonProperty("reign")
    public String getReign() {
        return reign;
    }

    @JsonProperty("reign")
    public void setReign(String reign) {
        this.reign = reign;
    }

    @JsonProperty("portfolio")
    public String getPortfolio() {
        return portfolio;
    }

    @JsonProperty("portfolio")
    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    @JsonProperty("artistRole")
    public String getArtistRole() {
        return artistRole;
    }

    @JsonProperty("artistRole")
    public void setArtistRole(String artistRole) {
        this.artistRole = artistRole;
    }

    @JsonProperty("artistPrefix")
    public String getArtistPrefix() {
        return artistPrefix;
    }

    @JsonProperty("artistPrefix")
    public void setArtistPrefix(String artistPrefix) {
        this.artistPrefix = artistPrefix;
    }

    @JsonProperty("artistDisplayName")
    public String getArtistDisplayName() {
        return artistDisplayName;
    }

    @JsonProperty("artistDisplayName")
    public void setArtistDisplayName(String artistDisplayName) {
        this.artistDisplayName = artistDisplayName;
    }

    @JsonProperty("artistDisplayBio")
    public String getArtistDisplayBio() {
        return artistDisplayBio;
    }

    @JsonProperty("artistDisplayBio")
    public void setArtistDisplayBio(String artistDisplayBio) {
        this.artistDisplayBio = artistDisplayBio;
    }

    @JsonProperty("artistSuffix")
    public String getArtistSuffix() {
        return artistSuffix;
    }

    @JsonProperty("artistSuffix")
    public void setArtistSuffix(String artistSuffix) {
        this.artistSuffix = artistSuffix;
    }

    @JsonProperty("artistAlphaSort")
    public String getArtistAlphaSort() {
        return artistAlphaSort;
    }

    @JsonProperty("artistAlphaSort")
    public void setArtistAlphaSort(String artistAlphaSort) {
        this.artistAlphaSort = artistAlphaSort;
    }

    @JsonProperty("artistNationality")
    public String getArtistNationality() {
        return artistNationality;
    }

    @JsonProperty("artistNationality")
    public void setArtistNationality(String artistNationality) {
        this.artistNationality = artistNationality;
    }

    @JsonProperty("artistBeginDate")
    public String getArtistBeginDate() {
        return artistBeginDate;
    }

    @JsonProperty("artistBeginDate")
    public void setArtistBeginDate(String artistBeginDate) {
        this.artistBeginDate = artistBeginDate;
    }

    @JsonProperty("artistEndDate")
    public String getArtistEndDate() {
        return artistEndDate;
    }

    @JsonProperty("artistEndDate")
    public void setArtistEndDate(String artistEndDate) {
        this.artistEndDate = artistEndDate;
    }

    @JsonProperty("artistGender")
    public String getArtistGender() {
        return artistGender;
    }

    @JsonProperty("artistGender")
    public void setArtistGender(String artistGender) {
        this.artistGender = artistGender;
    }

    @JsonProperty("artistWikidata_URL")
    public String getArtistWikidataURL() {
        return artistWikidataURL;
    }

    @JsonProperty("artistWikidata_URL")
    public void setArtistWikidataURL(String artistWikidataURL) {
        this.artistWikidataURL = artistWikidataURL;
    }

    @JsonProperty("artistULAN_URL")
    public String getArtistULANURL() {
        return artistULANURL;
    }

    @JsonProperty("artistULAN_URL")
    public void setArtistULANURL(String artistULANURL) {
        this.artistULANURL = artistULANURL;
    }

    @JsonProperty("objectDate")
    public String getObjectDate() {
        return objectDate;
    }

    @JsonProperty("objectDate")
    public void setObjectDate(String objectDate) {
        this.objectDate = objectDate;
    }

    @JsonProperty("objectBeginDate")
    public Integer getObjectBeginDate() {
        return objectBeginDate;
    }

    @JsonProperty("objectBeginDate")
    public void setObjectBeginDate(Integer objectBeginDate) {
        this.objectBeginDate = objectBeginDate;
    }

    @JsonProperty("objectEndDate")
    public Integer getObjectEndDate() {
        return objectEndDate;
    }

    @JsonProperty("objectEndDate")
    public void setObjectEndDate(Integer objectEndDate) {
        this.objectEndDate = objectEndDate;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @JsonProperty("dimensions")
    public String getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("measurements")
    public List<Measurement> getMeasurements() {
        return measurements;
    }

    @JsonProperty("measurements")
    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }

    @JsonProperty("creditLine")
    public String getCreditLine() {
        return creditLine;
    }

    @JsonProperty("creditLine")
    public void setCreditLine(String creditLine) {
        this.creditLine = creditLine;
    }

    @JsonProperty("geographyType")
    public String getGeographyType() {
        return geographyType;
    }

    @JsonProperty("geographyType")
    public void setGeographyType(String geographyType) {
        this.geographyType = geographyType;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("locus")
    public String getLocus() {
        return locus;
    }

    @JsonProperty("locus")
    public void setLocus(String locus) {
        this.locus = locus;
    }

    @JsonProperty("excavation")
    public String getExcavation() {
        return excavation;
    }

    @JsonProperty("excavation")
    public void setExcavation(String excavation) {
        this.excavation = excavation;
    }

    @JsonProperty("river")
    public String getRiver() {
        return river;
    }

    @JsonProperty("river")
    public void setRiver(String river) {
        this.river = river;
    }

    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }

    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @JsonProperty("rightsAndReproduction")
    public String getRightsAndReproduction() {
        return rightsAndReproduction;
    }

    @JsonProperty("rightsAndReproduction")
    public void setRightsAndReproduction(String rightsAndReproduction) {
        this.rightsAndReproduction = rightsAndReproduction;
    }

    @JsonProperty("linkResource")
    public String getLinkResource() {
        return linkResource;
    }

    @JsonProperty("linkResource")
    public void setLinkResource(String linkResource) {
        this.linkResource = linkResource;
    }

    @JsonProperty("metadataDate")
    public String getMetadataDate() {
        return metadataDate;
    }

    @JsonProperty("metadataDate")
    public void setMetadataDate(String metadataDate) {
        this.metadataDate = metadataDate;
    }

    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(String repository) {
        this.repository = repository;
    }

    @JsonProperty("objectURL")
    public String getObjectURL() {
        return objectURL;
    }

    @JsonProperty("objectURL")
    public void setObjectURL(String objectURL) {
        this.objectURL = objectURL;
    }

    @JsonProperty("tags")
    public Object getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Object tags) {
        this.tags = tags;
    }

    @JsonProperty("objectWikidata_URL")
    public String getObjectWikidataURL() {
        return objectWikidataURL;
    }

    @JsonProperty("objectWikidata_URL")
    public void setObjectWikidataURL(String objectWikidataURL) {
        this.objectWikidataURL = objectWikidataURL;
    }

    @JsonProperty("isTimelineWork")
    public Boolean getIsTimelineWork() {
        return isTimelineWork;
    }

    @JsonProperty("isTimelineWork")
    public void setIsTimelineWork(Boolean isTimelineWork) {
        this.isTimelineWork = isTimelineWork;
    }

    @JsonProperty("GalleryNumber")
    public String getGalleryNumber() {
        return galleryNumber;
    }

    @JsonProperty("GalleryNumber")
    public void setGalleryNumber(String galleryNumber) {
        this.galleryNumber = galleryNumber;
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
