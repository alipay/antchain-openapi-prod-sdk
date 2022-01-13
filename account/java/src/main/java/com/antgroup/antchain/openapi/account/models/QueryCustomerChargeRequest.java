// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class QueryCustomerChargeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 若有，则返回相应的状态，INIT/SUCCESS/FAIL
    @NameInMap("status")
    public String status;

    // 访问的页码数
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每页的数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 调用系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 1- 按时间升序
    // 2-按时间倒序
    // 不填默认2
    @NameInMap("sort_type")
    public Long sortType;

    public static QueryCustomerChargeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerChargeRequest self = new QueryCustomerChargeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerChargeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerChargeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryCustomerChargeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCustomerChargeRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCustomerChargeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomerChargeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryCustomerChargeRequest setSortType(Long sortType) {
        this.sortType = sortType;
        return this;
    }
    public Long getSortType() {
        return this.sortType;
    }

}
