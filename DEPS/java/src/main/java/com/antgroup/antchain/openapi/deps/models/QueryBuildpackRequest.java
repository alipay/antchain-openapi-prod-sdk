// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 技术栈版本号
    @NameInMap("full_version")
    public String fullVersion;

    // 每页的大小
    @NameInMap("page_size")
    public Long pageSize;

    // 开始时间
    @NameInMap("publication_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTimeFrom;

    // 截至时间
    @NameInMap("publication_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String publicationTimeTo;

    // 技术栈提供方所在域
    @NameInMap("scopes")
    public java.util.List<String> scopes;

    // 技术栈版本状态
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // 支持的操作系统ID列表
    @NameInMap("supported_os_ids")
    public java.util.List<Long> supportedOsIds;

    // 支持的地域名称列表
    @NameInMap("supported_regions")
    public java.util.List<String> supportedRegions;

    // 技术栈ID列表
    @NameInMap("techstack_ids")
    public java.util.List<Long> techstackIds;

    // 技术栈名称
    @NameInMap("techstack_names")
    public java.util.List<String> techstackNames;

    // creatorIds
    @NameInMap("creator_ids")
    public java.util.List<String> creatorIds;

    public static QueryBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackRequest self = new QueryBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public QueryBuildpackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpackRequest setPublicationTimeFrom(String publicationTimeFrom) {
        this.publicationTimeFrom = publicationTimeFrom;
        return this;
    }
    public String getPublicationTimeFrom() {
        return this.publicationTimeFrom;
    }

    public QueryBuildpackRequest setPublicationTimeTo(String publicationTimeTo) {
        this.publicationTimeTo = publicationTimeTo;
        return this;
    }
    public String getPublicationTimeTo() {
        return this.publicationTimeTo;
    }

    public QueryBuildpackRequest setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public QueryBuildpackRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryBuildpackRequest setSupportedOsIds(java.util.List<Long> supportedOsIds) {
        this.supportedOsIds = supportedOsIds;
        return this;
    }
    public java.util.List<Long> getSupportedOsIds() {
        return this.supportedOsIds;
    }

    public QueryBuildpackRequest setSupportedRegions(java.util.List<String> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<String> getSupportedRegions() {
        return this.supportedRegions;
    }

    public QueryBuildpackRequest setTechstackIds(java.util.List<Long> techstackIds) {
        this.techstackIds = techstackIds;
        return this;
    }
    public java.util.List<Long> getTechstackIds() {
        return this.techstackIds;
    }

    public QueryBuildpackRequest setTechstackNames(java.util.List<String> techstackNames) {
        this.techstackNames = techstackNames;
        return this;
    }
    public java.util.List<String> getTechstackNames() {
        return this.techstackNames;
    }

    public QueryBuildpackRequest setCreatorIds(java.util.List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }
    public java.util.List<String> getCreatorIds() {
        return this.creatorIds;
    }

}
