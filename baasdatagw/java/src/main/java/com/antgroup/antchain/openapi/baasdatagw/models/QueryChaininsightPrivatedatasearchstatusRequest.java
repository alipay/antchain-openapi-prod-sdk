// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class QueryChaininsightPrivatedatasearchstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    // 链ID列表
    @NameInMap("biz_ids")
    public java.util.List<String> bizIds;

    public static QueryChaininsightPrivatedatasearchstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChaininsightPrivatedatasearchstatusRequest self = new QueryChaininsightPrivatedatasearchstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryChaininsightPrivatedatasearchstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryChaininsightPrivatedatasearchstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryChaininsightPrivatedatasearchstatusRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryChaininsightPrivatedatasearchstatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryChaininsightPrivatedatasearchstatusRequest setBizIds(java.util.List<String> bizIds) {
        this.bizIds = bizIds;
        return this;
    }
    public java.util.List<String> getBizIds() {
        return this.bizIds;
    }

}
