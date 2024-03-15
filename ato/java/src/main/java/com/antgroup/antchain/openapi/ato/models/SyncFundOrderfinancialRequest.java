// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundOrderfinancialRequest extends TeaModel {
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

    public static SyncFundOrderfinancialRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundOrderfinancialRequest self = new SyncFundOrderfinancialRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundOrderfinancialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundOrderfinancialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundOrderfinancialRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundOrderfinancialRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public SyncFundOrderfinancialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SyncFundOrderfinancialRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SyncFundOrderfinancialRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SyncFundOrderfinancialRequest setExtras(String extras) {
        this.extras = extras;
        return this;
    }
    public String getExtras() {
        return this.extras;
    }

}
