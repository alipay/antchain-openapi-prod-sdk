// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryEquityInstructionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 代理该租户调用接口，会使用该租户发送交易链上查询信息
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 发起操作的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 要查询的流水交易号
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    public static QueryEquityInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEquityInstructionRequest self = new QueryEquityInstructionRequest();
        return TeaModel.build(map, self);
    }

    public QueryEquityInstructionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEquityInstructionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEquityInstructionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryEquityInstructionRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public QueryEquityInstructionRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public QueryEquityInstructionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public QueryEquityInstructionRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

}
