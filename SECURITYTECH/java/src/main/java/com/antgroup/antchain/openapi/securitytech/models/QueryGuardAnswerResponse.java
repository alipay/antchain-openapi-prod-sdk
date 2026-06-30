// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryGuardAnswerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 检测数据ID
    @NameInMap("request_id")
    public String requestId;

    // 是否安全无风险
    @NameInMap("safe")
    public Boolean safe;

    // 拦截: BLOCK
    // 安全代答: SECURITY_ANSWER
    // 红色GPT安全代答: REDGPT_ANSWER
    // 回答里补充安全提示: SECURITY_TIP
    @NameInMap("action_code")
    public String actionCode;

    // 安全提示增强的文案、安全代答的回答、回答里补充的安全提示
    @NameInMap("action_msg")
    public String actionMsg;

    // 终止会话: END_SESSION
    // 撤回提问: RECALL_QUERY
    @NameInMap("session_action")
    public String sessionAction;

    public static QueryGuardAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardAnswerResponse self = new QueryGuardAnswerResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuardAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGuardAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGuardAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGuardAnswerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuardAnswerResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public QueryGuardAnswerResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QueryGuardAnswerResponse setActionMsg(String actionMsg) {
        this.actionMsg = actionMsg;
        return this;
    }
    public String getActionMsg() {
        return this.actionMsg;
    }

    public QueryGuardAnswerResponse setSessionAction(String sessionAction) {
        this.sessionAction = sessionAction;
        return this;
    }
    public String getSessionAction() {
        return this.sessionAction;
    }

}
