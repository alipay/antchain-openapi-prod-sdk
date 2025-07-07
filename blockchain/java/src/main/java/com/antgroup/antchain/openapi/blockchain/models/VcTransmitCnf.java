// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcTransmitCnf extends TeaModel {
    // 针对tx_hash的签名
    /**
     * <strong>example:</strong>
     * <p>123123123</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>1232123</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // vc传输目标did
    /**
     * <strong>example:</strong>
     * <p>验证者id</p>
     */
    @NameInMap("verifier_id")
    @Validation(required = true)
    public String verifierId;

    public static VcTransmitCnf build(java.util.Map<String, ?> map) throws Exception {
        VcTransmitCnf self = new VcTransmitCnf();
        return TeaModel.build(map, self);
    }

    public VcTransmitCnf setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public VcTransmitCnf setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VcTransmitCnf setVerifierId(String verifierId) {
        this.verifierId = verifierId;
        return this;
    }
    public String getVerifierId() {
        return this.verifierId;
    }

}
