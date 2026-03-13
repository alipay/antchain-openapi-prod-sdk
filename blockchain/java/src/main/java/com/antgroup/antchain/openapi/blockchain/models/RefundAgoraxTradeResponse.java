// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RefundAgoraxTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 用户的登录id
    @NameInMap("buyer_logon_id")
    public String buyerLogonId;

    // 退款总金额
    @NameInMap("refund_fee")
    public String refundFee;

    public static RefundAgoraxTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundAgoraxTradeResponse self = new RefundAgoraxTradeResponse();
        return TeaModel.build(map, self);
    }

    public RefundAgoraxTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RefundAgoraxTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RefundAgoraxTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RefundAgoraxTradeResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefundAgoraxTradeResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public RefundAgoraxTradeResponse setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
        return this;
    }
    public String getBuyerLogonId() {
        return this.buyerLogonId;
    }

    public RefundAgoraxTradeResponse setRefundFee(String refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public String getRefundFee() {
        return this.refundFee;
    }

}
