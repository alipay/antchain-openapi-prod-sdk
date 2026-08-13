// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OpenEnterpriseProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业id
    @NameInMap("enterprise_id")
    @Validation(required = true)
    public String enterpriseId;

    // 租户ID（账户开通时返回）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务侧订单ID（全局唯一，幂等键，≤32位）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 订购时长类型 Y 单位：年
    @NameInMap("duration_type")
    @Validation(required = true)
    public String durationType;

    // 订购时长
    @NameInMap("duration_value")
    @Validation(required = true)
    public String durationValue;

    // 开通金额（元）
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 付款方支付宝UID
    @NameInMap("payer_alipay_uid")
    @Validation(required = true)
    public String payerAlipayUid;

    // 回调地址，业务方期望将支付结果&产品开通结果回调到自身业务系统的地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    public static OpenEnterpriseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenEnterpriseProductRequest self = new OpenEnterpriseProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenEnterpriseProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenEnterpriseProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenEnterpriseProductRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public OpenEnterpriseProductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenEnterpriseProductRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenEnterpriseProductRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public OpenEnterpriseProductRequest setDurationType(String durationType) {
        this.durationType = durationType;
        return this;
    }
    public String getDurationType() {
        return this.durationType;
    }

    public OpenEnterpriseProductRequest setDurationValue(String durationValue) {
        this.durationValue = durationValue;
        return this;
    }
    public String getDurationValue() {
        return this.durationValue;
    }

    public OpenEnterpriseProductRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public OpenEnterpriseProductRequest setPayerAlipayUid(String payerAlipayUid) {
        this.payerAlipayUid = payerAlipayUid;
        return this;
    }
    public String getPayerAlipayUid() {
        return this.payerAlipayUid;
    }

    public OpenEnterpriseProductRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
