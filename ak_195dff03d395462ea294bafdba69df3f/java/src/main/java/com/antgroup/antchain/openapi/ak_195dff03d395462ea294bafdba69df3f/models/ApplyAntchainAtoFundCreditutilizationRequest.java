// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplyAntchainAtoFundCreditutilizationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单列表
    @NameInMap("order_list")
    @Validation(required = true)
    public java.util.List<CreditUtilizationOrder> orderList;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 20, minLength = 1)
    public String tenantId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String merchantId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 200, minLength = 1)
    public String fundId;

    // 授信Id
    @NameInMap("granting_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String grantingId;

    // 用信授权id
    @NameInMap("utilization_auth_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String utilizationAuthId;

    // 用信id, 需保证唯一性
    @NameInMap("utilization_id")
    @Validation(required = true, maxLength = 20, minLength = 10)
    public String utilizationId;

    public static ApplyAntchainAtoFundCreditutilizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainAtoFundCreditutilizationRequest self = new ApplyAntchainAtoFundCreditutilizationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setOrderList(java.util.List<CreditUtilizationOrder> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<CreditUtilizationOrder> getOrderList() {
        return this.orderList;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setUtilizationAuthId(String utilizationAuthId) {
        this.utilizationAuthId = utilizationAuthId;
        return this;
    }
    public String getUtilizationAuthId() {
        return this.utilizationAuthId;
    }

    public ApplyAntchainAtoFundCreditutilizationRequest setUtilizationId(String utilizationId) {
        this.utilizationId = utilizationId;
        return this;
    }
    public String getUtilizationId() {
        return this.utilizationId;
    }

}
