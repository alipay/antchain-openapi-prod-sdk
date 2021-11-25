// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainNodeInfo extends TeaModel {
    // block_height
    @NameInMap("block_height")
    public Long blockHeight;

    // node_name
    @NameInMap("node_name")
    public String nodeName;

    // status
    @NameInMap("status")
    public Boolean status;

    // version
    @NameInMap("version")
    public String version;

    // 节点id
    @NameInMap("node_id")
    public String nodeId;

    // 节点ip
    @NameInMap("node_ip")
    public String nodeIp;

    // 节点的端口
    @NameInMap("node_port")
    public String nodePort;

    // 节点类型
    @NameInMap("node_type")
    public String nodeType;

    // 节点状态
    @NameInMap("node_state")
    public String nodeState;

    // 节点来源
    @NameInMap("node_source")
    public String nodeSource;

    // 节点存储空间使用量
    @NameInMap("disk_use")
    public String diskUse;

    // 节点存储总空间大小
    @NameInMap("disk_total")
    public String diskTotal;

    // 节点公钥
    @NameInMap("public_key")
    public String publicKey;

    public static ALiYunChainNodeInfo build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainNodeInfo self = new ALiYunChainNodeInfo();
        return TeaModel.build(map, self);
    }

    public ALiYunChainNodeInfo setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunChainNodeInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ALiYunChainNodeInfo setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ALiYunChainNodeInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ALiYunChainNodeInfo setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ALiYunChainNodeInfo setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public ALiYunChainNodeInfo setNodePort(String nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public String getNodePort() {
        return this.nodePort;
    }

    public ALiYunChainNodeInfo setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ALiYunChainNodeInfo setNodeState(String nodeState) {
        this.nodeState = nodeState;
        return this;
    }
    public String getNodeState() {
        return this.nodeState;
    }

    public ALiYunChainNodeInfo setNodeSource(String nodeSource) {
        this.nodeSource = nodeSource;
        return this;
    }
    public String getNodeSource() {
        return this.nodeSource;
    }

    public ALiYunChainNodeInfo setDiskUse(String diskUse) {
        this.diskUse = diskUse;
        return this;
    }
    public String getDiskUse() {
        return this.diskUse;
    }

    public ALiYunChainNodeInfo setDiskTotal(String diskTotal) {
        this.diskTotal = diskTotal;
        return this;
    }
    public String getDiskTotal() {
        return this.diskTotal;
    }

    public ALiYunChainNodeInfo setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
