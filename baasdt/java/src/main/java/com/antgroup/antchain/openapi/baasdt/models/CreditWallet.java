// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreditWallet extends TeaModel {
    // 最大授信额度(单位:元,精确到小数点后4位)
    @NameInMap("max_balance")
    @Validation(required = true)
    public String maxBalance;

    // 已经使用的授信额度(单位:元,精确到小数点后4位)
    @NameInMap("used_balance")
    @Validation(required = true)
    public String usedBalance;

    // 钱包类型（0:debit,1:credit）
    @NameInMap("wallet_type")
    @Validation(required = true)
    public Long walletType;

    // 资金管理员
    @NameInMap("fund_manager_id")
    @Validation(required = true)
    public String fundManagerId;

    // 资金托管员
    @NameInMap("trustee_id")
    @Validation(required = true)
    public String trusteeId;

    // 其他信息（例举：联行号）
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static CreditWallet build(java.util.Map<String, ?> map) throws Exception {
        CreditWallet self = new CreditWallet();
        return TeaModel.build(map, self);
    }

    public CreditWallet setMaxBalance(String maxBalance) {
        this.maxBalance = maxBalance;
        return this;
    }
    public String getMaxBalance() {
        return this.maxBalance;
    }

    public CreditWallet setUsedBalance(String usedBalance) {
        this.usedBalance = usedBalance;
        return this;
    }
    public String getUsedBalance() {
        return this.usedBalance;
    }

    public CreditWallet setWalletType(Long walletType) {
        this.walletType = walletType;
        return this;
    }
    public Long getWalletType() {
        return this.walletType;
    }

    public CreditWallet setFundManagerId(String fundManagerId) {
        this.fundManagerId = fundManagerId;
        return this;
    }
    public String getFundManagerId() {
        return this.fundManagerId;
    }

    public CreditWallet setTrusteeId(String trusteeId) {
        this.trusteeId = trusteeId;
        return this;
    }
    public String getTrusteeId() {
        return this.trusteeId;
    }

    public CreditWallet setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
