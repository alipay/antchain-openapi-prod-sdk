// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 用户 ID
    @NameInMap("customer_id")
    public String customerId;

    // 当前页
    @NameInMap("page_no")
    public Long pageNo;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // workspace
    @NameInMap("workspace")
    public String workspace;

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

    public QueryOperatorRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryOperatorRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperatorRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperatorRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
