// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentSearchA2A extends TeaModel {
    // A2A 服务地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://agent.example.com/a2a">https://agent.example.com/a2a</a></p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // Agent Card 地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://agent.example.com/card">https://agent.example.com/card</a></p>
     */
    @NameInMap("agent_card_url")
    public String agentCardUrl;

    // 协议版本
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("protocol_version")
    public String protocolVersion;

    // 传输协议列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;JSONRPC&quot;]</p>
     */
    @NameInMap("transports")
    public java.util.List<String> transports;

    public static AgentSearchA2A build(java.util.Map<String, ?> map) throws Exception {
        AgentSearchA2A self = new AgentSearchA2A();
        return TeaModel.build(map, self);
    }

    public AgentSearchA2A setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AgentSearchA2A setAgentCardUrl(String agentCardUrl) {
        this.agentCardUrl = agentCardUrl;
        return this;
    }
    public String getAgentCardUrl() {
        return this.agentCardUrl;
    }

    public AgentSearchA2A setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public AgentSearchA2A setTransports(java.util.List<String> transports) {
        this.transports = transports;
        return this;
    }
    public java.util.List<String> getTransports() {
        return this.transports;
    }

}
