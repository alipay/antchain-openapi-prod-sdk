// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NodeInfo extends TeaModel {
    // 链的区块高度
    @NameInMap("blockheight")
    public Long blockheight;

    // 节点名称
    @NameInMap("nodename")
    public String nodename;

    // 节点健康状况
    @NameInMap("status")
    public Boolean status;

    // 节点版本
    @NameInMap("version")
    public String version;

    public static NodeInfo build(java.util.Map<String, ?> map) throws Exception {
        NodeInfo self = new NodeInfo();
        return TeaModel.build(map, self);
    }

    public NodeInfo setBlockheight(Long blockheight) {
        this.blockheight = blockheight;
        return this;
    }
    public Long getBlockheight() {
        return this.blockheight;
    }

    public NodeInfo setNodename(String nodename) {
        this.nodename = nodename;
        return this;
    }
    public String getNodename() {
        return this.nodename;
    }

    public NodeInfo setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public NodeInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
