// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyEvidenceData extends TeaModel {
    // 操作日志交易HASH
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
    @NameInMap("process_log_tx_hash")
    public String processLogTxHash;

    // 自清洁日志交易HASH
    /**
     * <strong>example:</strong>
     * <p>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</p>
     */
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
