// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetCommissionRequest extends TeaModel {
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

    // 手续费列表，可传入多个
    @NameInMap("commissions")
    @Validation(required = true)
    public java.util.List<Commission> commissions;

    // 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 是否设置全局手续费。若是false，需传入optTenantId
    @NameInMap("if_global")
    public Boolean ifGlobal;

    // 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
    @NameInMap("opt_tenant_id")
    public String optTenantId;

    // 交易幂等ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static SetCommissionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCommissionRequest self = new SetCommissionRequest();
        return TeaModel.build(map, self);
    }

    public SetCommissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetCommissionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetCommissionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SetCommissionRequest setCommissions(java.util.List<Commission> commissions) {
        this.commissions = commissions;
        return this;
    }
    public java.util.List<Commission> getCommissions() {
        return this.commissions;
    }

    public SetCommissionRequest setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public SetCommissionRequest setIfGlobal(Boolean ifGlobal) {
        this.ifGlobal = ifGlobal;
        return this;
    }
    public Boolean getIfGlobal() {
        return this.ifGlobal;
    }

    public SetCommissionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public SetCommissionRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
