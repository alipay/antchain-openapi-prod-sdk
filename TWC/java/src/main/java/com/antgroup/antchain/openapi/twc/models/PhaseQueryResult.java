// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PhaseQueryResult extends TeaModel {
    // 阶段ID
    /**
     * <strong>example:</strong>
     * <p>4a605f04-ae9f-48d3-88ba-05c073ad5484</p>
     */
    @NameInMap("phase_id")
    @Validation(required = true)
    public String phaseId;

    // 阶段存证的链上交易Hash，只有status为FINISH才会返回
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a97900xx269</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 阶段存证状态
    /**
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 阶段注册成功时间戳
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("register_time")
    @Validation(required = true)
    public Long registerTime;

    public static PhaseQueryResult build(java.util.Map<String, ?> map) throws Exception {
        PhaseQueryResult self = new PhaseQueryResult();
        return TeaModel.build(map, self);
    }

    public PhaseQueryResult setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public PhaseQueryResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public PhaseQueryResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PhaseQueryResult setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

}
