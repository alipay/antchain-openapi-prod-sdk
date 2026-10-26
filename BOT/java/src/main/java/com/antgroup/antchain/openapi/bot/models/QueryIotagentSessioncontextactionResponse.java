// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentSessioncontextactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作 ID
    @NameInMap("operation_id")
    public String operationId;

    // 操作状态：RUNNING / SUCCEEDED / FAILED
    @NameInMap("status")
    public String status;

    // 会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 失败原因（FAILED 时返回）
    @NameInMap("failure_reason")
    public String failureReason;

    public static QueryIotagentSessioncontextactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentSessioncontextactionResponse self = new QueryIotagentSessioncontextactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotagentSessioncontextactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotagentSessioncontextactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotagentSessioncontextactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotagentSessioncontextactionResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public QueryIotagentSessioncontextactionResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryIotagentSessioncontextactionResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryIotagentSessioncontextactionResponse setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    public String getFailureReason() {
        return this.failureReason;
    }

}
