// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppQuery extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // name
    @NameInMap("name")
    public String name;

    // chineseName
    @NameInMap("chinese_name")
    public String chineseName;

    // stackId
    @NameInMap("stack_id")
    public String stackId;

    // startVersion
    @NameInMap("start_version")
    public String startVersion;

    // endVersion
    @NameInMap("end_version")
    public String endVersion;

    // appIds
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // appDomainId
    @NameInMap("app_domain_id")
    public String appDomainId;

    // appDomainIds
    @NameInMap("app_domain_ids")
    public java.util.List<String> appDomainIds;

    // appDomainName
    @NameInMap("app_domain_name")
    public String appDomainName;

    // appLevelId
    @NameInMap("app_level_id")
    public String appLevelId;

    // ownerId
    @NameInMap("owner_id")
    public String ownerId;

    // isComponent
    @NameInMap("is_component")
    public Boolean isComponent;

    // simpleQuery
    @NameInMap("simple_query")
    public Boolean simpleQuery;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // containerCount
    @NameInMap("container_count")
    public String containerCount;

    // databaseCount
    @NameInMap("database_count")
    public String databaseCount;

    // slbCount
    @NameInMap("slb_count")
    public String slbCount;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // isOnePartyRequest
    @NameInMap("is_one_party_request")
    public Boolean isOnePartyRequest;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    // orders
    @NameInMap("orders")
    public java.util.List<String> orders;

    // queryType
    @NameInMap("query_type")
    public String queryType;

    public static AppQuery build(java.util.Map<String, ?> map) throws Exception {
        AppQuery self = new AppQuery();
        return TeaModel.build(map, self);
    }

    public AppQuery setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppQuery setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppQuery setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public AppQuery setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public AppQuery setStartVersion(String startVersion) {
        this.startVersion = startVersion;
        return this;
    }
    public String getStartVersion() {
        return this.startVersion;
    }

    public AppQuery setEndVersion(String endVersion) {
        this.endVersion = endVersion;
        return this;
    }
    public String getEndVersion() {
        return this.endVersion;
    }

    public AppQuery setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public AppQuery setAppDomainId(String appDomainId) {
        this.appDomainId = appDomainId;
        return this;
    }
    public String getAppDomainId() {
        return this.appDomainId;
    }

    public AppQuery setAppDomainIds(java.util.List<String> appDomainIds) {
        this.appDomainIds = appDomainIds;
        return this;
    }
    public java.util.List<String> getAppDomainIds() {
        return this.appDomainIds;
    }

    public AppQuery setAppDomainName(String appDomainName) {
        this.appDomainName = appDomainName;
        return this;
    }
    public String getAppDomainName() {
        return this.appDomainName;
    }

    public AppQuery setAppLevelId(String appLevelId) {
        this.appLevelId = appLevelId;
        return this;
    }
    public String getAppLevelId() {
        return this.appLevelId;
    }

    public AppQuery setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AppQuery setIsComponent(Boolean isComponent) {
        this.isComponent = isComponent;
        return this;
    }
    public Boolean getIsComponent() {
        return this.isComponent;
    }

    public AppQuery setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

    public AppQuery setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppQuery setContainerCount(String containerCount) {
        this.containerCount = containerCount;
        return this;
    }
    public String getContainerCount() {
        return this.containerCount;
    }

    public AppQuery setDatabaseCount(String databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public String getDatabaseCount() {
        return this.databaseCount;
    }

    public AppQuery setSlbCount(String slbCount) {
        this.slbCount = slbCount;
        return this;
    }
    public String getSlbCount() {
        return this.slbCount;
    }

    public AppQuery setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppQuery setIsOnePartyRequest(Boolean isOnePartyRequest) {
        this.isOnePartyRequest = isOnePartyRequest;
        return this;
    }
    public Boolean getIsOnePartyRequest() {
        return this.isOnePartyRequest;
    }

    public AppQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AppQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public AppQuery setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public AppQuery setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
