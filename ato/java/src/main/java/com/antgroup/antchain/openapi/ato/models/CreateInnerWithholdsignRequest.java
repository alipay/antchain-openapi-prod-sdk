// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerWithholdsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 64)
    public String merchantTenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 用户支付宝2088uid
    @NameInMap("alipay_user_id")
    @Validation(maxLength = 64)
    public String alipayUserId;

    public static CreateInnerWithholdsignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerWithholdsignRequest self = new CreateInnerWithholdsignRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerWithholdsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerWithholdsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerWithholdsignRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public CreateInnerWithholdsignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateInnerWithholdsignRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
