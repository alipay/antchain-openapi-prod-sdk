// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentAtoAInfo extends TeaModel {
    // endpoint
    /**
     * <strong>example:</strong>
     * <p><a href="http://7998602d71064213adcd676b2baa0f69.llm.n.xalipay.cc">http://7998602d71064213adcd676b2baa0f69.llm.n.xalipay.cc</a></p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // agent_card_url
    /**
     * <strong>example:</strong>
     * <p><a href="http://7998602d71064213adcd676b2baa0f69.llm.n.xalipay.cc">http://7998602d71064213adcd676b2baa0f69.llm.n.xalipay.cc</a></p>
     */
    @NameInMap("agent_card_url")
    public String agentCardUrl;

    // A2A 协议版本
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("protocol_version")
    public String protocolVersion;

    // A2A 传输协议列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;JSONRPC&quot;]</p>
     */
    @NameInMap("transports")
    public java.util.List<String> transports;

    public static AgentAtoAInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentAtoAInfo self = new AgentAtoAInfo();
        return TeaModel.build(map, self);
    }

    public AgentAtoAInfo setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AgentAtoAInfo setAgentCardUrl(String agentCardUrl) {
        this.agentCardUrl = agentCardUrl;
        return this;
    }
    public String getAgentCardUrl() {
        return this.agentCardUrl;
    }

    public AgentAtoAInfo setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public AgentAtoAInfo setTransports(java.util.List<String> transports) {
        this.transports = transports;
        return this;
    }
    public java.util.List<String> getTransports() {
        return this.transports;
    }

}
