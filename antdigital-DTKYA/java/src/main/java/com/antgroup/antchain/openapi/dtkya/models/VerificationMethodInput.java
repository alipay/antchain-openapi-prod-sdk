// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerificationMethodInput extends TeaModel {
    // 符合_did标识#key标识_的格式
    /**
     * <strong>example:</strong>
     * <p>did:xxx:xxx#keys-1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 枚举，当前仅允许Multikey
    /**
     * <strong>example:</strong>
     * <p>Multikey</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 公钥经编码后的字符串，当前使用ed25519
    /**
     * <strong>example:</strong>
     * <p>z6MkExamplePublicKey</p>
     */
    @NameInMap("public_key_multibase")
    @Validation(required = true)
    public String publicKeyMultibase;

    // 关联到doc的具体能力
    /**
     * <strong>example:</strong>
     * <p>[&quot;authentication&quot;,&quot;assertionMethod&quot;,&quot;capabilityInvocation&quot;]</p>
     */
    @NameInMap("purposes")
    @Validation(required = true)
    public java.util.List<String> purposes;

    // 预先计划的停止使用时间；到达该时刻后 建议 不再使用
    /**
     * <strong>example:</strong>
     * <p>2026-12-31T23:59:59Z</p>
     */
    @NameInMap("expires")
    public String expires;

    // 控制方明确撤销的生效时间；到达该时刻后 禁止 使用，通常用于密钥泄露或紧急轮换。
    /**
     * <strong>example:</strong>
     * <p>2026-08-03T12:00:00Z</p>
     */
    @NameInMap("revoked")
    public String revoked;

    public static VerificationMethodInput build(java.util.Map<String, ?> map) throws Exception {
        VerificationMethodInput self = new VerificationMethodInput();
        return TeaModel.build(map, self);
    }

    public VerificationMethodInput setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VerificationMethodInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public VerificationMethodInput setPublicKeyMultibase(String publicKeyMultibase) {
        this.publicKeyMultibase = publicKeyMultibase;
        return this;
    }
    public String getPublicKeyMultibase() {
        return this.publicKeyMultibase;
    }

    public VerificationMethodInput setPurposes(java.util.List<String> purposes) {
        this.purposes = purposes;
        return this;
    }
    public java.util.List<String> getPurposes() {
        return this.purposes;
    }

    public VerificationMethodInput setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public VerificationMethodInput setRevoked(String revoked) {
        this.revoked = revoked;
        return this;
    }
    public String getRevoked() {
        return this.revoked;
    }

}
