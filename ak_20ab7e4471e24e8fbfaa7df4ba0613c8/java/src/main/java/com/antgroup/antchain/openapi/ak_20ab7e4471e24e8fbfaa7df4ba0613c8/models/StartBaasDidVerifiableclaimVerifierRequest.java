// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidVerifiableclaimVerifierRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
    @NameInMap("indexs")
    public String indexs;

    // 可验证声明
    @NameInMap("verifiable_claim")
    @Validation(required = true)
    public String verifiableClaim;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartBaasDidVerifiableclaimVerifierRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidVerifiableclaimVerifierRequest self = new StartBaasDidVerifiableclaimVerifierRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasDidVerifiableclaimVerifierRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasDidVerifiableclaimVerifierRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasDidVerifiableclaimVerifierRequest setIndexs(String indexs) {
        this.indexs = indexs;
        return this;
    }
    public String getIndexs() {
        return this.indexs;
    }

    public StartBaasDidVerifiableclaimVerifierRequest setVerifiableClaim(String verifiableClaim) {
        this.verifiableClaim = verifiableClaim;
        return this;
    }
    public String getVerifiableClaim() {
        return this.verifiableClaim;
    }

    public StartBaasDidVerifiableclaimVerifierRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
