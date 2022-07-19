// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateMypocketEscrowchainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 链id
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static CreateMypocketEscrowchainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMypocketEscrowchainaccountRequest self = new CreateMypocketEscrowchainaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateMypocketEscrowchainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMypocketEscrowchainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMypocketEscrowchainaccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateMypocketEscrowchainaccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
