// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractInfo extends TeaModel {
    // 合约地址
    @NameInMap("contract")
    public String contract;

    // 部署hash
    @NameInMap("hash")
    public String hash;

    // 合约部署时间
    @NameInMap("timestamp")
    public Long timestamp;

    public static ContractInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractInfo self = new ContractInfo();
        return TeaModel.build(map, self);
    }

    public ContractInfo setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public ContractInfo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ContractInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
