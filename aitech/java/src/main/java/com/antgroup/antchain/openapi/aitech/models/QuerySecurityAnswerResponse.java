// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityAnswerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
    @NameInMap("action_code")
    public String actionCode;

    // 风险标签
    @NameInMap("labels")
    public java.util.List<LabelModel> labels;

    // 命中的自定义黑词列表
    @NameInMap("customize_risk_word")
    public java.util.List<String> customizeRiskWord;

    // 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
    // 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
    // 2. done：处理完成，请参考actionCode及对应的风险标签信息
    @NameInMap("flow_process_state")
    public String flowProcessState;

    // 流式内容ID
    @NameInMap("flow_msg_id")
    public String flowMsgId;

    // 表示是同一个Q&A
    @NameInMap("message_id")
    public String messageId;

    // 兜底话术
    @NameInMap("security_answer")
    public String securityAnswer;

    public static QuerySecurityAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityAnswerResponse self = new QuerySecurityAnswerResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityAnswerResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QuerySecurityAnswerResponse setLabels(java.util.List<LabelModel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelModel> getLabels() {
        return this.labels;
    }

    public QuerySecurityAnswerResponse setCustomizeRiskWord(java.util.List<String> customizeRiskWord) {
        this.customizeRiskWord = customizeRiskWord;
        return this;
    }
    public java.util.List<String> getCustomizeRiskWord() {
        return this.customizeRiskWord;
    }

    public QuerySecurityAnswerResponse setFlowProcessState(String flowProcessState) {
        this.flowProcessState = flowProcessState;
        return this;
    }
    public String getFlowProcessState() {
        return this.flowProcessState;
    }

    public QuerySecurityAnswerResponse setFlowMsgId(String flowMsgId) {
        this.flowMsgId = flowMsgId;
        return this;
    }
    public String getFlowMsgId() {
        return this.flowMsgId;
    }

    public QuerySecurityAnswerResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityAnswerResponse setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
        return this;
    }
    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

}
