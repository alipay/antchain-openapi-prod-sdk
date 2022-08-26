// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class ALiYunChainSubnet extends TeaModel {
    // 子链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 子链名称
    @NameInMap("name")
    public String name;

    // 子链节点数
    @NameInMap("node_sum")
    public Long nodeSum;

    // 子链监控状态
    @NameInMap("monitor")
    public Boolean monitor;

    // 子链的块高
    @NameInMap("block_height")
    public String blockHeight;

    // 子链的业务总数
    @NameInMap("transaction_sum")
    public Long transactionSum;

    // 子链的创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 子链的状态
    @NameInMap("status")
    public String status;

    // 子链的权限
    @NameInMap("consortium_member")
    public Boolean consortiumMember;

    // 主链id
    @NameInMap("main_chain_id")
    public String mainChainId;

    // rest申请状态
    @NameInMap("rest")
    public String rest;

    // 子链序号
    @NameInMap("group_id")
    public String groupId;

    public static ALiYunChainSubnet build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainSubnet self = new ALiYunChainSubnet();
        return TeaModel.build(map, self);
    }

    public ALiYunChainSubnet setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainSubnet setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ALiYunChainSubnet setNodeSum(Long nodeSum) {
        this.nodeSum = nodeSum;
        return this;
    }
    public Long getNodeSum() {
        return this.nodeSum;
    }

    public ALiYunChainSubnet setMonitor(Boolean monitor) {
        this.monitor = monitor;
        return this;
    }
    public Boolean getMonitor() {
        return this.monitor;
    }

    public ALiYunChainSubnet setBlockHeight(String blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public String getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunChainSubnet setTransactionSum(Long transactionSum) {
        this.transactionSum = transactionSum;
        return this;
    }
    public Long getTransactionSum() {
        return this.transactionSum;
    }

    public ALiYunChainSubnet setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainSubnet setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ALiYunChainSubnet setConsortiumMember(Boolean consortiumMember) {
        this.consortiumMember = consortiumMember;
        return this;
    }
    public Boolean getConsortiumMember() {
        return this.consortiumMember;
    }

    public ALiYunChainSubnet setMainChainId(String mainChainId) {
        this.mainChainId = mainChainId;
        return this;
    }
    public String getMainChainId() {
        return this.mainChainId;
    }

    public ALiYunChainSubnet setRest(String rest) {
        this.rest = rest;
        return this;
    }
    public String getRest() {
        return this.rest;
    }

    public ALiYunChainSubnet setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
