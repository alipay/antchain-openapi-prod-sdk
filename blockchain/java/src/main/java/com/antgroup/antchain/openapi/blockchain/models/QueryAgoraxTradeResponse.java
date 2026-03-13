// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 商户订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 交易状态
    @NameInMap("trade_status")
    public String tradeStatus;

    // 订单金额
    @NameInMap("total_amount")
    public String totalAmount;

    // 买家支付宝用户唯一标识  
    @NameInMap("buyer_open_id")
    public String buyerOpenId;

    // 实收金额
    @NameInMap("receipt_amount")
    public String receiptAmount;

    public static QueryAgoraxTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxTradeResponse self = new QueryAgoraxTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgoraxTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgoraxTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgoraxTradeResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryAgoraxTradeResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryAgoraxTradeResponse setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public QueryAgoraxTradeResponse setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public QueryAgoraxTradeResponse setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
        return this;
    }
    public String getBuyerOpenId() {
        return this.buyerOpenId;
    }

    public QueryAgoraxTradeResponse setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

}
