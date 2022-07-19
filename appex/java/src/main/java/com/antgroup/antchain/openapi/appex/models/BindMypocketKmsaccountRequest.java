// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class BindMypocketKmsaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户的DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 区块链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 用户的链上账户
    @NameInMap("chain_account")
    @Validation(required = true)
    public String chainAccount;

    // 该链账户在BaaS服务的KMS ID 
    @NameInMap("kms_id")
    @Validation(required = true)
    public String kmsId;

    public static BindMypocketKmsaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMypocketKmsaccountRequest self = new BindMypocketKmsaccountRequest();
        return TeaModel.build(map, self);
    }

    public BindMypocketKmsaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindMypocketKmsaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindMypocketKmsaccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public BindMypocketKmsaccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public BindMypocketKmsaccountRequest setChainAccount(String chainAccount) {
        this.chainAccount = chainAccount;
        return this;
    }
    public String getChainAccount() {
        return this.chainAccount;
    }

    public BindMypocketKmsaccountRequest setKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }
    public String getKmsId() {
        return this.kmsId;
    }

}
