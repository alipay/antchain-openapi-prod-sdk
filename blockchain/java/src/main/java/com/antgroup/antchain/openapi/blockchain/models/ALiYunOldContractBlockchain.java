// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunOldContractBlockchain extends TeaModel {
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

    public static ALiYunOldContractBlockchain build(java.util.Map<String, ?> map) throws Exception {
        ALiYunOldContractBlockchain self = new ALiYunOldContractBlockchain();
        return TeaModel.build(map, self);
    }

    public ALiYunOldContractBlockchain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ALiYunOldContractBlockchain setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ALiYunOldContractBlockchain setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ALiYunOldContractBlockchain setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

    public ALiYunOldContractBlockchain setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }
    public String getMemberStatus() {
        return this.memberStatus;
    }

    public ALiYunOldContractBlockchain setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunOldContractBlockchain setTransactions(Long transactions) {
        this.transactions = transactions;
        return this;
    }
    public Long getTransactions() {
        return this.transactions;
    }

    public ALiYunOldContractBlockchain setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ALiYunOldContractBlockchain setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
