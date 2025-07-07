// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainSubnet extends TeaModel {
    // 子链id
    /**
     * <strong>example:</strong>
     * <p>S210304150059</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 子链名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    // 子链节点数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_sum")
    public Long nodeSum;

    // 子链监控状态
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("monitor")
    public Boolean monitor;

    // 子链的块高
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("block_height")
    public String blockHeight;

    // 子链的业务总数
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("transaction_sum")
    public Long transactionSum;

    // 子链的创建时间
    /**
     * <strong>example:</strong>
     * <p>1000821213123</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    // 子链的状态
    /**
     * <strong>example:</strong>
     * <p>STOP/CREATE</p>
     */
    @NameInMap("status")
    public String status;

    // 子链的权限
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("consortium_member")
    public Boolean consortiumMember;

    // 主链id
    /**
     * <strong>example:</strong>
     * <p>2e7e22c42bb8419bbf99b7f56aa2f17f</p>
     */
    @NameInMap("main_chain_id")
    public String mainChainId;

    // rest申请状态
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("rest")
    public String rest;

    // 子链序号
    /**
     * <strong>example:</strong>
     * <p>0000000000000002000000000000000000000000</p>
     */
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
