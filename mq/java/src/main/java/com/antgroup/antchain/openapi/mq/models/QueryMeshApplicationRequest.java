// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("name")
    public String name;

    // 当前页
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryMeshApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshApplicationRequest self = new QueryMeshApplicationRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshApplicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshApplicationRequest setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueryMeshApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
