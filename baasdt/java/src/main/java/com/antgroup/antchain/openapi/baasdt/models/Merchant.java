// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Merchant extends TeaModel {
    // 商户管理员ID
    @NameInMap("admin_id")
    @Validation(required = true)
    public String adminId;

    // 商户描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 商户分布式身份ID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 资金管理员ID
    @NameInMap("fund_manager_id")
    @Validation(required = true)
    public String fundManagerId;

    // 是否可以发行资产
    @NameInMap("is_asset_issuer")
    @Validation(required = true)
    public Boolean isAssetIssuer;

    // 是否可以采购权益
    @NameInMap("is_equity_consumer")
    @Validation(required = true)
    public Boolean isEquityConsumer;

    // 是否可以发行权益
    @NameInMap("is_equity_provider")
    @Validation(required = true)
    public Boolean isEquityProvider;

    // 备付金数据
    @NameInMap("provision")
    @Validation(required = true)
    public Provision provision;

    // 商户状态: 0可用, 1下线, 2冻结
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户的损益账户
    @NameInMap("profit_loss_balance")
    @Validation(required = true)
    public String profitLossBalance;

    public static Merchant build(java.util.Map<String, ?> map) throws Exception {
        Merchant self = new Merchant();
        return TeaModel.build(map, self);
    }

    public Merchant setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public Merchant setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Merchant setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public Merchant setFundManagerId(String fundManagerId) {
        this.fundManagerId = fundManagerId;
        return this;
    }
    public String getFundManagerId() {
        return this.fundManagerId;
    }

    public Merchant setIsAssetIssuer(Boolean isAssetIssuer) {
        this.isAssetIssuer = isAssetIssuer;
        return this;
    }
    public Boolean getIsAssetIssuer() {
        return this.isAssetIssuer;
    }

    public Merchant setIsEquityConsumer(Boolean isEquityConsumer) {
        this.isEquityConsumer = isEquityConsumer;
        return this;
    }
    public Boolean getIsEquityConsumer() {
        return this.isEquityConsumer;
    }

    public Merchant setIsEquityProvider(Boolean isEquityProvider) {
        this.isEquityProvider = isEquityProvider;
        return this;
    }
    public Boolean getIsEquityProvider() {
        return this.isEquityProvider;
    }

    public Merchant setProvision(Provision provision) {
        this.provision = provision;
        return this;
    }
    public Provision getProvision() {
        return this.provision;
    }

    public Merchant setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Merchant setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Merchant setProfitLossBalance(String profitLossBalance) {
        this.profitLossBalance = profitLossBalance;
        return this;
    }
    public String getProfitLossBalance() {
        return this.profitLossBalance;
    }

}
