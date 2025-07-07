// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserNodeOwner extends TeaModel {
    // node_id
    /**
     * <strong>example:</strong>
     * <p>node_id</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // node_ip
    /**
     * <strong>example:</strong>
     * <p>node_ip</p>
     */
    @NameInMap("node_ip")
    @Validation(required = true)
    public String nodeIp;

    // node_name
    /**
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    // node_owner
    /**
     * <strong>example:</strong>
     * <p>node_owner</p>
     */
    @NameInMap("node_owner")
    @Validation(required = true)
    public String nodeOwner;

    // node_port
    /**
     * <strong>example:</strong>
     * <p>node_port</p>
     */
    @NameInMap("node_port")
    @Validation(required = true)
    public String nodePort;

    // node_source
    /**
     * <strong>example:</strong>
     * <p>node_source</p>
     */
    @NameInMap("node_source")
    @Validation(required = true)
    public String nodeSource;

    // node_state
    /**
     * <strong>example:</strong>
     * <p>node_state</p>
     */
    @NameInMap("node_state")
    @Validation(required = true)
    public String nodeState;

    // node_type
    /**
     * <strong>example:</strong>
     * <p>node_type</p>
     */
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点已使用的存储空间
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("node_disk_used")
    @Validation(required = true)
    public String nodeDiskUsed;

    // 节点的总存储空间
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("node_disk_total")
    @Validation(required = true)
    public String nodeDiskTotal;

    public static BlockchainBrowserNodeOwner build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserNodeOwner self = new BlockchainBrowserNodeOwner();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserNodeOwner setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public BlockchainBrowserNodeOwner setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public BlockchainBrowserNodeOwner setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public BlockchainBrowserNodeOwner setNodeOwner(String nodeOwner) {
        this.nodeOwner = nodeOwner;
        return this;
    }
    public String getNodeOwner() {
        return this.nodeOwner;
    }

    public BlockchainBrowserNodeOwner setNodePort(String nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public String getNodePort() {
        return this.nodePort;
    }

    public BlockchainBrowserNodeOwner setNodeSource(String nodeSource) {
        this.nodeSource = nodeSource;
        return this;
    }
    public String getNodeSource() {
        return this.nodeSource;
    }

    public BlockchainBrowserNodeOwner setNodeState(String nodeState) {
        this.nodeState = nodeState;
        return this;
    }
    public String getNodeState() {
        return this.nodeState;
    }

    public BlockchainBrowserNodeOwner setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public BlockchainBrowserNodeOwner setNodeDiskUsed(String nodeDiskUsed) {
        this.nodeDiskUsed = nodeDiskUsed;
        return this;
    }
    public String getNodeDiskUsed() {
        return this.nodeDiskUsed;
    }

    public BlockchainBrowserNodeOwner setNodeDiskTotal(String nodeDiskTotal) {
        this.nodeDiskTotal = nodeDiskTotal;
        return this;
    }
    public String getNodeDiskTotal() {
        return this.nodeDiskTotal;
    }

}
