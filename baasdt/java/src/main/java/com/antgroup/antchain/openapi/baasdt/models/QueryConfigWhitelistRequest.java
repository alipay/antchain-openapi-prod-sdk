// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConfigWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询链的白名单信息
    @NameInMap("chain_id")
    public String chainId;

    // 查询该租户的白名单信息
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryConfigWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigWhitelistRequest self = new QueryConfigWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConfigWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConfigWhitelistRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryConfigWhitelistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
