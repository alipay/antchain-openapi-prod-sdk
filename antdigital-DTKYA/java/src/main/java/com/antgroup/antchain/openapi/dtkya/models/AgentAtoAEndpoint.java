// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentAtoAEndpoint extends TeaModel {
    // A2A 服务地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://agent.example.com/a2a">https://agent.example.com/a2a</a></p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    public static AgentAtoAEndpoint build(java.util.Map<String, ?> map) throws Exception {
        AgentAtoAEndpoint self = new AgentAtoAEndpoint();
        return TeaModel.build(map, self);
    }

    public AgentAtoAEndpoint setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

}
