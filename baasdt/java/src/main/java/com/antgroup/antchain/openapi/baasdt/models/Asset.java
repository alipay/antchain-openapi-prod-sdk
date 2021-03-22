// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Asset extends TeaModel {
    // 资产管理员ID
    @NameInMap("admin_id")
    @Validation(required = true)
    public String adminId;

    // 资产附属信息
    @NameInMap("asset_ext_info")
    @Validation(required = true)
    public AssetExtInfo assetExtInfo;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资产名称
    @NameInMap("asset_name")
    @Validation(required = true)
    public String assetName;

    // 资产汇率
    @NameInMap("asset_rate")
    @Validation(required = true)
    public String assetRate;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 发行账户余额
    @NameInMap("issue_account_balance")
    @Validation(required = true)
    public String issueAccountBalance;

    // 过期回收账户余额
    @NameInMap("overdue_recovery_account_balance")
    @Validation(required = true)
    public String overdueRecoveryAccountBalance;

    // 支付收款账户余额
    @NameInMap("receive_payment_account_balance")
    @Validation(required = true)
    public String receivePaymentAccountBalance;

    // 中继账户余额
    @NameInMap("relay_account_balance")
    @Validation(required = true)
    public String relayAccountBalance;

    // 资产状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 资产总发行量
    @NameInMap("total_issue_balance")
    @Validation(required = true)
    public String totalIssueBalance;

    public static Asset build(java.util.Map<String, ?> map) throws Exception {
        Asset self = new Asset();
        return TeaModel.build(map, self);
    }

    public Asset setAdminId(String adminId) {
        this.adminId = adminId;
        return this;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public Asset setAssetExtInfo(AssetExtInfo assetExtInfo) {
        this.assetExtInfo = assetExtInfo;
        return this;
    }
    public AssetExtInfo getAssetExtInfo() {
        return this.assetExtInfo;
    }

    public Asset setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public Asset setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public Asset setAssetRate(String assetRate) {
        this.assetRate = assetRate;
        return this;
    }
    public String getAssetRate() {
        return this.assetRate;
    }

    public Asset setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Asset setIssueAccountBalance(String issueAccountBalance) {
        this.issueAccountBalance = issueAccountBalance;
        return this;
    }
    public String getIssueAccountBalance() {
        return this.issueAccountBalance;
    }

    public Asset setOverdueRecoveryAccountBalance(String overdueRecoveryAccountBalance) {
        this.overdueRecoveryAccountBalance = overdueRecoveryAccountBalance;
        return this;
    }
    public String getOverdueRecoveryAccountBalance() {
        return this.overdueRecoveryAccountBalance;
    }

    public Asset setReceivePaymentAccountBalance(String receivePaymentAccountBalance) {
        this.receivePaymentAccountBalance = receivePaymentAccountBalance;
        return this;
    }
    public String getReceivePaymentAccountBalance() {
        return this.receivePaymentAccountBalance;
    }

    public Asset setRelayAccountBalance(String relayAccountBalance) {
        this.relayAccountBalance = relayAccountBalance;
        return this;
    }
    public String getRelayAccountBalance() {
        return this.relayAccountBalance;
    }

    public Asset setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public Asset setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Asset setTotalIssueBalance(String totalIssueBalance) {
        this.totalIssueBalance = totalIssueBalance;
        return this;
    }
    public String getTotalIssueBalance() {
        return this.totalIssueBalance;
    }

}
