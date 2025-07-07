// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidAuthPayload extends TeaModel {
    // 新公钥的实际控制者
    /**
     * <strong>example:</strong>
     * <p>did:mychain:xxxx</p>
     */
    @NameInMap("controller")
    @Validation(required = true)
    public String controller;

    // 旧Auth Key的过期时间
    /**
     * <strong>example:</strong>
     * <p>1567890</p>
     */
    @NameInMap("previous_auth_key_expire")
    @Validation(required = true)
    public String previousAuthKeyExpire;

    // 更新Did doc的版本
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("previous_version")
    @Validation(required = true)
    public Long previousVersion;

    // 新DID Auth key的public key id
    /**
     * <strong>example:</strong>
     * <p>key#3</p>
     */
    @NameInMap("public_key_id")
    @Validation(required = true)
    public String publicKeyId;

    // 密钥对生成算法
    /**
     * <strong>example:</strong>
     * <p>RsaVerificationKey2018</p>
     */
    @NameInMap("public_key_type")
    @Validation(required = true)
    public String publicKeyType;

    // 公钥的实际值
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UpdateDidAuthPayload build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidAuthPayload self = new UpdateDidAuthPayload();
        return TeaModel.build(map, self);
    }

    public UpdateDidAuthPayload setController(String controller) {
        this.controller = controller;
        return this;
    }
    public String getController() {
        return this.controller;
    }

    public UpdateDidAuthPayload setPreviousAuthKeyExpire(String previousAuthKeyExpire) {
        this.previousAuthKeyExpire = previousAuthKeyExpire;
        return this;
    }
    public String getPreviousAuthKeyExpire() {
        return this.previousAuthKeyExpire;
    }

    public UpdateDidAuthPayload setPreviousVersion(Long previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    public UpdateDidAuthPayload setPublicKeyId(String publicKeyId) {
        this.publicKeyId = publicKeyId;
        return this;
    }
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    public UpdateDidAuthPayload setPublicKeyType(String publicKeyType) {
        this.publicKeyType = publicKeyType;
        return this;
    }
    public String getPublicKeyType() {
        return this.publicKeyType;
    }

    public UpdateDidAuthPayload setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
