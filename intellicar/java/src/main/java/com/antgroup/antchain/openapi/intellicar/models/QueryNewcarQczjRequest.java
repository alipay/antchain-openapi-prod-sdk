// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryNewcarQczjRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询类型
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 批量拉取数据时，上一次返回的afterSpecId
    @NameInMap("after_spec_id")
    public String afterSpecId;

    public static QueryNewcarQczjRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNewcarQczjRequest self = new QueryNewcarQczjRequest();
        return TeaModel.build(map, self);
    }

    public QueryNewcarQczjRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNewcarQczjRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNewcarQczjRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryNewcarQczjRequest setAfterSpecId(String afterSpecId) {
        this.afterSpecId = afterSpecId;
        return this;
    }
    public String getAfterSpecId() {
        return this.afterSpecId;
    }

}
