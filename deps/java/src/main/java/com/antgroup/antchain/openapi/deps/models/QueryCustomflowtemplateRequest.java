// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCustomflowtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 页码
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 排序规则
    @NameInMap("orders")
    public java.util.List<String> orders;

    public static QueryCustomflowtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomflowtemplateRequest self = new QueryCustomflowtemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomflowtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomflowtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCustomflowtemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCustomflowtemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomflowtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryCustomflowtemplateRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

}
