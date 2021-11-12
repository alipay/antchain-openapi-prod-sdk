// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeChainInfo extends TeaModel {
    // 交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    // 交易区块
    @NameInMap("block_height")
    public Long blockHeight;

    // 交易时间
    @NameInMap("tx_time")
    public Long txTime;

    public static IPCodeChainInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeChainInfo self = new IPCodeChainInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeChainInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public IPCodeChainInfo setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public IPCodeChainInfo setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

}
