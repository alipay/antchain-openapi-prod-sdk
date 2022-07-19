// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketChainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要查询的链账户绑定的DID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 要查询的区块链账户所在的链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    public static QueryMypocketChainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketChainaccountRequest self = new QueryMypocketChainaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypocketChainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypocketChainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypocketChainaccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryMypocketChainaccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

}
