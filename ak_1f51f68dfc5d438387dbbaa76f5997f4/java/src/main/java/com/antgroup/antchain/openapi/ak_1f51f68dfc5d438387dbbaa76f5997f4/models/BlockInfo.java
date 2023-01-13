// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class BlockInfo extends TeaModel {
    // 块高度
    @NameInMap("block_height")
    @Validation(required = true)
    public Long blockHeight;

    // 成块时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 交易摘要
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static BlockInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockInfo self = new BlockInfo();
        return TeaModel.build(map, self);
    }

    public BlockInfo setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public BlockInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BlockInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
