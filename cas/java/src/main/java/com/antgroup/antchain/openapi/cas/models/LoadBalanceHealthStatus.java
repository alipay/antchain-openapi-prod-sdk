// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class LoadBalanceHealthStatus extends TeaModel {
    // server_id
    @NameInMap("server_id")
    @Validation(required = true)
    public String serverId;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static LoadBalanceHealthStatus build(java.util.Map<String, ?> map) throws Exception {
        LoadBalanceHealthStatus self = new LoadBalanceHealthStatus();
        return TeaModel.build(map, self);
    }

    public LoadBalanceHealthStatus setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public LoadBalanceHealthStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
