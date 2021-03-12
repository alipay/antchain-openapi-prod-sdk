// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyDidZkpverifiableclaimProofRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 包含ZKP Proof的可验证声明
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    // ZKP验证信息
    @NameInMap("verify_zkp_proof")
    @Validation(required = true)
    public java.util.List<DidZKPInfo> verifyZkpProof;

    public static VerifyDidZkpverifiableclaimProofRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDidZkpverifiableclaimProofRequest self = new VerifyDidZkpverifiableclaimProofRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDidZkpverifiableclaimProofRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDidZkpverifiableclaimProofRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDidZkpverifiableclaimProofRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public VerifyDidZkpverifiableclaimProofRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public VerifyDidZkpverifiableclaimProofRequest setVerifyZkpProof(java.util.List<DidZKPInfo> verifyZkpProof) {
        this.verifyZkpProof = verifyZkpProof;
        return this;
    }
    public java.util.List<DidZKPInfo> getVerifyZkpProof() {
        return this.verifyZkpProof;
    }

}
