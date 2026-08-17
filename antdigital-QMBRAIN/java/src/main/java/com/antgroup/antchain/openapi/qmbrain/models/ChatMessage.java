// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ChatMessage extends TeaModel {
    // 橘色
    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 请求内容
    /**
     * <strong>example:</strong>
     * <p>Hello, how are you?</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ChatMessage build(java.util.Map<String, ?> map) throws Exception {
        ChatMessage self = new ChatMessage();
        return TeaModel.build(map, self);
    }

    public ChatMessage setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ChatMessage setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
