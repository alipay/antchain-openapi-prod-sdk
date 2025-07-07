// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractInfo extends TeaModel {
    // 合约地址
    /**
     * <strong>example:</strong>
     * <p>ac01ceb0d8df822e042e5ea3b677201655250dbf54b9bd0c364de6f3f2a1dc7e</p>
     */
    @NameInMap("contract")
    public String contract;

    // 部署hash
    /**
     * <strong>example:</strong>
     * <p>1c625b49992ed3b55abaac677f964a35c4151d4112da8204ac874b6497bf1143</p>
     */
    @NameInMap("hash")
    public String hash;

    // 合约部署时间
    /**
     * <strong>example:</strong>
     * <p>1573401600000</p>
     */
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
