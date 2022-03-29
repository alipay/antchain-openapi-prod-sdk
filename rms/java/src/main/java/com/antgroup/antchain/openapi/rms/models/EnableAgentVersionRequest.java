// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class EnableAgentVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // agent版本号
    @NameInMap("agent_version")
    @Validation(required = true)
    public String agentVersion;

    // agent存储url
    @NameInMap("agent_url")
    @Validation(required = true)
    public String agentUrl;

    public static EnableAgentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAgentVersionRequest self = new EnableAgentVersionRequest();
        return TeaModel.build(map, self);
    }

    public EnableAgentVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableAgentVersionRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public EnableAgentVersionRequest setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }
    public String getAgentUrl() {
        return this.agentUrl;
    }

}
