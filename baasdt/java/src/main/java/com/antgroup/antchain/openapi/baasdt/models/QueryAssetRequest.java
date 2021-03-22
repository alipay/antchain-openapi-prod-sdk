// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryAssetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 资产查询相关的租户ID
    @NameInMap("opt_tenant_id")
    public String optTenantId;

    // 若要查询用户持有的资产数量，输入用户ID
    @NameInMap("user_id")
    public String userId;

    public static QueryAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetRequest self = new QueryAssetRequest();
        return TeaModel.build(map, self);
    }

    public QueryAssetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAssetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAssetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryAssetRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryAssetRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public QueryAssetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
