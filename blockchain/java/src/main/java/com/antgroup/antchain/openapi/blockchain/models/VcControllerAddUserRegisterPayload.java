// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcControllerAddUserRegisterPayload extends TeaModel {
    // 注册用户did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxxx</p>
     */
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 用户did对应的授权公钥
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 业务区块连的bizid
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("vc_channel")
    @Validation(maxLength = 32, minLength = 8)
    public String vcChannel;

    public static VcControllerAddUserRegisterPayload build(java.util.Map<String, ?> map) throws Exception {
        VcControllerAddUserRegisterPayload self = new VcControllerAddUserRegisterPayload();
        return TeaModel.build(map, self);
    }

    public VcControllerAddUserRegisterPayload setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public VcControllerAddUserRegisterPayload setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public VcControllerAddUserRegisterPayload setVcChannel(String vcChannel) {
        this.vcChannel = vcChannel;
        return this;
    }
    public String getVcChannel() {
        return this.vcChannel;
    }

}
