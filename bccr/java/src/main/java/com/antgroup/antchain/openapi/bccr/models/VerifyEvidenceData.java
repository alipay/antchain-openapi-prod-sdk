// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyEvidenceData extends TeaModel {
    // 操作日志交易HASH
    @NameInMap("process_log_tx_hash")
    public String processLogTxHash;

    // 自清洁日志交易HASH
    @NameInMap("check_log_tx_hash")
    public String checkLogTxHash;

    public static VerifyEvidenceData build(java.util.Map<String, ?> map) throws Exception {
        VerifyEvidenceData self = new VerifyEvidenceData();
        return TeaModel.build(map, self);
    }

    public VerifyEvidenceData setProcessLogTxHash(String processLogTxHash) {
        this.processLogTxHash = processLogTxHash;
        return this;
    }
    public String getProcessLogTxHash() {
        return this.processLogTxHash;
    }

    public VerifyEvidenceData setCheckLogTxHash(String checkLogTxHash) {
        this.checkLogTxHash = checkLogTxHash;
        return this;
    }
    public String getCheckLogTxHash() {
        return this.checkLogTxHash;
    }

}
