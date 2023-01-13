// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryDatasearchSearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户唯一标识符（租户ID）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链唯一标识符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 检索的metaId范围；私有化不支持，参数留空
    @NameInMap("meta_conditions")
    public java.util.List<String> metaConditions;

    // 检索请求
    @NameInMap("query")
    @Validation(required = true)
    public DataSearchRequest query;

    public static QueryDatasearchSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasearchSearchRequest self = new QueryDatasearchSearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatasearchSearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatasearchSearchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDatasearchSearchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryDatasearchSearchRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDatasearchSearchRequest setMetaConditions(java.util.List<String> metaConditions) {
        this.metaConditions = metaConditions;
        return this;
    }
    public java.util.List<String> getMetaConditions() {
        return this.metaConditions;
    }

    public QueryDatasearchSearchRequest setQuery(DataSearchRequest query) {
        this.query = query;
        return this;
    }
    public DataSearchRequest getQuery() {
        return this.query;
    }

}
