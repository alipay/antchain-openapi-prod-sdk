// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class CubeNode extends TeaModel {
    // 无
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    //  
    @NameInMap("endpoints")
    @Validation(required = true)
    public java.util.List<NodeEndpoint> endpoints;

    //  
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    //  
    @NameInMap("node_id_hash")
    @Validation(required = true)
    public String nodeIdHash;

    //  
    @NameInMap("node_public_key")
    @Validation(required = true)
    public String nodePublicKey;

    //  
    @NameInMap("is_connected")
    @Validation(required = true)
    public Boolean isConnected;

    //  
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    public static CubeNode build(java.util.Map<String, ?> map) throws Exception {
        CubeNode self = new CubeNode();
        return TeaModel.build(map, self);
    }

    public CubeNode setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CubeNode setEndpoints(java.util.List<NodeEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<NodeEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public CubeNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CubeNode setNodeIdHash(String nodeIdHash) {
        this.nodeIdHash = nodeIdHash;
        return this;
    }
    public String getNodeIdHash() {
        return this.nodeIdHash;
    }

    public CubeNode setNodePublicKey(String nodePublicKey) {
        this.nodePublicKey = nodePublicKey;
        return this;
    }
    public String getNodePublicKey() {
        return this.nodePublicKey;
    }

    public CubeNode setIsConnected(Boolean isConnected) {
        this.isConnected = isConnected;
        return this;
    }
    public Boolean getIsConnected() {
        return this.isConnected;
    }

    public CubeNode setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
