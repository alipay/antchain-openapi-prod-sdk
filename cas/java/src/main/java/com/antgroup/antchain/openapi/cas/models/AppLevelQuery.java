// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppLevelQuery extends TeaModel {
    // appCountInclude
    @NameInMap("app_count_include")
    public Boolean appCountInclude;

    // creator_id
    @NameInMap("creator_id")
    public String creatorId;

    // is_one_party_request
    @NameInMap("is_one_party_request")
    public Boolean isOnePartyRequest;

    // name
    @NameInMap("name")
    public String name;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    // orders
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // query_type
    @NameInMap("query_type")
    public String queryType;

    public static AppLevelQuery build(java.util.Map<String, ?> map) throws Exception {
        AppLevelQuery self = new AppLevelQuery();
        return TeaModel.build(map, self);
    }

    public AppLevelQuery setAppCountInclude(Boolean appCountInclude) {
        this.appCountInclude = appCountInclude;
        return this;
    }
    public Boolean getAppCountInclude() {
        return this.appCountInclude;
    }

    public AppLevelQuery setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public AppLevelQuery setIsOnePartyRequest(Boolean isOnePartyRequest) {
        this.isOnePartyRequest = isOnePartyRequest;
        return this;
    }
    public Boolean getIsOnePartyRequest() {
        return this.isOnePartyRequest;
    }

    public AppLevelQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppLevelQuery setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppLevelQuery setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppLevelQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public AppLevelQuery setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public AppLevelQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AppLevelQuery setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
