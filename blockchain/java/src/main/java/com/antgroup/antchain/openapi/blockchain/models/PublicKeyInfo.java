// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PublicKeyInfo extends TeaModel {
    // 公钥id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 公钥内容
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 算法类型
    @NameInMap("sign_type")
    @Validation(required = true)
    public String signType;

    // 过期时间戳（毫秒）
    @NameInMap("expire")
    public Long expire;

    // 公钥状态，0:不可用 1:可用
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 创建者的did
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
