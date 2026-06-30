// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyBenefithubRiskPayunilateralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务操作类型,目前只支持下单
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 外部支付的订单号
    @NameInMap("payment_no")
    @Validation(required = true)
    public String paymentNo;

    // 订单状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 订单金额
    @NameInMap("order_amount")
    @Validation(required = true)
    public String orderAmount;

    // 订单实际支付金额
    @NameInMap("payment_amount")
    @Validation(required = true)
    public String paymentAmount;

    // 支付时间
    @NameInMap("payment_time")
    @Validation(required = true)
    public String paymentTime;

    // 支付使用的方式
    @NameInMap("payment_method_type")
    @Validation(required = true)
    public String paymentMethodType;

    // 三方支付流水号
    @NameInMap("cap_num")
    @Validation(required = true)
    public String capNum;

    // 支付通道商户号
    @NameInMap("merchant_no")
    public String merchantNo;

    // 订单类型，订阅、单次购买等
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 订单来源
    @NameInMap("order_source")
    @Validation(required = true)
    public String orderSource;

    // 平台code，由蚂蚁数科颁发的特定平台code，用于报告产品授权使用
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 用户唯一id，流量平台提供，内部结合platformCode 组成唯一code
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    // 产品code，具体的报告产品；不同产品价格、展示内容可能均不一样，可通过产品code区分不同场景
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static NotifyBenefithubRiskPayunilateralRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyBenefithubRiskPayunilateralRequest self = new NotifyBenefithubRiskPayunilateralRequest();
        return TeaModel.build(map, self);
    }

    public NotifyBenefithubRiskPayunilateralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyBenefithubRiskPayunilateralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyBenefithubRiskPayunilateralRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public NotifyBenefithubRiskPayunilateralRequest setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
        return this;
    }
    public String getPaymentNo() {
        return this.paymentNo;
    }

    public NotifyBenefithubRiskPayunilateralRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NotifyBenefithubRiskPayunilateralRequest setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public String getOrderAmount() {
        return this.orderAmount;
    }

    public NotifyBenefithubRiskPayunilateralRequest setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public String getPaymentAmount() {
        return this.paymentAmount;
    }

    public NotifyBenefithubRiskPayunilateralRequest setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public NotifyBenefithubRiskPayunilateralRequest setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
        return this;
    }
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public NotifyBenefithubRiskPayunilateralRequest setCapNum(String capNum) {
        this.capNum = capNum;
        return this;
    }
    public String getCapNum() {
        return this.capNum;
    }

    public NotifyBenefithubRiskPayunilateralRequest setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

    public NotifyBenefithubRiskPayunilateralRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public NotifyBenefithubRiskPayunilateralRequest setOrderSource(String orderSource) {
        this.orderSource = orderSource;
        return this;
    }
    public String getOrderSource() {
        return this.orderSource;
    }

    public NotifyBenefithubRiskPayunilateralRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public NotifyBenefithubRiskPayunilateralRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

    public NotifyBenefithubRiskPayunilateralRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
