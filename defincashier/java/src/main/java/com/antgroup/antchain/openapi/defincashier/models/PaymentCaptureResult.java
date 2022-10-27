// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaymentCaptureResult extends TeaModel {
    // 外部业务平台原始交易号
    @NameInMap("out_order_id")
    @Validation(required = true)
    public String outOrderId;

    // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
    // 
    @NameInMap("fund_mode")
    public String fundMode;

    // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
    @NameInMap("order_state")
    public String orderState;

    // 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
    @NameInMap("available_amount")
    public Long availableAmount;

    // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
    @NameInMap("available_currency")
    public String availableCurrency;

    // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
    @NameInMap("state")
    public String state;

    // 外部请求ID，需要支持部分请款/退款的平台必填
    // 
    @NameInMap("out_request_id")
    public String outRequestId;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static PaymentCaptureResult build(java.util.Map<String, ?> map) throws Exception {
        PaymentCaptureResult self = new PaymentCaptureResult();
        return TeaModel.build(map, self);
    }

    public PaymentCaptureResult setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public PaymentCaptureResult setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public PaymentCaptureResult setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public PaymentCaptureResult setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public Long getAvailableAmount() {
        return this.availableAmount;
    }

    public PaymentCaptureResult setAvailableCurrency(String availableCurrency) {
        this.availableCurrency = availableCurrency;
        return this;
    }
    public String getAvailableCurrency() {
        return this.availableCurrency;
    }

    public PaymentCaptureResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PaymentCaptureResult setOutRequestId(String outRequestId) {
        this.outRequestId = outRequestId;
        return this;
    }
    public String getOutRequestId() {
        return this.outRequestId;
    }

    public PaymentCaptureResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PaymentCaptureResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
