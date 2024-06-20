// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class PayGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 订单编号 ( 编号不能重复)
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 256)
    public String orderId;

    // 发起人
    @NameInMap("from")
    @Validation(required = true, maxLength = 100)
    public String from;

    // 付款人
    @NameInMap("payer")
    @Validation(required = true, maxLength = 100)
    public String payer;

    // 支付方式
    @NameInMap("pay_type")
    @Validation(required = true, maxLength = 100)
    public String payType;

    // 支付时间
    @NameInMap("pay_time")
    @Validation(required = true, maxLength = 100)
    public String payTime;

    // 支付状态
    @NameInMap("status")
    @Validation(required = true, maxLength = 100)
    public String status;

    // 收款人
    @NameInMap("to")
    @Validation(required = true, maxLength = 100)
    public String to;

    // 订单金额（保留3位小数）
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 分账规则id （根据规则进行分账）
    @NameInMap("rule_id")
    @Validation(required = true)
    public String ruleId;

    // 扩展json
    @NameInMap("data")
    @Validation(maxLength = 2000)
    public String data;

    public static PayGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        PayGeneralDivideRequest self = new PayGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public PayGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PayGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public PayGeneralDivideRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PayGeneralDivideRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public PayGeneralDivideRequest setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public PayGeneralDivideRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public PayGeneralDivideRequest setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public PayGeneralDivideRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PayGeneralDivideRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public PayGeneralDivideRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public PayGeneralDivideRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public PayGeneralDivideRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
