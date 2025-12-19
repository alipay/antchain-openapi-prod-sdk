// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class AgentSessionMessageData extends TeaModel {
    // 会话id
    /**
     * <strong>example:</strong>
     * <p>会话id</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 消息编号
    /**
     * <strong>example:</strong>
     * <p>消息编号</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-31 00:00:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 对话请求内容
    /**
     * <strong>example:</strong>
     * <p>对话请求内容</p>
     */
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    // 对话响应内容
    /**
     * <strong>example:</strong>
     * <p>对话响应内容</p>
     */
    @NameInMap("response")
    @Validation(required = true)
    public String response;

    // 对话状态
    /**
     * <strong>example:</strong>
     * <p>对话状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 会话结果(错误)信息
    /**
     * <strong>example:</strong>
     * <p>会话结果(错误)信息</p>
     */
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 卡片编辑的业务数据
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("custom_data")
    @Validation(required = true)
    public String customData;

    // 卡片编辑后的内容
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("custom_response")
    @Validation(required = true)
    public String customResponse;

    // 是否可编辑
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("editable")
    @Validation(required = true)
    public Boolean editable;

    public static AgentSessionMessageData build(java.util.Map<String, ?> map) throws Exception {
        AgentSessionMessageData self = new AgentSessionMessageData();
        return TeaModel.build(map, self);
    }

    public AgentSessionMessageData setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AgentSessionMessageData setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AgentSessionMessageData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentSessionMessageData setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public AgentSessionMessageData setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public AgentSessionMessageData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentSessionMessageData setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AgentSessionMessageData setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
    public String getCustomData() {
        return this.customData;
    }

    public AgentSessionMessageData setCustomResponse(String customResponse) {
        this.customResponse = customResponse;
        return this;
    }
    public String getCustomResponse() {
        return this.customResponse;
    }

    public AgentSessionMessageData setEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }
    public Boolean getEditable() {
        return this.editable;
    }

}
