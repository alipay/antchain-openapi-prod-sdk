// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ActionBlockchainBotIotagentSessioncontextResponse extends TeaModel {
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

    // 原会话 ID
    @NameInMap("session_id")
    public String sessionId;

    // 失败原因（FAILED 时返回）
    @NameInMap("failure_reason")
    public String failureReason;

    public static ActionBlockchainBotIotagentSessioncontextResponse build(java.util.Map<String, ?> map) throws Exception {
        ActionBlockchainBotIotagentSessioncontextResponse self = new ActionBlockchainBotIotagentSessioncontextResponse();
        return TeaModel.build(map, self);
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ActionBlockchainBotIotagentSessioncontextResponse setFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    public String getFailureReason() {
        return this.failureReason;
    }

}
