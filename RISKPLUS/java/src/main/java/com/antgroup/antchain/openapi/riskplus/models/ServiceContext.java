// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ServiceContext extends TeaModel {
    // 客户端IP
    /**
     * <strong>example:</strong>
     * <p>10.214.138.14</p>
     */
    @NameInMap("client_ip")
    public String clientIp;

    // 客户端UMID
    /**
     * <strong>example:</strong>
     * <p>WV1bz5927da956db072d3001792dcc67e</p>
     */
    @NameInMap("client_pcidguid")
    public String clientPcidguid;

    // 服务器名
    /**
     * <strong>example:</strong>
     * <p>server</p>
     */
    @NameInMap("server_name")
    public String serverName;

    // 会话ID
    /**
     * <strong>example:</strong>
     * <p>RZ1 2cz9oSg1GTGtGp9CwYtBbZMcD8DmobilecashierRZ12</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    // 用户ID
    /**
     * <strong>example:</strong>
     * <p>2088522384403582</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static ServiceContext build(java.util.Map<String, ?> map) throws Exception {
        ServiceContext self = new ServiceContext();
        return TeaModel.build(map, self);
    }

    public ServiceContext setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ServiceContext setClientPcidguid(String clientPcidguid) {
        this.clientPcidguid = clientPcidguid;
        return this;
    }
    public String getClientPcidguid() {
        return this.clientPcidguid;
    }

    public ServiceContext setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public ServiceContext setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ServiceContext setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
