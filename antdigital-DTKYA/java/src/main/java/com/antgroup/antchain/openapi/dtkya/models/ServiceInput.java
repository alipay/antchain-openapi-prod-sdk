// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ServiceInput extends TeaModel {
    // serviceId
    /**
     * <strong>example:</strong>
     * <p>did:antchain:a001:0123456789abcdef0123456789abcdef#agent-card</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 可自定义，建议：InstitutionProfileService、AgentCardService
    /**
     * <strong>example:</strong>
     * <p>InstitutionProfileService</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 能够提供能力的网络端点
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/agents/agent-001/card">https://example.com/agents/agent-001/card</a></p>
     */
    @NameInMap("service_endpoint")
    @Validation(required = true)
    public String serviceEndpoint;

    public static ServiceInput build(java.util.Map<String, ?> map) throws Exception {
        ServiceInput self = new ServiceInput();
        return TeaModel.build(map, self);
    }

    public ServiceInput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ServiceInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ServiceInput setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

}
