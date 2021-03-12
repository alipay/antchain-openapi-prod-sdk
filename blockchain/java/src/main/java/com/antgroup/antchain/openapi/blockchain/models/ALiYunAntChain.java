// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunAntChain extends TeaModel {
    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 链名称
    @NameInMap("ant_chain_name")
    public String antChainName;

    // 链的类型
    @NameInMap("chain_type")
    public String chainType;

    // cipher_suit
    @NameInMap("cipher_suit")
    public String cipherSuit;

    // 创建时间
    @NameInMap("create_time")
    public Long createTime;

    // expire_time
    @NameInMap("expire_time")
    public Long expireTime;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // is_admin
    @NameInMap("is_admin")
    public Boolean isAdmin;

    // 成员状态
    @NameInMap("member_status")
    public String memberStatus;

    // merkle_tree_suit
    @NameInMap("merkle_tree_suit")
    public String merkleTreeSuit;

    // Network
    @NameInMap("network")
    public String network;

    // 节点数
    @NameInMap("node_num")
    public Long nodeNum;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    // 链的资源大小
    @NameInMap("resource_size")
    public String resourceSize;

    // rest_status
    @NameInMap("rest_status")
    public String restStatus;

    // 算法参数
    @NameInMap("tls_algo")
    public String tlsAlgo;

    // 版本信息
    @NameInMap("version")
    public String version;

    // monitor_status
    @NameInMap("monitor_status")
    public Boolean monitorStatus;

    public static ALiYunAntChain build(java.util.Map<String, ?> map) throws Exception {
        ALiYunAntChain self = new ALiYunAntChain();
        return TeaModel.build(map, self);
    }

    public ALiYunAntChain setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunAntChain setAntChainName(String antChainName) {
        this.antChainName = antChainName;
        return this;
    }
    public String getAntChainName() {
        return this.antChainName;
    }

    public ALiYunAntChain setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ALiYunAntChain setCipherSuit(String cipherSuit) {
        this.cipherSuit = cipherSuit;
        return this;
    }
    public String getCipherSuit() {
        return this.cipherSuit;
    }

    public ALiYunAntChain setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunAntChain setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ALiYunAntChain setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ALiYunAntChain setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public ALiYunAntChain setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }
    public String getMemberStatus() {
        return this.memberStatus;
    }

    public ALiYunAntChain setMerkleTreeSuit(String merkleTreeSuit) {
        this.merkleTreeSuit = merkleTreeSuit;
        return this;
    }
    public String getMerkleTreeSuit() {
        return this.merkleTreeSuit;
    }

    public ALiYunAntChain setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ALiYunAntChain setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

    public ALiYunAntChain setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ALiYunAntChain setResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }
    public String getResourceSize() {
        return this.resourceSize;
    }

    public ALiYunAntChain setRestStatus(String restStatus) {
        this.restStatus = restStatus;
        return this;
    }
    public String getRestStatus() {
        return this.restStatus;
    }

    public ALiYunAntChain setTlsAlgo(String tlsAlgo) {
        this.tlsAlgo = tlsAlgo;
        return this;
    }
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

    public ALiYunAntChain setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ALiYunAntChain setMonitorStatus(Boolean monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public Boolean getMonitorStatus() {
        return this.monitorStatus;
    }

}
