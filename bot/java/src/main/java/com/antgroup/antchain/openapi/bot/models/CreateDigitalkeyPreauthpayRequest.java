// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDigitalkeyPreauthpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水号，用于标示请求流水的唯一性。
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 商户授权资金订单号。
    // 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 订单标题
    @NameInMap("order_title")
    @Validation(required = true)
    public String orderTitle;

    // 需要冻结的金额，实际金额乘以100
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 收款账户的支付宝登录号（email或手机号）
    @NameInMap("payee_logon_id")
    @Validation(required = true)
    public String payeeLogonId;

    // 无特殊需要请勿传入；商户可用该参数指定支付渠道。
    // 传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。
    @NameInMap("enable_pay_channels")
    public String enablePayChannels;

    public static CreateDigitalkeyPreauthpayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalkeyPreauthpayRequest self = new CreateDigitalkeyPreauthpayRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalkeyPreauthpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalkeyPreauthpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalkeyPreauthpayRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public CreateDigitalkeyPreauthpayRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public CreateDigitalkeyPreauthpayRequest setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
        return this;
    }
    public String getOrderTitle() {
        return this.orderTitle;
    }

    public CreateDigitalkeyPreauthpayRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateDigitalkeyPreauthpayRequest setPayeeLogonId(String payeeLogonId) {
        this.payeeLogonId = payeeLogonId;
        return this;
    }
    public String getPayeeLogonId() {
        return this.payeeLogonId;
    }

    public CreateDigitalkeyPreauthpayRequest setEnablePayChannels(String enablePayChannels) {
        this.enablePayChannels = enablePayChannels;
        return this;
    }
    public String getEnablePayChannels() {
        return this.enablePayChannels;
    }

}
