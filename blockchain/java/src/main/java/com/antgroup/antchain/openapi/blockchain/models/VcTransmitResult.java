// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcTransmitResult extends TeaModel {
    // 成功或者失败
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_success")
    @Validation(required = true)
    public Boolean isSuccess;

    // 失败信息
    /**
     * <strong>example:</strong>
     * <p>失败信息</p>
     */
    @NameInMap("message")
    public String message;

    // 验证verifier did
    /**
     * <strong>example:</strong>
     * <p>did:mychian:xxxxx</p>
     */
    @NameInMap("target_verifier")
    @Validation(required = true)
    public String targetVerifier;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    public static VcTransmitResult build(java.util.Map<String, ?> map) throws Exception {
        VcTransmitResult self = new VcTransmitResult();
        return TeaModel.build(map, self);
    }

    public VcTransmitResult setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public VcTransmitResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VcTransmitResult setTargetVerifier(String targetVerifier) {
        this.targetVerifier = targetVerifier;
        return this;
    }
    public String getTargetVerifier() {
        return this.targetVerifier;
    }

    public VcTransmitResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
