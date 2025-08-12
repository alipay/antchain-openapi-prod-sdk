// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class MayaRedGptResponseDTO extends TeaModel {
    // 消息的ID
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 请求ID
    /**
     * <strong>example:</strong>
     * <p>4564546</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 会话ID
    /**
     * <strong>example:</strong>
     * <p>312414124</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 应答内容
    /**
     * <strong>example:</strong>
     * <p>你可以问我信息安全的问题</p>
     */
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    // 应答内容格式
    /**
     * <strong>example:</strong>
     * <p>PLAINTEXT</p>
     */
    @NameInMap("answer_format")
    @Validation(required = true)
    public String answerFormat;

    // 是否回答结束
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("answer_end")
    @Validation(required = true)
    public Boolean answerEnd;

    // 是否问题有风险
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("safe")
    @Validation(required = true)
    public Boolean safe;

    public static MayaRedGptResponseDTO build(java.util.Map<String, ?> map) throws Exception {
        MayaRedGptResponseDTO self = new MayaRedGptResponseDTO();
        return TeaModel.build(map, self);
    }

    public MayaRedGptResponseDTO setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public MayaRedGptResponseDTO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MayaRedGptResponseDTO setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public MayaRedGptResponseDTO setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public MayaRedGptResponseDTO setAnswerFormat(String answerFormat) {
        this.answerFormat = answerFormat;
        return this;
    }
    public String getAnswerFormat() {
        return this.answerFormat;
    }

    public MayaRedGptResponseDTO setAnswerEnd(Boolean answerEnd) {
        this.answerEnd = answerEnd;
        return this;
    }
    public Boolean getAnswerEnd() {
        return this.answerEnd;
    }

    public MayaRedGptResponseDTO setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

}
