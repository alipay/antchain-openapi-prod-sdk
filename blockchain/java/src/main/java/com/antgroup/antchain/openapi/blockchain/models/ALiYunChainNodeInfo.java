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

}
