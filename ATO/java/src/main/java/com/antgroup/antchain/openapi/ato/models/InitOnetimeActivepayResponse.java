// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitOnetimeActivepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 字符串
    @NameInMap("order_str")
    public String orderStr;

    public static InitOnetimeActivepayResponse build(java.util.Map<String, ?> map) throws Exception {
        InitOnetimeActivepayResponse self = new InitOnetimeActivepayResponse();
        return TeaModel.build(map, self);
    }

    public InitOnetimeActivepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitOnetimeActivepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitOnetimeActivepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitOnetimeActivepayResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public InitOnetimeActivepayResponse setOrderStr(String orderStr) {
        this.orderStr = orderStr;
        return this;
    }
    public String getOrderStr() {
        return this.orderStr;
    }

}
