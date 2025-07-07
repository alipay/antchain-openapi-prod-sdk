// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcTransmitInitResult extends TeaModel {
    // 初始化成功与否
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_success")
    @Validation(required = true)
    public Boolean isSuccess;

    // 失败时返回的额外信息
    /**
     * <strong>example:</strong>
     * <p>附属消息</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 接受者did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("target_verifier")
    @Validation(required = true)
    public String targetVerifier;

    // 待签名的交易hash
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("need_signature_tx_hash")
    @Validation(required = true)
    public String needSignatureTxHash;

    public static VcTransmitInitResult build(java.util.Map<String, ?> map) throws Exception {
        VcTransmitInitResult self = new VcTransmitInitResult();
        return TeaModel.build(map, self);
    }

    public VcTransmitInitResult setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public VcTransmitInitResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VcTransmitInitResult setTargetVerifier(String targetVerifier) {
        this.targetVerifier = targetVerifier;
        return this;
    }
    public String getTargetVerifier() {
        return this.targetVerifier;
    }

    public VcTransmitInitResult setNeedSignatureTxHash(String needSignatureTxHash) {
        this.needSignatureTxHash = needSignatureTxHash;
        return this;
    }
    public String getNeedSignatureTxHash() {
        return this.needSignatureTxHash;
    }

}
