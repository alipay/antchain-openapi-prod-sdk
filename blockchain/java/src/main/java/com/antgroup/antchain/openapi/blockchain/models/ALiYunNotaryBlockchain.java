// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunNotaryBlockchain extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // chain_type
    @NameInMap("chain_type")
    public String chainType;

    // node_num
    @NameInMap("node_num")
    public Long nodeNum;

    // member_status
    @NameInMap("member_status")
    public String memberStatus;

    // block_height
    @NameInMap("block_height")
    public Long blockHeight;

    // transactions
    @NameInMap("transactions")
    public Long transactions;

    // network
    @NameInMap("network")
    public String network;

    // version
    @NameInMap("version")
    public String version;

    public static ALiYunNotaryBlockchain build(java.util.Map<String, ?> map) throws Exception {
        ALiYunNotaryBlockchain self = new ALiYunNotaryBlockchain();
        return TeaModel.build(map, self);
    }

    public ALiYunNotaryBlockchain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ALiYunNotaryBlockchain setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ALiYunNotaryBlockchain setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ALiYunNotaryBlockchain setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

    public ALiYunNotaryBlockchain setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }
    public String getMemberStatus() {
        return this.memberStatus;
    }

    public ALiYunNotaryBlockchain setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunNotaryBlockchain setTransactions(Long transactions) {
        this.transactions = transactions;
        return this;
    }
    public Long getTransactions() {
        return this.transactions;
    }

    public ALiYunNotaryBlockchain setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ALiYunNotaryBlockchain setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
