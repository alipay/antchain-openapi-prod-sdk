// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 商户管理下的用户ID
    @NameInMap("local_id")
    @Validation(required = true)
    public String localId;

    public static QueryMerchantUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantUserRequest self = new QueryMerchantUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantUserRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMerchantUserRequest setLocalId(String localId) {
        this.localId = localId;
        return this;
    }
    public String getLocalId() {
        return this.localId;
    }

}
