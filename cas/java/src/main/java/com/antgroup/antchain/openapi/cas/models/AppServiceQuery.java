// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppServiceQuery extends TeaModel {
    // 根据 id 查询
    @NameInMap("id")
    public String id;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // appId
    @NameInMap("app_id")
    public String appId;

    // name
    @NameInMap("name")
    public String name;

    // deployStatus
    @NameInMap("deploy_status")
    public String deployStatus;

    // ownerId
    @NameInMap("owner_id")
    public String ownerId;

    // workspaceIds
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    // appIds
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // 是否为一方化查询请求
    @NameInMap("is_one_party_request")
    public Boolean isOnePartyRequest;

    // startIndex
    @NameInMap("start_index")
    public Long startIndex;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    // orders
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 查询类型
    @NameInMap("query_type")
    public String queryType;

    // Map<String, String>
    @NameInMap("conditions")
    public String conditions;

    public static AppServiceQuery build(java.util.Map<String, ?> map) throws Exception {
        AppServiceQuery self = new AppServiceQuery();
        return TeaModel.build(map, self);
    }

    public AppServiceQuery setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppServiceQuery setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppServiceQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppServiceQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppServiceQuery setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public AppServiceQuery setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AppServiceQuery setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public AppServiceQuery setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public AppServiceQuery setIsOnePartyRequest(Boolean isOnePartyRequest) {
        this.isOnePartyRequest = isOnePartyRequest;
        return this;
    }
    public Boolean getIsOnePartyRequest() {
        return this.isOnePartyRequest;
    }

    public AppServiceQuery setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public AppServiceQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AppServiceQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public AppServiceQuery setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public AppServiceQuery setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public AppServiceQuery setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

}
