// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryUserListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码，从1开始
    @NameInMap("page_index")
    @Validation(required = true, minimum = 1)
    public Long pageIndex;

    // 每页数据，1~100
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long pageSize;

    // 用户状态
    @NameInMap("status")
    public String status;

    public static QueryUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListRequest self = new QueryUserListRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserListRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryUserListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
