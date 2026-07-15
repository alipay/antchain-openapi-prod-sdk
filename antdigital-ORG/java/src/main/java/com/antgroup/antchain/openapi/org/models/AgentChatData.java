// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class AgentChatData extends TeaModel {
    // 会话id	
    // 
    /**
     * <strong>example:</strong>
     * <p>202509230001000000051455</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 消息id	
    // 
    /**
     * <strong>example:</strong>
     * <p>202509230003000000046715</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 是否已完成
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("finished")
    @Validation(required = true)
    public Boolean finished;

    // text: 文本 mage: 图片 stream：流式文本
    /**
     * <strong>example:</strong>
     * <p>card</p>
     */
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 内容
    /**
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;整体数据一览&quot;,&quot;type&quot;:&quot;card&quot;,&quot;message&quot;:[{&quot;task_name&quot;:&quot;预算消耗&quot;,&quot;task_value&quot;:&quot;12664.16&quot;,&quot;meta&quot;:{&quot;type&quot;:&quot;AreaChart&quot;},&quot;data&quot;:[{&quot;title&quot;:&quot;2023-08-01&quot;,&quot;value&quot;:&quot;13800.92&quot;}]}]}</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static AgentChatData build(java.util.Map<String, ?> map) throws Exception {
        AgentChatData self = new AgentChatData();
        return TeaModel.build(map, self);
    }

    public AgentChatData setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AgentChatData setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AgentChatData setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public AgentChatData setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public AgentChatData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
