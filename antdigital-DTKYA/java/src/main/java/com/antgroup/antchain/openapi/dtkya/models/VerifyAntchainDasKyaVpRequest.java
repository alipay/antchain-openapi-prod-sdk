// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaVpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // Base64 编码的完整 VP JSON
    @NameInMap("vp_content_base64")
    @Validation(required = true)
    public String vpContentBase64;

    // 预期challenge 值
    @NameInMap("expected_challenge")
    @Validation(required = true)
    public String expectedChallenge;

    // 签发方did
    @NameInMap("expected_issuer_did")
    @Validation(required = true)
    public String expectedIssuerDid;

    // 主体did
    @NameInMap("expected_subject_did")
    @Validation(required = true)
    public String expectedSubjectDid;

    public static VerifyAntchainDasKyaVpRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaVpRequest self = new VerifyAntchainDasKyaVpRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaVpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainDasKyaVpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainDasKyaVpRequest setVpContentBase64(String vpContentBase64) {
        this.vpContentBase64 = vpContentBase64;
        return this;
    }
    public String getVpContentBase64() {
        return this.vpContentBase64;
    }

    public VerifyAntchainDasKyaVpRequest setExpectedChallenge(String expectedChallenge) {
        this.expectedChallenge = expectedChallenge;
        return this;
    }
    public String getExpectedChallenge() {
        return this.expectedChallenge;
    }

    public VerifyAntchainDasKyaVpRequest setExpectedIssuerDid(String expectedIssuerDid) {
        this.expectedIssuerDid = expectedIssuerDid;
        return this;
    }
    public String getExpectedIssuerDid() {
        return this.expectedIssuerDid;
    }

    public VerifyAntchainDasKyaVpRequest setExpectedSubjectDid(String expectedSubjectDid) {
        this.expectedSubjectDid = expectedSubjectDid;
        return this;
    }
    public String getExpectedSubjectDid() {
        return this.expectedSubjectDid;
    }

}
