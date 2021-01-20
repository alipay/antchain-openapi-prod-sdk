// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpacknewRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // buildCommand
    @NameInMap("build_command")
    public String buildCommand;

    // createdFroms
    @NameInMap("created_froms")
    public java.util.List<String> createdFroms;

    // creationTimeFrom
    @NameInMap("creation_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeFrom;

    // creationTimeTo
    @NameInMap("creation_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTimeTo;

    // creatorIds
    @NameInMap("creator_ids")
    public java.util.List<String> creatorIds;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    // descend
    @NameInMap("descend")
    public Boolean descend;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // isProcessed
    @NameInMap("is_processed")
    public Boolean isProcessed;

    // modificationTimeFrom
    @NameInMap("modification_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeFrom;

    // modificationTimeTo
    @NameInMap("modification_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTimeTo;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // publicationTimeFrom
    @NameInMap("publication_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTimeFrom;

    // publicationTimeTo
    @NameInMap("publication_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTimeTo;

    // publisherIds
    @NameInMap("publisher_ids")
    public java.util.List<String> publisherIds;

    // scopes
    @NameInMap("scopes")
    public java.util.List<String> scopes;

    // sortField
    @NameInMap("sort_field")
    public String sortField;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // supportedOsIds
    @NameInMap("supported_os_ids")
    public java.util.List<Long> supportedOsIds;

    // supported_region_ids
    @NameInMap("supported_region_ids")
    public java.util.List<String> supportedRegionIds;

    // techstackIds
    @NameInMap("techstack_ids")
    public java.util.List<Long> techstackIds;

    // techstackNames
    @NameInMap("techstack_names")
    public java.util.List<String> techstackNames;

    public static QueryBuildpacknewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpacknewRequest self = new QueryBuildpacknewRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpacknewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpacknewRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public QueryBuildpacknewRequest setCreatedFroms(java.util.List<String> createdFroms) {
        this.createdFroms = createdFroms;
        return this;
    }
    public java.util.List<String> getCreatedFroms() {
        return this.createdFroms;
    }

    public QueryBuildpacknewRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryBuildpacknewRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public QueryBuildpacknewRequest setCreatorIds(java.util.List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }
    public java.util.List<String> getCreatorIds() {
        return this.creatorIds;
    }

    public QueryBuildpacknewRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpacknewRequest setDescend(Boolean descend) {
        this.descend = descend;
        return this;
    }
    public Boolean getDescend() {
        return this.descend;
    }

    public QueryBuildpacknewRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public QueryBuildpacknewRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryBuildpacknewRequest setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }
    public Boolean getIsProcessed() {
        return this.isProcessed;
    }

    public QueryBuildpacknewRequest setModificationTimeFrom(String modificationTimeFrom) {
        this.modificationTimeFrom = modificationTimeFrom;
        return this;
    }
    public String getModificationTimeFrom() {
        return this.modificationTimeFrom;
    }

    public QueryBuildpacknewRequest setModificationTimeTo(String modificationTimeTo) {
        this.modificationTimeTo = modificationTimeTo;
        return this;
    }
    public String getModificationTimeTo() {
        return this.modificationTimeTo;
    }

    public QueryBuildpacknewRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpacknewRequest setPublicationTimeFrom(String publicationTimeFrom) {
        this.publicationTimeFrom = publicationTimeFrom;
        return this;
    }
    public String getPublicationTimeFrom() {
        return this.publicationTimeFrom;
    }

    public QueryBuildpacknewRequest setPublicationTimeTo(String publicationTimeTo) {
        this.publicationTimeTo = publicationTimeTo;
        return this;
    }
    public String getPublicationTimeTo() {
        return this.publicationTimeTo;
    }

    public QueryBuildpacknewRequest setPublisherIds(java.util.List<String> publisherIds) {
        this.publisherIds = publisherIds;
        return this;
    }
    public java.util.List<String> getPublisherIds() {
        return this.publisherIds;
    }

    public QueryBuildpacknewRequest setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public QueryBuildpacknewRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryBuildpacknewRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryBuildpacknewRequest setSupportedOsIds(java.util.List<Long> supportedOsIds) {
        this.supportedOsIds = supportedOsIds;
        return this;
    }
    public java.util.List<Long> getSupportedOsIds() {
        return this.supportedOsIds;
    }

    public QueryBuildpacknewRequest setSupportedRegionIds(java.util.List<String> supportedRegionIds) {
        this.supportedRegionIds = supportedRegionIds;
        return this;
    }
    public java.util.List<String> getSupportedRegionIds() {
        return this.supportedRegionIds;
    }

    public QueryBuildpacknewRequest setTechstackIds(java.util.List<Long> techstackIds) {
        this.techstackIds = techstackIds;
        return this;
    }
    public java.util.List<Long> getTechstackIds() {
        return this.techstackIds;
    }

    public QueryBuildpacknewRequest setTechstackNames(java.util.List<String> techstackNames) {
        this.techstackNames = techstackNames;
        return this;
    }
    public java.util.List<String> getTechstackNames() {
        return this.techstackNames;
    }

}
