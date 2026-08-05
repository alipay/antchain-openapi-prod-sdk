// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ServiceChange extends TeaModel {
    // 枚举：ADD、UPDATE、REMOVE
    /**
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 目标或新增 service ID
    /**
     * <strong>example:</strong>
     * <p>did:antchain:xxx:xxx#agent-card</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // DID service 类型;ADD/UPDATE 时必填
    /**
     * <strong>example:</strong>
     * <p>AgentCardService</p>
     */
    @NameInMap("type")
    public String type;

    // 服务能力暴露端点
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/agents/agent-001/agent-card.json">https://example.com/agents/agent-001/agent-card.json</a></p>
     */
    @NameInMap("service_endpoint")
    public String serviceEndpoint;

    public static ServiceChange build(java.util.Map<String, ?> map) throws Exception {
        ServiceChange self = new ServiceChange();
        return TeaModel.build(map, self);
    }

    public ServiceChange setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ServiceChange setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ServiceChange setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ServiceChange setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

}
