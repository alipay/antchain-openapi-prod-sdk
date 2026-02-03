// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagentjd.models;

import com.aliyun.tea.*;

public class Message extends TeaModel {
    // Parts is the container of the message content.
    @NameInMap("parts")
    public java.util.List<Part> parts;

    // Identifies the sender of the message.
    // USER role refers to communication from the client to the server.
    // AGENT role refers to communication from the server to the client.
    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("role")
    public String role;

    // The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
    /**
     * <strong>example:</strong>
     * <p>contextid</p>
     */
    @NameInMap("context_id")
    public String contextId;

    public static Message build(java.util.Map<String, ?> map) throws Exception {
        Message self = new Message();
        return TeaModel.build(map, self);
    }

    public Message setParts(java.util.List<Part> parts) {
        this.parts = parts;
        return this;
    }
    public java.util.List<Part> getParts() {
        return this.parts;
    }

    public Message setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Message setContextId(String contextId) {
        this.contextId = contextId;
        return this;
    }
    public String getContextId() {
        return this.contextId;
    }

}
