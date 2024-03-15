// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ActivePayOrder extends TeaModel {
    // 支付宝支付订单号，用于拉起主动支付页面
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String tradeNo;

    // 状态
    // INIT：交易创建
    // FAILED：付款失败
    // SUCCESS：付款成功
    @NameInMap("trade_status")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String tradeStatus;

    // 状态原因码
    @NameInMap("status_reason_code")
    public String statusReasonCode;

    // 超时关闭
    @NameInMap("status_reason_msg")
    public String statusReasonMsg;

    // 本次交易支付的订单金额，单位为分
    // 付款成功或付款成功之后的状态必填
    @NameInMap("total_amount")
    public Long totalAmount;

    // 用户在交易中支付的金额，单位为分
    // 付款成功的状态必填
    @NameInMap("paid_amount")
    public Long paidAmount;

    // 商家在交易中实际收到的款项，单位为分
    // 付款成功的状态必填
    @NameInMap("receipt_amount")
    public Long receiptAmount;

    // 交易支付时间
    // 付款成功的状态必填
    @NameInMap("gmt_pay")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtPay;

    public static ActivePayOrder build(java.util.Map<String, ?> map) throws Exception {
        ActivePayOrder self = new ActivePayOrder();
        return TeaModel.build(map, self);
    }

    public ActivePayOrder setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ActivePayOrder setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public ActivePayOrder setStatusReasonCode(String statusReasonCode) {
        this.statusReasonCode = statusReasonCode;
        return this;
    }
    public String getStatusReasonCode() {
        return this.statusReasonCode;
    }

    public ActivePayOrder setStatusReasonMsg(String statusReasonMsg) {
        this.statusReasonMsg = statusReasonMsg;
        return this;
    }
    public String getStatusReasonMsg() {
        return this.statusReasonMsg;
    }

    public ActivePayOrder setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public ActivePayOrder setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }
    public Long getPaidAmount() {
        return this.paidAmount;
    }

    public ActivePayOrder setReceiptAmount(Long receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public Long getReceiptAmount() {
        return this.receiptAmount;
    }

    public ActivePayOrder setGmtPay(String gmtPay) {
        this.gmtPay = gmtPay;
        return this;
    }
    public String getGmtPay() {
        return this.gmtPay;
    }

}
