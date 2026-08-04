// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VcDigest extends TeaModel {
    // vcId
    /**
     * <strong>example:</strong>
     * <p>vcId</p>
     */
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 签发者did
    /**
     * <strong>example:</strong>
     * <p>did:xxxx:xxxxx</p>
     */
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 主体did
    /**
     * <strong>example:</strong>
     * <p>did:xxxx:xxxxx</p>
     */
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 凭证类型列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;AgentIdentityCredential&quot;]</p>
     */
    @NameInMap("vc_types")
    @Validation(required = true)
    public java.util.List<String> vcTypes;

    // vc内容哈希
    /**
     * <strong>example:</strong>
     * <p>e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855</p>
     */
    @NameInMap("vc_hash")
    @Validation(required = true)
    public String vcHash;

    // 哈希算法
    /**
     * <strong>example:</strong>
     * <p>JCS_SHA256</p>
     */
    @NameInMap("hash_spec")
    @Validation(required = true)
    public String hashSpec;

    // 有效期起始时间
    /**
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("valid_from")
    @Validation(required = true)
    public String validFrom;

    // 有效期终止时间
    /**
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("valid_until")
    @Validation(required = true)
    public String validUntil;

    // VC状态
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static VcDigest build(java.util.Map<String, ?> map) throws Exception {
        VcDigest self = new VcDigest();
        return TeaModel.build(map, self);
    }

    public VcDigest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public VcDigest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public VcDigest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public VcDigest setVcTypes(java.util.List<String> vcTypes) {
        this.vcTypes = vcTypes;
        return this;
    }
    public java.util.List<String> getVcTypes() {
        return this.vcTypes;
    }

    public VcDigest setVcHash(String vcHash) {
        this.vcHash = vcHash;
        return this;
    }
    public String getVcHash() {
        return this.vcHash;
    }

    public VcDigest setHashSpec(String hashSpec) {
        this.hashSpec = hashSpec;
        return this;
    }
    public String getHashSpec() {
        return this.hashSpec;
    }

    public VcDigest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public VcDigest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public VcDigest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
