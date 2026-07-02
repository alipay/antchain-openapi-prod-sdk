// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerInsuresignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true)
    public String merchantTenantId;

    // 保司社会统一信用代码
    @NameInMap("insure_merchant_id")
    @Validation(required = true)
    public String insureMerchantId;

    public static QueryInnerInsuresignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerInsuresignRequest self = new QueryInnerInsuresignRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerInsuresignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerInsuresignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerInsuresignRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public QueryInnerInsuresignRequest setInsureMerchantId(String insureMerchantId) {
        this.insureMerchantId = insureMerchantId;
        return this;
    }
    public String getInsureMerchantId() {
        return this.insureMerchantId;
    }

}
