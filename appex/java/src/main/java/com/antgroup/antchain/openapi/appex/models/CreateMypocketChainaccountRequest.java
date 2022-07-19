// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateMypocketChainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户的MyPocket账户对应的DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 区块链在MyPocket中的唯一ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static CreateMypocketChainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMypocketChainaccountRequest self = new CreateMypocketChainaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateMypocketChainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMypocketChainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMypocketChainaccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateMypocketChainaccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
