// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ChainInfo extends TeaModel {
    // 块高
    @NameInMap("block_height")
    public String blockHeight;

    // 交易时间
    @NameInMap("translate_date")
    public String translateDate;

    // hash(64位)
    @NameInMap("tx_hash")
    public String txHash;

    public static ChainInfo build(java.util.Map<String, ?> map) throws Exception {
        ChainInfo self = new ChainInfo();
        return TeaModel.build(map, self);
    }

    public ChainInfo setBlockHeight(String blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public String getBlockHeight() {
        return this.blockHeight;
    }

    public ChainInfo setTranslateDate(String translateDate) {
        this.translateDate = translateDate;
        return this;
    }
    public String getTranslateDate() {
        return this.translateDate;
    }

    public ChainInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
