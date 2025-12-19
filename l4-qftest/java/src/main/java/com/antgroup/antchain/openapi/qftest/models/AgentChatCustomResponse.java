// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class AgentChatCustomResponse extends TeaModel {
    // 消息id
    /**
     * <strong>example:</strong>
     * <p>2025120800001</p>
     */
    @NameInMap("message_id")
    public String messageId;

    // 内容
    /**
     * <strong>example:</strong>
     * <p>好的，接下来...</p>
     */
    @NameInMap("content")
    public String content;

    public static AgentChatCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        AgentChatCustomResponse self = new AgentChatCustomResponse();
        return TeaModel.build(map, self);
    }

    public AgentChatCustomResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AgentChatCustomResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
