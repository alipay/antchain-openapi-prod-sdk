// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractNotarySignInfo extends TeaModel {
    // 本阶段存证内容哈希值
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
    @NameInMap("contract_hash")
    @Validation(required = true)
    public String contractHash;

    // 签署人ID
    @NameInMap("signatory")
    @Validation(required = true)
    public String signatory;

    // 存证阶段发生时间，UNIX时间戳(毫秒)
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 存证凭据，仅在批量核验时需要填写
    @NameInMap("tx_hash")
    public String txHash;

    public static ContractNotarySignInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractNotarySignInfo self = new ContractNotarySignInfo();
        return TeaModel.build(map, self);
    }

    public ContractNotarySignInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ContractNotarySignInfo setContractHash(String contractHash) {
        this.contractHash = contractHash;
        return this;
    }
    public String getContractHash() {
        return this.contractHash;
    }

    public ContractNotarySignInfo setSignatory(String signatory) {
        this.signatory = signatory;
        return this;
    }
    public String getSignatory() {
        return this.signatory;
    }

    public ContractNotarySignInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ContractNotarySignInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
