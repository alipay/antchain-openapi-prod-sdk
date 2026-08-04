// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaVcdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vcId
    @NameInMap("vc_id")
    @Validation(required = true)
    public String vcId;

    // 一个随机值
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 发起者的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 发起者did对应的密钥id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 发起者密钥对 nonce 的独立签名
    @NameInMap("nonce_signature")
    @Validation(required = true)
    public String nonceSignature;

    public static QueryAntchainDasKyaVcdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaVcdetailRequest self = new QueryAntchainDasKyaVcdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaVcdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaVcdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaVcdetailRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAntchainDasKyaVcdetailRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public QueryAntchainDasKyaVcdetailRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryAntchainDasKyaVcdetailRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryAntchainDasKyaVcdetailRequest setNonceSignature(String nonceSignature) {
        this.nonceSignature = nonceSignature;
        return this;
    }
    public String getNonceSignature() {
        return this.nonceSignature;
    }

}
