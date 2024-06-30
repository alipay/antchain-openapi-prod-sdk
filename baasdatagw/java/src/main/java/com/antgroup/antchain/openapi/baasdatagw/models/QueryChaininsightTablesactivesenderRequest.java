// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightTablesactivesenderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链ID列表
    @NameInMap("biz_ids")
    public java.util.List<String> bizIds;

    // 时间范围，单位小时，默认24小时
    @NameInMap("time_range")
    @Validation(maximum = 168)
    public Long timeRange;

    // 页码，默认1
    @NameInMap("page_no")
    public Long pageNo;

    // 页面大小，默认10
    @NameInMap("page_size")
    @Validation(maximum = 100)
    public Long pageSize;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryChaininsightTablesactivesenderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightTablesactivesenderRequest self = new QueryChaininsightTablesactivesenderRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightTablesactivesenderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightTablesactivesenderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightTablesactivesenderRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryChaininsightTablesactivesenderRequest setBizIds(java.util.List<String> bizIds) {
        this.bizIds = bizIds;
        return this;
    }
    public java.util.List<String> getBizIds() {
        return this.bizIds;
    }

    public QueryChaininsightTablesactivesenderRequest setTimeRange(Long timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public Long getTimeRange() {
        return this.timeRange;
    }

    public QueryChaininsightTablesactivesenderRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryChaininsightTablesactivesenderRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryChaininsightTablesactivesenderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
