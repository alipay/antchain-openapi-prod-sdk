// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppDomainQuery extends TeaModel {
    // creatorId
    @NameInMap("creator_id")
    public String creatorId;

    // 是否为一方化请求
    @NameInMap("is_one_party_request")
    public Boolean isOnePartyRequest;

    // name
    @NameInMap("name")
    public String name;

    // parentId
    @NameInMap("parent_id")
    public String parentId;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // query_type
    @NameInMap("query_type")
    public String queryType;

    // orders
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    public static AppDomainQuery build(java.util.Map<String, ?> map) throws Exception {
        AppDomainQuery self = new AppDomainQuery();
        return TeaModel.build(map, self);
    }

    public AppDomainQuery setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public AppDomainQuery setIsOnePartyRequest(Boolean isOnePartyRequest) {
        this.isOnePartyRequest = isOnePartyRequest;
        return this;
    }
    public Boolean getIsOnePartyRequest() {
        return this.isOnePartyRequest;
    }

    public AppDomainQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppDomainQuery setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public AppDomainQuery setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppDomainQuery setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppDomainQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AppDomainQuery setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public AppDomainQuery setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public AppDomainQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
