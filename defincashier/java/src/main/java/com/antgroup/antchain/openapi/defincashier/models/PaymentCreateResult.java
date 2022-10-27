// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaymentCreateResult extends TeaModel {
    // 	
    // 会员所属业务平台在智能科技的会员ID
    @NameInMap("platform_member_id")
    @Validation(required = true)
    public String platformMemberId;

    // 付款方在外部业务平台的用户ID
    @NameInMap("out_payer_id")
    @Validation(required = true)
    public String outPayerId;

    // 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
    @NameInMap("out_payee_id")
    public String outPayeeId;

    // 外部业务平台原始交易号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
    @NameInMap("order_state")
    public String orderState;

    // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
    @NameInMap("fund_mode")
    public String fundMode;

    // 收款方账号
    @NameInMap("payee_account")
    public AccountDTO payeeAccount;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static PaymentCreateResult build(java.util.Map<String, ?> map) throws Exception {
        PaymentCreateResult self = new PaymentCreateResult();
        return TeaModel.build(map, self);
    }

    public PaymentCreateResult setPlatformMemberId(String platformMemberId) {
        this.platformMemberId = platformMemberId;
        return this;
    }
    public String getPlatformMemberId() {
        return this.platformMemberId;
    }

    public PaymentCreateResult setOutPayerId(String outPayerId) {
        this.outPayerId = outPayerId;
        return this;
    }
    public String getOutPayerId() {
        return this.outPayerId;
    }

    public PaymentCreateResult setOutPayeeId(String outPayeeId) {
        this.outPayeeId = outPayeeId;
        return this;
    }
    public String getOutPayeeId() {
        return this.outPayeeId;
    }

    public PaymentCreateResult setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public PaymentCreateResult setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public PaymentCreateResult setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public PaymentCreateResult setPayeeAccount(AccountDTO payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }
    public AccountDTO getPayeeAccount() {
        return this.payeeAccount;
    }

    public PaymentCreateResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PaymentCreateResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
