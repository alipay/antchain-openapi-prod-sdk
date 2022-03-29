// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuerouterulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 路由规则名称
    @NameInMap("name")
    public String name;

    // 当前页码值
    @NameInMap("pagecurrent")
    @Validation(required = true)
    public Long pagecurrent;

    // 页面大小
    @NameInMap("pagesize")
    @Validation(required = true)
    public Long pagesize;

    public static QueryMeshQueuerouterulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuerouterulesRequest self = new QueryMeshQueuerouterulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuerouterulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshQueuerouterulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshQueuerouterulesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryMeshQueuerouterulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshQueuerouterulesRequest setPagecurrent(Long pagecurrent) {
        this.pagecurrent = pagecurrent;
        return this;
    }
    public Long getPagecurrent() {
        return this.pagecurrent;
    }

    public QueryMeshQueuerouterulesRequest setPagesize(Long pagesize) {
        this.pagesize = pagesize;
        return this;
    }
    public Long getPagesize() {
        return this.pagesize;
    }

}
