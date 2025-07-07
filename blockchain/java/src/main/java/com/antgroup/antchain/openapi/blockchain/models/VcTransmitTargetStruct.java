// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcTransmitTargetStruct extends TeaModel {
    // 目标did的公钥
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("public_key")
    public String publicKey;

    // 传输vc使用的区块链id
    /**
     * <strong>example:</strong>
     * <p>bizid</p>
     */
    @NameInMap("vc_channel")
    @Validation(maxLength = 32, minLength = 8)
    public String vcChannel;

    // 验证者did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("verifier_did")
    @Validation(required = true)
    public String verifierDid;

    public static VcTransmitTargetStruct build(java.util.Map<String, ?> map) throws Exception {
        VcTransmitTargetStruct self = new VcTransmitTargetStruct();
        return TeaModel.build(map, self);
    }

    public VcTransmitTargetStruct setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public VcTransmitTargetStruct setVcChannel(String vcChannel) {
        this.vcChannel = vcChannel;
        return this;
    }
    public String getVcChannel() {
        return this.vcChannel;
    }

    public VcTransmitTargetStruct setVerifierDid(String verifierDid) {
        this.verifierDid = verifierDid;
        return this;
    }
    public String getVerifierDid() {
        return this.verifierDid;
    }

}
