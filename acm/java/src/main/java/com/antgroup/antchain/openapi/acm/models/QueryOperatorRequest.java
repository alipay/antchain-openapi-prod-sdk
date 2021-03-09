// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 企业ID
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 当前页，默认值为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认值为10
    @NameInMap("page_size")
    public Long pageSize;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 租户唯一标识
    @NameInMap("tenant")
    public String tenant;

    public static QueryOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperatorRequest self = new QueryOperatorRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOperatorRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public QueryOperatorRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryOperatorRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperatorRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryOperatorRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
