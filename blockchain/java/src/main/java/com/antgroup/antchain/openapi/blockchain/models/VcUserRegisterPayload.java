// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VcUserRegisterPayload extends TeaModel {
    // 用户did对应的授权公钥
    /**
     * <strong>example:</strong>
     * <p>用户did对应的授权公钥</p>
     */
    @NameInMap("public_key")
    public String publicKey;

    // 业务区块连的bizid
    /**
     * <strong>example:</strong>
     * <p>业务区块连的bizid</p>
     */
    @NameInMap("vc_channel")
    @Validation(maxLength = 32, minLength = 8)
    public String vcChannel;

    public static VcUserRegisterPayload build(java.util.Map<String, ?> map) throws Exception {
        VcUserRegisterPayload self = new VcUserRegisterPayload();
        return TeaModel.build(map, self);
    }

    public VcUserRegisterPayload setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public VcUserRegisterPayload setVcChannel(String vcChannel) {
        this.vcChannel = vcChannel;
        return this;
    }
    public String getVcChannel() {
        return this.vcChannel;
    }

}
