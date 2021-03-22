// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryCommissionRequest extends TeaModel {
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

    // 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
    @NameInMap("if_current")
    @Validation(required = true)
    public Boolean ifCurrent;

    // 是否查询全局的手续费信息
    @NameInMap("if_global")
    @Validation(required = true)
    public Boolean ifGlobal;

    // 查询该租户的手续费信息
    @NameInMap("delegated_tenant_id")
    @Validation(required = true)
    public String delegatedTenantId;

    public static QueryCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommissionRequest self = new QueryCommissionRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCommissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCommissionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryCommissionRequest setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public QueryCommissionRequest setIfCurrent(Boolean ifCurrent) {
        this.ifCurrent = ifCurrent;
        return this;
    }
    public Boolean getIfCurrent() {
        return this.ifCurrent;
    }

    public QueryCommissionRequest setIfGlobal(Boolean ifGlobal) {
        this.ifGlobal = ifGlobal;
        return this;
    }
    public Boolean getIfGlobal() {
        return this.ifGlobal;
    }

    public QueryCommissionRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

}
