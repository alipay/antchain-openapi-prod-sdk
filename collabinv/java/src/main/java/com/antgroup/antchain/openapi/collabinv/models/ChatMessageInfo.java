// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ChatMessageInfo extends TeaModel {
    // 会话ID
    /**
     * <strong>example:</strong>
     * <p>3330003</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 提问内容
    /**
     * <strong>example:</strong>
     * <p>提问内容</p>
     */
    @NameInMap("query")
    public String query;

    // 恢复内容
    /**
     * <strong>example:</strong>
     * <p>恢复内容</p>
     */
    @NameInMap("answer")
    public String answer;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2025-04-24 17:54:23</p>
     */
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    public static ChatMessageInfo build(java.util.Map<String, ?> map) throws Exception {
        ChatMessageInfo self = new ChatMessageInfo();
        return TeaModel.build(map, self);
    }

    public ChatMessageInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatMessageInfo setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ChatMessageInfo setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public ChatMessageInfo setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

}
