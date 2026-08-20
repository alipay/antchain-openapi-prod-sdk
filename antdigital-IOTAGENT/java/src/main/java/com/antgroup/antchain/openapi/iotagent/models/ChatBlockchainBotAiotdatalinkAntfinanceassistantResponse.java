// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话ID,多轮场景需要回传
    @NameInMap("session_id")
    public String sessionId;

    // 扩展参数（JSON 字符串）
    @NameInMap("ext_params")
    public String extParams;

    // 本轮对话唯一ID
    @NameInMap("chat_id")
    public String chatId;

    // 响应文本
    @NameInMap("response")
    public String response;

    // 回复置信度分数
    @NameInMap("score")
    public String score;

    // 响应标题
    @NameInMap("response_title")
    public String responseTitle;

    // 回复生效的条件
    @NameInMap("response_condition")
    public String responseCondition;

    public static ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse build(java.util.Map<String, ?> map) throws Exception {
        ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse self = new ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse();
        return TeaModel.build(map, self);
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setResponseTitle(String responseTitle) {
        this.responseTitle = responseTitle;
        return this;
    }
    public String getResponseTitle() {
        return this.responseTitle;
    }

    public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse setResponseCondition(String responseCondition) {
        this.responseCondition = responseCondition;
        return this;
    }
    public String getResponseCondition() {
        return this.responseCondition;
    }

}
