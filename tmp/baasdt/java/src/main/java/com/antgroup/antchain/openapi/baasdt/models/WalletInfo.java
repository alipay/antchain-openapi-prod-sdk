// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class WalletInfo extends TeaModel {
    // 授信钱包信息
    @NameInMap("credit_wallet")
    @Validation(required = true)
    public CreditWallet creditWallet;

    // 余额钱包信息
    @NameInMap("debit_wallet")
    @Validation(required = true)
    public DebitWallet debitWallet;

    // 钱包统计信息
    @NameInMap("statistical_info")
    @Validation(required = true)
    public StatisticalInfo statisticalInfo;

    public static WalletInfo build(java.util.Map<String, ?> map) throws Exception {
        WalletInfo self = new WalletInfo();
        return TeaModel.build(map, self);
    }

    public WalletInfo setCreditWallet(CreditWallet creditWallet) {
        this.creditWallet = creditWallet;
        return this;
    }
    public CreditWallet getCreditWallet() {
        return this.creditWallet;
    }

    public WalletInfo setDebitWallet(DebitWallet debitWallet) {
        this.debitWallet = debitWallet;
        return this;
    }
    public DebitWallet getDebitWallet() {
        return this.debitWallet;
    }

    public WalletInfo setStatisticalInfo(StatisticalInfo statisticalInfo) {
        this.statisticalInfo = statisticalInfo;
        return this;
    }
    public StatisticalInfo getStatisticalInfo() {
        return this.statisticalInfo;
    }

}
