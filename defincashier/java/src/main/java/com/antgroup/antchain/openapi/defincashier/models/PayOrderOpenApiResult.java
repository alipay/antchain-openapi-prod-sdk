// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PayOrderOpenApiResult extends TeaModel {
    // 会员所属业务平台在智能科技的会员ID
    @NameInMap("platform_member_id")
    @Validation(required = true)
    public String platformMemberId;

    // 外部订单号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 资金模式
    @NameInMap("fund_mode")
    @Validation(required = true)
    public String fundMode;

    // 支付提交状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 交易单状态
    @NameInMap("order_state")
    @Validation(required = true)
    public String orderState;

    // 收款账户
    @NameInMap("payee_account")
    @Validation(required = true)
    public AccountDTO payeeAccount;

    // 银行或其他支付服务提供方支付结果描述
    @NameInMap("payment_error_message")
    @Validation(required = true)
    public String paymentErrorMessage;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    @Validation(required = true)
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    @Validation(required = true)
    public String subMsg;

    // 蚂蚁交易单ID
    @NameInMap("trade_id")
    @Validation(required = true)
    public String tradeId;

    public static PayOrderOpenApiResult build(java.util.Map<String, ?> map) throws Exception {
        PayOrderOpenApiResult self = new PayOrderOpenApiResult();
        return TeaModel.build(map, self);
    }

    public PayOrderOpenApiResult setPlatformMemberId(String platformMemberId) {
        this.platformMemberId = platformMemberId;
        return this;
    }
    public String getPlatformMemberId() {
        return this.platformMemberId;
    }

    public PayOrderOpenApiResult setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public PayOrderOpenApiResult setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public PayOrderOpenApiResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PayOrderOpenApiResult setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public PayOrderOpenApiResult setPayeeAccount(AccountDTO payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }
    public AccountDTO getPayeeAccount() {
        return this.payeeAccount;
    }

    public PayOrderOpenApiResult setPaymentErrorMessage(String paymentErrorMessage) {
        this.paymentErrorMessage = paymentErrorMessage;
        return this;
    }
    public String getPaymentErrorMessage() {
        return this.paymentErrorMessage;
    }

    public PayOrderOpenApiResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PayOrderOpenApiResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public PayOrderOpenApiResult setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

}
