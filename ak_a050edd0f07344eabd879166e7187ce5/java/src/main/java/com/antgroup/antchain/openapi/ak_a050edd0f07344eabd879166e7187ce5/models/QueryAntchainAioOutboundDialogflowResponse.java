// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class QueryAntchainAioOutboundDialogflowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    // 
    @NameInMap("success")
    public Boolean success;

    // 请求结果说明
    // 
    @NameInMap("message")
    public String message;

    // 接口业务数据
    // 
    @NameInMap("data")
    public OutboundDialogFlowDetailResponseData data;

    // traceId
    @NameInMap("trace_id")
    public String traceId;

    public static QueryAntchainAioOutboundDialogflowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAioOutboundDialogflowResponse self = new QueryAntchainAioOutboundDialogflowResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAioOutboundDialogflowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAioOutboundDialogflowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAioOutboundDialogflowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAioOutboundDialogflowResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAntchainAioOutboundDialogflowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAntchainAioOutboundDialogflowResponse setData(OutboundDialogFlowDetailResponseData data) {
        this.data = data;
        return this;
    }
    public OutboundDialogFlowDetailResponseData getData() {
        return this.data;
    }

    public QueryAntchainAioOutboundDialogflowResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
