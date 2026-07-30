// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgePetorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部交易单号	String
    @NameInMap("trade_no_inner")
    public String tradeNoInner;

    // 支付宝订单号	String
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 交易状态
    @NameInMap("status")
    public String status;

    // 交易的订单金额	String
    @NameInMap("amount")
    public String amount;

    // 买家在支付宝的用户id
    @NameInMap("buyer_user_id")
    public String buyerUserId;

    // 本次交易打款给卖家的时间
    @NameInMap("send_pay_date")
    public String sendPayDate;

    // 实收金额
    @NameInMap("receipt_amount")
    public String receiptAmount;

    // 支付渠道编码
    @NameInMap("payment_channel_code")
    public String paymentChannelCode;

    // 支付机构编码	String
    @NameInMap("pay_institution_code")
    public String payInstitutionCode;

    // 分期期数
    @NameInMap("install_num")
    public String installNum;

    public static QueryDubbridgePetorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgePetorderResponse self = new QueryDubbridgePetorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgePetorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgePetorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgePetorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgePetorderResponse setTradeNoInner(String tradeNoInner) {
        this.tradeNoInner = tradeNoInner;
        return this;
    }
    public String getTradeNoInner() {
        return this.tradeNoInner;
    }

    public QueryDubbridgePetorderResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryDubbridgePetorderResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgePetorderResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public QueryDubbridgePetorderResponse setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
        return this;
    }
    public String getBuyerUserId() {
        return this.buyerUserId;
    }

    public QueryDubbridgePetorderResponse setSendPayDate(String sendPayDate) {
        this.sendPayDate = sendPayDate;
        return this;
    }
    public String getSendPayDate() {
        return this.sendPayDate;
    }

    public QueryDubbridgePetorderResponse setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public QueryDubbridgePetorderResponse setPaymentChannelCode(String paymentChannelCode) {
        this.paymentChannelCode = paymentChannelCode;
        return this;
    }
    public String getPaymentChannelCode() {
        return this.paymentChannelCode;
    }

    public QueryDubbridgePetorderResponse setPayInstitutionCode(String payInstitutionCode) {
        this.payInstitutionCode = payInstitutionCode;
        return this;
    }
    public String getPayInstitutionCode() {
        return this.payInstitutionCode;
    }

    public QueryDubbridgePetorderResponse setInstallNum(String installNum) {
        this.installNum = installNum;
        return this;
    }
    public String getInstallNum() {
        return this.installNum;
    }

}
