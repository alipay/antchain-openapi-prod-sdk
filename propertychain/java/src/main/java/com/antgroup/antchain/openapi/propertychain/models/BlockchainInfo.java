// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BlockchainInfo extends TeaModel {
    // hash值
    @NameInMap("tx_hash")
    public String txHash;

    // 时间戳
    @NameInMap("tx_time")
    public Long txTime;

    public static BlockchainInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockchainInfo self = new BlockchainInfo();
        return TeaModel.build(map, self);
    }

    public BlockchainInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public BlockchainInfo setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

}
