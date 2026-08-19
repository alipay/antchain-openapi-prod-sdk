// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class SessionInfo extends TeaModel {
    // 会话名称
    /**
     * <strong>example:</strong>
     * <p>碳矩阵智能体</p>
     */
    @NameInMap("session_name")
    @Validation(required = true)
    public String sessionName;

    // 会话id
    /**
     * <strong>example:</strong>
     * <p>会话id</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    public static SessionInfo build(java.util.Map<String, ?> map) throws Exception {
        SessionInfo self = new SessionInfo();
        return TeaModel.build(map, self);
    }

    public SessionInfo setSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }
    public String getSessionName() {
        return this.sessionName;
    }

    public SessionInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
