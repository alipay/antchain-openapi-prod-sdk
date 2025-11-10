// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelDubbridgeAlipayTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 订单状态 
    // TRADE_WAIT_PAY（交易待支付）、
    // TRADE_CANCELED（未付款交易超时关闭）、
    // TRADE_SUCCESS（交易支付成功）、
    // TRADE_REFUND_SUCCESS（交易退款成功）
    // 
    @NameInMap("trade_status")
    public String tradeStatus;

    public static CancelDubbridgeAlipayTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDubbridgeAlipayTradeResponse self = new CancelDubbridgeAlipayTradeResponse();
        return TeaModel.build(map, self);
    }

    public CancelDubbridgeAlipayTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelDubbridgeAlipayTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelDubbridgeAlipayTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelDubbridgeAlipayTradeResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CancelDubbridgeAlipayTradeResponse setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

}
