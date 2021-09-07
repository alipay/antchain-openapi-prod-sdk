// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class BlockchainInfoDTO extends TeaModel {
    // 交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易时间戳
    @NameInMap("tx_time")
    @Validation(required = true)
    public Long txTime;

    public static BlockchainInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        BlockchainInfoDTO self = new BlockchainInfoDTO();
        return TeaModel.build(map, self);
    }

    public BlockchainInfoDTO setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public BlockchainInfoDTO setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

}
