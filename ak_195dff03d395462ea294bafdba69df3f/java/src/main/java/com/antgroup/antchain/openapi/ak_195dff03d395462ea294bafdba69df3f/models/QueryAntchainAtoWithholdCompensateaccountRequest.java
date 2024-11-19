// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoWithholdCompensateaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundTenantId;

    public static QueryAntchainAtoWithholdCompensateaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoWithholdCompensateaccountRequest self = new QueryAntchainAtoWithholdCompensateaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoWithholdCompensateaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoWithholdCompensateaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoWithholdCompensateaccountRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAntchainAtoWithholdCompensateaccountRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryAntchainAtoWithholdCompensateaccountRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

}
