// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundOrderfinancialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商户在数科的租户ID
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String merchantTenantId;

    // 订单融资唯一标识
    @NameInMap("application_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String applicationId;

    // 订单融资状态：1-成功；2-失败
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 融资结果描述，长度不超过64
    @NameInMap("reason")
    @Validation(maxLength = 64)
    public String reason;

    // 额外信息
    @NameInMap("extras")
    public String extras;

    public static SyncAntchainAtoFundOrderfinancialRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundOrderfinancialRequest self = new SyncAntchainAtoFundOrderfinancialRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundOrderfinancialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncAntchainAtoFundOrderfinancialRequest setExtras(String extras) {
        this.extras = extras;
        return this;
    }
    public String getExtras() {
        return this.extras;
    }

}
