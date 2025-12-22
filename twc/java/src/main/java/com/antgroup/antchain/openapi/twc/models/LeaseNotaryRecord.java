// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseNotaryRecord extends TeaModel {
    // 存证阶段
    /**
     * <strong>example:</strong>
     * <p>PLACE_ORDER</p>
     */
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 交易哈希，存证记录唯一标识
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static LeaseNotaryRecord build(java.util.Map<String, ?> map) throws Exception {
        LeaseNotaryRecord self = new LeaseNotaryRecord();
        return TeaModel.build(map, self);
    }

    public LeaseNotaryRecord setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public LeaseNotaryRecord setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
