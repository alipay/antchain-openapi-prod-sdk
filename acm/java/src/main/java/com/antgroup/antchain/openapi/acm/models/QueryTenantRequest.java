// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 企业唯一标识
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 当前页，默认值为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认值为10
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantRequest self = new QueryTenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public QueryTenantRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTenantRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
