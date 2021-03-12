// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitDidAdddidHashRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // {\"creator\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"created\":\"2019-08-08T13:52:02+0800\",\"service\":[{\"id\":\"didauth-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"DidAuthService\"},{\"id\":\"vcrepository-1\",\"serviceEndpoint\":\"auth.mydid.agent.com\",\"type\":\"VerifiableClaimRepository\"},{\"id\":\"oneBid-1\",\"serviceEndpoint\":\"[{\\\"uid\\\":\\\"z50Uid\\\",\\\"tenancyId\\\":\\\"z50\\\",\\\"version\\\":\\\"v1.0\\\",\\\"releated\\\":{\\\"releatedHash\\\":\\\"hash(关联结果)\\\",\\\"releatedInfo\\\":\\\"AES(核身过程)+version\\\"}}]\",\"type\":\"oneBid\"}],\"id\":\"did:mychain:4145aac009d5e94ad68c16bd56af0bf65a0437b49046529a142de8b385ee71c1\",\"publicKey\":[{\"controller\":\"did:mychain:93496ea09e022cdf21a0df15d2bfb3102985eb64016af5fb14a2e24a9ab1a73a\",\"id\":\"keys-1\",\"publicKey\":\"f498ee29763dd24cd8324c6e861d82ef558e7d6dac10be8b99f5c33934d5cc4f5ff49861a235c7fd4c99a99265d777e657e747164e5549195003878c7222bdcc\",\"type\":\"Secp256k1VerificationKey2018\"}],\"@context\":\"https://w3id.org/did/v1\",\"updated\":\"2019-08-08T13:52:02+0800\",\"authentication\":[\"keys-1\"]}"])
    @NameInMap("diddoc")
    @Validation(required = true)
    public String diddoc;

    // 使用私钥对消息中其他字段进行签名
    @NameInMap("request_signature")
    @Validation(required = true)
    public String requestSignature;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static InitDidAdddidHashRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDidAdddidHashRequest self = new InitDidAdddidHashRequest();
        return TeaModel.build(map, self);
    }

    public InitDidAdddidHashRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDidAdddidHashRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDidAdddidHashRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public InitDidAdddidHashRequest setDiddoc(String diddoc) {
        this.diddoc = diddoc;
        return this;
    }
    public String getDiddoc() {
        return this.diddoc;
    }

    public InitDidAdddidHashRequest setRequestSignature(String requestSignature) {
        this.requestSignature = requestSignature;
        return this;
    }
    public String getRequestSignature() {
        return this.requestSignature;
    }

    public InitDidAdddidHashRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
