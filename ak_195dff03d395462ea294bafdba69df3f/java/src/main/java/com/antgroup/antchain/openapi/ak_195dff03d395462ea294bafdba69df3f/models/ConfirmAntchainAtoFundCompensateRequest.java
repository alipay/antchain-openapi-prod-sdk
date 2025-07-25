// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ConfirmAntchainAtoFundCompensateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true)
    public String merchantTenantId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 签约串类型 
    // TRANSFER:转账代偿签约串 
    // WITHHOLD:代扣代偿签约串
    @NameInMap("type")
    public String type;

    public static ConfirmAntchainAtoFundCompensateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAntchainAtoFundCompensateRequest self = new ConfirmAntchainAtoFundCompensateRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAntchainAtoFundCompensateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmAntchainAtoFundCompensateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmAntchainAtoFundCompensateRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ConfirmAntchainAtoFundCompensateRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public ConfirmAntchainAtoFundCompensateRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ConfirmAntchainAtoFundCompensateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
