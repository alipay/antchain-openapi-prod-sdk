// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerificationMethodChange extends TeaModel {
    // 枚举：ADD、RETIRE、REMOVE
    /**
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 目标或新增 verification method ID
    /**
     * <strong>example:</strong>
     * <p>did:antchain:xxx:xxx#keys-2</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // ADD时必填，本期固定Multikey类型
    /**
     * <strong>example:</strong>
     * <p>Multikey</p>
     */
    @NameInMap("type")
    public String type;

    // Multibase 编码公钥
    /**
     * <strong>example:</strong>
     * <p>z6MkExamplePublicKey</p>
     */
    @NameInMap("public_key_multibase")
    @Validation(required = true)
    public String publicKeyMultibase;

    // ADD时必填，当前key的使用scope
    /**
     * <strong>example:</strong>
     * <p>[&quot;authentication&quot;,&quot;assertionMethod&quot;,&quot;capabilityInvocation&quot;]</p>
     */
    @NameInMap("purposes")
    public java.util.List<String> purposes;

    // RETIRE时必填，计划失效时间
    /**
     * <strong>example:</strong>
     * <p>2026-12-31T23:59:59Z</p>
     */
    @NameInMap("expires")
    public String expires;

    // 撤销时间
    /**
     * <strong>example:</strong>
     * <p>2026-08-03T12:00:00Z</p>
     */
    @NameInMap("revoked")
    public String revoked;

    public static VerificationMethodChange build(java.util.Map<String, ?> map) throws Exception {
        VerificationMethodChange self = new VerificationMethodChange();
        return TeaModel.build(map, self);
    }

    public VerificationMethodChange setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public VerificationMethodChange setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VerificationMethodChange setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public VerificationMethodChange setPublicKeyMultibase(String publicKeyMultibase) {
        this.publicKeyMultibase = publicKeyMultibase;
        return this;
    }
    public String getPublicKeyMultibase() {
        return this.publicKeyMultibase;
    }

    public VerificationMethodChange setPurposes(java.util.List<String> purposes) {
        this.purposes = purposes;
        return this;
    }
    public java.util.List<String> getPurposes() {
        return this.purposes;
    }

    public VerificationMethodChange setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return this.expires;
    }

    public VerificationMethodChange setRevoked(String revoked) {
        this.revoked = revoked;
        return this;
    }
    public String getRevoked() {
        return this.revoked;
    }

}
