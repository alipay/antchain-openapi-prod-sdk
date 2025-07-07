// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PublicKeyInfo extends TeaModel {
    // 公钥id
    /**
     * <strong>example:</strong>
     * <p>key-1</p>
     */
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 公钥内容
    /**
     * <strong>example:</strong>
     * <p>7ceb38181822437c82909506a87aa456</p>
     */
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 算法类型
    /**
     * <strong>example:</strong>
     * <p>Secp256k1VerificationKey2018</p>
     */
    @NameInMap("sign_type")
    @Validation(required = true)
    public String signType;

    // 过期时间戳（毫秒）
    /**
     * <strong>example:</strong>
     * <p>18600000000</p>
     */
    @NameInMap("expire")
    public Long expire;

    // 公钥状态，0:不可用 1:可用
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 创建者的did
    /**
     * <strong>example:</strong>
     * <p>did:xxxx:xxxxxxxx</p>
     */
    @NameInMap("controller")
    public String controller;

    public static PublicKeyInfo build(java.util.Map<String, ?> map) throws Exception {
        PublicKeyInfo self = new PublicKeyInfo();
        return TeaModel.build(map, self);
    }

    public PublicKeyInfo setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public PublicKeyInfo setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public PublicKeyInfo setSignType(String signType) {
        this.signType = signType;
        return this;
    }
    public String getSignType() {
        return this.signType;
    }

    public PublicKeyInfo setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public PublicKeyInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public PublicKeyInfo setController(String controller) {
        this.controller = controller;
        return this;
    }
    public String getController() {
        return this.controller;
    }

}
