// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppservicebuildpackrelationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 一组应用服务id
    @NameInMap("appservice_ids")
    public java.util.List<String> appserviceIds;

    // 一组应用id
    // 
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // buildpackArch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // buildpackIds
    @NameInMap("buildpack_ids")
    public java.util.List<String> buildpackIds;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 是否降序
    @NameInMap("descend")
    public Boolean descend;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // 每页个数
    @NameInMap("page_size")
    public Long pageSize;

    // 分类
    @NameInMap("sort_field")
    public String sortField;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // techstackIdentities
    @NameInMap("techstack_identities")
    public java.util.List<String> techstackIdentities;

    // 一组技术栈id
    @NameInMap("techstack_ids")
    public java.util.List<String> techstackIds;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryAppservicebuildpackrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppservicebuildpackrelationRequest self = new QueryAppservicebuildpackrelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppservicebuildpackrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppservicebuildpackrelationRequest setAppserviceIds(java.util.List<String> appserviceIds) {
        this.appserviceIds = appserviceIds;
        return this;
    }
    public java.util.List<String> getAppserviceIds() {
        return this.appserviceIds;
    }

    public QueryAppservicebuildpackrelationRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryAppservicebuildpackrelationRequest setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public QueryAppservicebuildpackrelationRequest setBuildpackIds(java.util.List<String> buildpackIds) {
        this.buildpackIds = buildpackIds;
        return this;
    }
    public java.util.List<String> getBuildpackIds() {
        return this.buildpackIds;
    }

    public QueryAppservicebuildpackrelationRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppservicebuildpackrelationRequest setDescend(Boolean descend) {
        this.descend = descend;
        return this;
    }
    public Boolean getDescend() {
        return this.descend;
    }

    public QueryAppservicebuildpackrelationRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryAppservicebuildpackrelationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppservicebuildpackrelationRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryAppservicebuildpackrelationRequest setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryAppservicebuildpackrelationRequest setTechstackIdentities(java.util.List<String> techstackIdentities) {
        this.techstackIdentities = techstackIdentities;
        return this;
    }
    public java.util.List<String> getTechstackIdentities() {
        return this.techstackIdentities;
    }

    public QueryAppservicebuildpackrelationRequest setTechstackIds(java.util.List<String> techstackIds) {
        this.techstackIds = techstackIds;
        return this;
    }
    public java.util.List<String> getTechstackIds() {
        return this.techstackIds;
    }

    public QueryAppservicebuildpackrelationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
