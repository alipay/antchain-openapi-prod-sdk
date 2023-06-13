// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorResult extends TeaModel {
    // 数据内容content的上链交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 原入参的数组索引
    @NameInMap("original_index")
    @Validation(required = true)
    public Long originalIndex;

    public static SendCollectorResult build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorResult self = new SendCollectorResult();
        return TeaModel.build(map, self);
    }

    public SendCollectorResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public SendCollectorResult setOriginalIndex(Long originalIndex) {
        this.originalIndex = originalIndex;
        return this;
    }
    public Long getOriginalIndex() {
        return this.originalIndex;
    }

}
