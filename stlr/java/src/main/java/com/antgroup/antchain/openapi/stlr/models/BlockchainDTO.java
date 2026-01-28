// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class BlockchainDTO extends TeaModel {
    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 当前块高
    /**
     * <strong>example:</strong>
     * <p>12917</p>
     */
    @NameInMap("block_number")
    @Validation(required = true)
    public Long blockNumber;

    public static BlockchainDTO build(java.util.Map<String, ?> map) throws Exception {
        BlockchainDTO self = new BlockchainDTO();
        return TeaModel.build(map, self);
    }

    public BlockchainDTO setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public BlockchainDTO setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
