// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SubmitAntchainDasKyaVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // urn:uuid:xxx
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 签发方 DID,须链上已登记且有效
    @NameInMap("issuer_did")
    @Validation(required = true)
    public String issuerDid;

    // 主体 DID
    @NameInMap("subject_did")
    @Validation(required = true)
    public String subjectDid;

    // 凭证类型列表
    @NameInMap("vc_types")
    @Validation(required = true)
    public java.util.List<String> vcTypes;

    // VC 生效时间 ISO8601
    @NameInMap("valid_from")
    @Validation(required = true)
    public String validFrom;

    // VC 失效时间 ISO8601
    @NameInMap("valid_until")
    @Validation(required = true)
    public String validUntil;

    // vc业务声明
    @NameInMap("claims")
    public String claims;

    public static SubmitAntchainDasKyaVcRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainDasKyaVcRequest self = new SubmitAntchainDasKyaVcRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainDasKyaVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainDasKyaVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainDasKyaVcRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public SubmitAntchainDasKyaVcRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public SubmitAntchainDasKyaVcRequest setSubjectDid(String subjectDid) {
        this.subjectDid = subjectDid;
        return this;
    }
    public String getSubjectDid() {
        return this.subjectDid;
    }

    public SubmitAntchainDasKyaVcRequest setVcTypes(java.util.List<String> vcTypes) {
        this.vcTypes = vcTypes;
        return this;
    }
    public java.util.List<String> getVcTypes() {
        return this.vcTypes;
    }

    public SubmitAntchainDasKyaVcRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public SubmitAntchainDasKyaVcRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public SubmitAntchainDasKyaVcRequest setClaims(String claims) {
        this.claims = claims;
        return this;
    }
    public String getClaims() {
        return this.claims;
    }

}
