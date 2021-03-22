// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryExchangeInstructionRequest extends TeaModel {
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

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 发起操作的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    public static QueryExchangeInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExchangeInstructionRequest self = new QueryExchangeInstructionRequest();
        return TeaModel.build(map, self);
    }

    public QueryExchangeInstructionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryExchangeInstructionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryExchangeInstructionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryExchangeInstructionRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public QueryExchangeInstructionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public QueryExchangeInstructionRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

}
