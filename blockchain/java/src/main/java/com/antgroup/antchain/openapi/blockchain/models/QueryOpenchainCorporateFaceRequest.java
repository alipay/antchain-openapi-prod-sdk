// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryOpenchainCorporateFaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 租户code
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户code
    @NameInMap("merchant_code")
    @Validation(required = true)
    public String merchantCode;

    public static QueryOpenchainCorporateFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenchainCorporateFaceRequest self = new QueryOpenchainCorporateFaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpenchainCorporateFaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpenchainCorporateFaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOpenchainCorporateFaceRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryOpenchainCorporateFaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryOpenchainCorporateFaceRequest setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
        return this;
    }
    public String getMerchantCode() {
        return this.merchantCode;
    }

}
