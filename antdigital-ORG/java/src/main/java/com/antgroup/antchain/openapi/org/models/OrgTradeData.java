// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class OrgTradeData extends TeaModel {
    // 平台优惠金额。单位：元。
    /**
     * <strong>example:</strong>
     * <p>2000.99</p>
     */
    @NameInMap("discount_amount")
    @Validation(required = true)
    public String discountAmount;

    // 买家实付金额，单位为元，两位小数。
    /**
     * <strong>example:</strong>
     * <p>20000.11</p>
     */
    @NameInMap("buyer_pay_amount")
    @Validation(required = true)
    public String buyerPayAmount;

    // 买家在支付宝的用户id
    /**
     * <strong>example:</strong>
     * <p>2088xxx</p>
     */
    @NameInMap("buyer_user_id")
    @Validation(required = true)
    public String buyerUserId;

    // 支付宝交易号，交易单主键id
    /**
     * <strong>example:</strong>
     * <p>202503060003000000000001</p>
     */
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 支付宝订单号
    /**
     * <strong>example:</strong>
     * <p>2025030622001464011433929526</p>
     */
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 本次交易打款给卖家的时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("send_pay_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String sendPayDate;

    // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
    /**
     * <strong>example:</strong>
     * <p>TRADE_SUCCESS</p>
     */
    @NameInMap("trade_status")
    @Validation(required = true)
    public String tradeStatus;

    // 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
    /**
     * <strong>example:</strong>
     * <p>20.10</p>
     */
    @NameInMap("receipt_amount")
    @Validation(required = true)
    public String receiptAmount;

    // 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
    /**
     * <strong>example:</strong>
     * <p>200.11</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static OrgTradeData build(java.util.Map<String, ?> map) throws Exception {
        OrgTradeData self = new OrgTradeData();
        return TeaModel.build(map, self);
    }

    public OrgTradeData setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public OrgTradeData setBuyerPayAmount(String buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
        return this;
    }
    public String getBuyerPayAmount() {
        return this.buyerPayAmount;
    }

    public OrgTradeData setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
        return this;
    }
    public String getBuyerUserId() {
        return this.buyerUserId;
    }

    public OrgTradeData setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public OrgTradeData setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public OrgTradeData setSendPayDate(String sendPayDate) {
        this.sendPayDate = sendPayDate;
        return this;
    }
    public String getSendPayDate() {
        return this.sendPayDate;
    }

    public OrgTradeData setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public OrgTradeData setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public OrgTradeData setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
