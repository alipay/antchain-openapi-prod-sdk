// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardBlockRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块高度
    @NameInMap("block_number")
    @Validation(required = true)
    public Long blockNumber;

    // 链ID，指定要获取的
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
    @NameInMap("delegated_tenant_ids")
    public java.util.List<String> delegatedTenantIds;

    public static QueryConsumecardBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardBlockRequest self = new QueryConsumecardBlockRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardBlockRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardBlockRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardBlockRequest setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryConsumecardBlockRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryConsumecardBlockRequest setDelegatedTenantIds(java.util.List<String> delegatedTenantIds) {
        this.delegatedTenantIds = delegatedTenantIds;
        return this;
    }
    public java.util.List<String> getDelegatedTenantIds() {
        return this.delegatedTenantIds;
    }

}
