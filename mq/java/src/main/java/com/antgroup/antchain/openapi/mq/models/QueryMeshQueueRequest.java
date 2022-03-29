// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列名称
    @NameInMap("name")
    public String name;

    // 当前页码值
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 页面显示数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryMeshQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueueRequest self = new QueryMeshQueueRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshQueueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshQueueRequest setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueryMeshQueueRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
