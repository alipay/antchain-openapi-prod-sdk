// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class QueryMaxCopilotFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话id
    @NameInMap("session_id")
    public String sessionId;

    // 消息id
    @NameInMap("message_id")
    public String messageId;

    public static QueryMaxCopilotFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaxCopilotFileResponse self = new QueryMaxCopilotFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaxCopilotFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMaxCopilotFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMaxCopilotFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMaxCopilotFileResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryMaxCopilotFileResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
