// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsOutcallCallbackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外呼结果
    @NameInMap("data")
    public java.util.List<OutcallBackResult> data;

    public static QueryAntdigitalMediasmsOutcallCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsOutcallCallbackResponse self = new QueryAntdigitalMediasmsOutcallCallbackResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsOutcallCallbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalMediasmsOutcallCallbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalMediasmsOutcallCallbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalMediasmsOutcallCallbackResponse setData(java.util.List<OutcallBackResult> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OutcallBackResult> getData() {
        return this.data;
    }

}
