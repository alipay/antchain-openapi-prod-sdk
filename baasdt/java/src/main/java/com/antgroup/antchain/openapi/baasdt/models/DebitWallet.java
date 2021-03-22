// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class DebitWallet extends TeaModel {
    // 钱包余额(单位:元, 精确到小数点后4位)
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 开户名称
    @NameInMap("bank_account_name")
    @Validation(required = true)
    public String bankAccountName;

    // 开户地
    @NameInMap("bank_address")
    @Validation(required = true)
    public String bankAddress;

    // 开户银行分支机构名称
    @NameInMap("bank_branch_name")
    @Validation(required = true)
    public String bankBranchName;

    // 开户卡号
    @NameInMap("bank_card_id")
    @Validation(required = true)
    public String bankCardId;

    // 开户行名称
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 其他信息（例举：联行号）
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 资金管理员
    @NameInMap("fund_manager_id")
    @Validation(required = true)
    public String fundManagerId;

    // 资金托管员
    @NameInMap("trustee_id")
    @Validation(required = true)
    public String trusteeId;

    // 钱包类型（0:debit,1:credit）
    @NameInMap("wallet_type")
    @Validation(required = true)
    public Long walletType;

    public static DebitWallet build(java.util.Map<String, ?> map) throws Exception {
        DebitWallet self = new DebitWallet();
        return TeaModel.build(map, self);
    }

    public DebitWallet setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public DebitWallet setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
        return this;
    }
    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public DebitWallet setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
        return this;
    }
    public String getBankAddress() {
        return this.bankAddress;
    }

    public DebitWallet setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public DebitWallet setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
        return this;
    }
    public String getBankCardId() {
        return this.bankCardId;
    }

    public DebitWallet setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public DebitWallet setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public DebitWallet setFundManagerId(String fundManagerId) {
        this.fundManagerId = fundManagerId;
        return this;
    }
    public String getFundManagerId() {
        return this.fundManagerId;
    }

    public DebitWallet setTrusteeId(String trusteeId) {
        this.trusteeId = trusteeId;
        return this;
    }
    public String getTrusteeId() {
        return this.trusteeId;
    }

    public DebitWallet setWalletType(Long walletType) {
        this.walletType = walletType;
        return this;
    }
    public Long getWalletType() {
        return this.walletType;
    }

}
