// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入账状态: 10-受理 20-在途 00-成功 99-失败
    @NameInMap("accountin_status")
    public String accountinStatus;

    // 交易时间
    @NameInMap("trade_time")
    public String tradeTime;

    public static QueryPfPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfPaymentResponse self = new QueryPfPaymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfPaymentResponse setAccountinStatus(String accountinStatus) {
        this.accountinStatus = accountinStatus;
        return this;
    }
    public String getAccountinStatus() {
        return this.accountinStatus;
    }

    public QueryPfPaymentResponse setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public String getTradeTime() {
        return this.tradeTime;
    }

}
