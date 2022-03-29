// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuelimitrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 限流规则名称
    @NameInMap("name")
    public String name;

    // 当前页
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 每页记录数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryMeshQueuelimitrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuelimitrulesRequest self = new QueryMeshQueuelimitrulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuelimitrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshQueuelimitrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshQueuelimitrulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryMeshQueuelimitrulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshQueuelimitrulesRequest setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueryMeshQueuelimitrulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
