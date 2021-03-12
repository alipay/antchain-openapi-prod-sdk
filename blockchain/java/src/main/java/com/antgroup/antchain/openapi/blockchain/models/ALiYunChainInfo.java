// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainInfo extends TeaModel {
    // abnormal_nodes
    @NameInMap("abnormal_nodes")
    public Long abnormalNodes;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // block_height
    @NameInMap("block_height")
    public Long blockHeight;

    // create_time
    @NameInMap("create_time")
    public Long createTime;

    // is_role
    @NameInMap("is_role")
    public Boolean isRole;

    // node_number
    @NameInMap("node_number")
    public Long nodeNumber;

    // normal
    @NameInMap("normal")
    public Boolean normal;

    // transaction_sum
    @NameInMap("transaction_sum")
    public Long transactionSum;

    // Version
    @NameInMap("version")
    public String version;

    // node_infos
    @NameInMap("node_infos")
    public java.util.List<ALiYunChainNodeInfo> nodeInfos;

    public static ALiYunChainInfo build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainInfo self = new ALiYunChainInfo();
        return TeaModel.build(map, self);
    }

    public ALiYunChainInfo setAbnormalNodes(Long abnormalNodes) {
        this.abnormalNodes = abnormalNodes;
        return this;
    }
    public Long getAbnormalNodes() {
        return this.abnormalNodes;
    }

    public ALiYunChainInfo setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainInfo setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunChainInfo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainInfo setIsRole(Boolean isRole) {
        this.isRole = isRole;
        return this;
    }
    public Boolean getIsRole() {
        return this.isRole;
    }

    public ALiYunChainInfo setNodeNumber(Long nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Long getNodeNumber() {
        return this.nodeNumber;
    }

    public ALiYunChainInfo setNormal(Boolean normal) {
        this.normal = normal;
        return this;
    }
    public Boolean getNormal() {
        return this.normal;
    }

    public ALiYunChainInfo setTransactionSum(Long transactionSum) {
        this.transactionSum = transactionSum;
        return this;
    }
    public Long getTransactionSum() {
        return this.transactionSum;
    }

    public ALiYunChainInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ALiYunChainInfo setNodeInfos(java.util.List<ALiYunChainNodeInfo> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }
    public java.util.List<ALiYunChainNodeInfo> getNodeInfos() {
        return this.nodeInfos;
    }

}
