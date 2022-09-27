// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class MatchAntchainBbpDidAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码(YYX)
    @NameInMap("biz_code")
    public String bizCode;

    // 支付宝uid
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 分布式id ，双向check
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 链id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 链账户
    @NameInMap("chain_account")
    @Validation(required = true)
    public String chainAccount;

    // 托管情况下包含
    @NameInMap("kms_key_id")
    public String kmsKeyId;

    public static MatchAntchainBbpDidAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchAntchainBbpDidAccountRequest self = new MatchAntchainBbpDidAccountRequest();
        return TeaModel.build(map, self);
    }

    public MatchAntchainBbpDidAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchAntchainBbpDidAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchAntchainBbpDidAccountRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public MatchAntchainBbpDidAccountRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public MatchAntchainBbpDidAccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public MatchAntchainBbpDidAccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public MatchAntchainBbpDidAccountRequest setChainAccount(String chainAccount) {
        this.chainAccount = chainAccount;
        return this;
    }
    public String getChainAccount() {
        return this.chainAccount;
    }

    public MatchAntchainBbpDidAccountRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

}
