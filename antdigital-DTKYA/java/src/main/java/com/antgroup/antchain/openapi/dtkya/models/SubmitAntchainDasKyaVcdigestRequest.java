// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SubmitAntchainDasKyaVcdigestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vcId
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 发行者did
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 主体did
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 凭证类型列表
    @NameInMap("vc_types")
    @Validation(required = true)
    public java.util.List<String> vcTypes;

    // vc内容哈希
    @NameInMap("vc_hash")
    @Validation(required = true)
    public String vcHash;

    // 哈希算法
    @NameInMap("hash_spec")
    @Validation(required = true)
    public String hashSpec;

    // vc有效期起始时间
    @NameInMap("valid_from")
    @Validation(required = true)
    public String validFrom;

    // vc有效期终止时间
    @NameInMap("valid_until")
    @Validation(required = true)
    public String validUntil;

    // 发行者key id
    @NameInMap("issuer_key_id")
    @Validation(required = true)
    public String issuerKeyId;

    // 发行者对vchash的签名
    @NameInMap("issuer_digest_signature")
    @Validation(required = true)
    public String issuerDigestSignature;

    public static SubmitAntchainDasKyaVcdigestRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainDasKyaVcdigestRequest self = new SubmitAntchainDasKyaVcdigestRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainDasKyaVcdigestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainDasKyaVcdigestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainDasKyaVcdigestRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public SubmitAntchainDasKyaVcdigestRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public SubmitAntchainDasKyaVcdigestRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public SubmitAntchainDasKyaVcdigestRequest setVcTypes(java.util.List<String> vcTypes) {
        this.vcTypes = vcTypes;
        return this;
    }
    public java.util.List<String> getVcTypes() {
        return this.vcTypes;
    }

    public SubmitAntchainDasKyaVcdigestRequest setVcHash(String vcHash) {
        this.vcHash = vcHash;
        return this;
    }
    public String getVcHash() {
        return this.vcHash;
    }

    public SubmitAntchainDasKyaVcdigestRequest setHashSpec(String hashSpec) {
        this.hashSpec = hashSpec;
        return this;
    }
    public String getHashSpec() {
        return this.hashSpec;
    }

    public SubmitAntchainDasKyaVcdigestRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public SubmitAntchainDasKyaVcdigestRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public SubmitAntchainDasKyaVcdigestRequest setIssuerKeyId(String issuerKeyId) {
        this.issuerKeyId = issuerKeyId;
        return this;
    }
    public String getIssuerKeyId() {
        return this.issuerKeyId;
    }

    public SubmitAntchainDasKyaVcdigestRequest setIssuerDigestSignature(String issuerDigestSignature) {
        this.issuerDigestSignature = issuerDigestSignature;
        return this;
    }
    public String getIssuerDigestSignature() {
        return this.issuerDigestSignature;
    }

}
