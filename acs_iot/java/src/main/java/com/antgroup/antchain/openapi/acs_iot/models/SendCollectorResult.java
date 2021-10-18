// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_iot.models;

import com.aliyun.tea.*;

public class SendCollectorResult extends TeaModel {
    // 数据内容content的上链交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

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

}
