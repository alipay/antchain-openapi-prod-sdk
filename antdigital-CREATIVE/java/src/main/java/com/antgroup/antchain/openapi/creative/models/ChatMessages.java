// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ChatMessages extends TeaModel {
    // 角色
    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 文本内容
    /**
     * <strong>example:</strong>
     * <p>文本内容</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static ChatMessages build(java.util.Map<String, ?> map) throws Exception {
        ChatMessages self = new ChatMessages();
        return TeaModel.build(map, self);
    }

    public ChatMessages setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ChatMessages setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
