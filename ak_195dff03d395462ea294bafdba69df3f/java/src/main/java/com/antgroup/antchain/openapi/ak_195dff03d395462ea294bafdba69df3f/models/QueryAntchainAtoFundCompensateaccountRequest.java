// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundCompensateaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantTenantId;

    public static QueryAntchainAtoFundCompensateaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundCompensateaccountRequest self = new QueryAntchainAtoFundCompensateaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundCompensateaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoFundCompensateaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoFundCompensateaccountRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryAntchainAtoFundCompensateaccountRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAntchainAtoFundCompensateaccountRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

}
