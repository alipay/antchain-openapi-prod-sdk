// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AgentSessionVO extends TeaModel {
    // 会话ID
    /**
     * <strong>example:</strong>
     * <p>7468486322254688256</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>7468486322254688256</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 会话创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-06-24 21:32:59</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 会话修改时间
    /**
     * <strong>example:</strong>
     * <p>2026-06-24 21:32:59</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static AgentSessionVO build(java.util.Map<String, ?> map) throws Exception {
        AgentSessionVO self = new AgentSessionVO();
        return TeaModel.build(map, self);
    }

    public AgentSessionVO setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AgentSessionVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AgentSessionVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentSessionVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
