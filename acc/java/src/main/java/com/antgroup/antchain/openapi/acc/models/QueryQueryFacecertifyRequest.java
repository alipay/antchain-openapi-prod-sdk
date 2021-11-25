// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class QueryQueryFacecertifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义唯一id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 租户类型
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 校验id
    @NameInMap("verify_id")
    @Validation(required = true)
    public String verifyId;

    public static QueryQueryFacecertifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQueryFacecertifyRequest self = new QueryQueryFacecertifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryQueryFacecertifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQueryFacecertifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQueryFacecertifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryQueryFacecertifyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryQueryFacecertifyRequest setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

}
