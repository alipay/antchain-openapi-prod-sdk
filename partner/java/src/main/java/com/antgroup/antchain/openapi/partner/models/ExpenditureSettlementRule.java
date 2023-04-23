// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureSettlementRule extends TeaModel {
    // 支付方式
    //     Alipay("01","Alipay","ALIPAYACCOUNT", "企业支付宝账号"),
    //     BankCard("02","BankCard", "BANKCARD", "银行卡账号")
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    // 银行卡账号
    @NameInMap("bank_no")
    public String bankNo;

    // 银行用户名称
    @NameInMap("bank_account_name")
    public String bankAccountName;

    // 开户行支行名称
    @NameInMap("bank_branch_name")
    public String bankBranchName;

    // 支付宝账号
    @NameInMap("alipay_account")
    public String alipayAccount;

    public static ExpenditureSettlementRule build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureSettlementRule self = new ExpenditureSettlementRule();
        return TeaModel.build(map, self);
    }

    public ExpenditureSettlementRule setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ExpenditureSettlementRule setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public ExpenditureSettlementRule setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
        return this;
    }
    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public ExpenditureSettlementRule setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public ExpenditureSettlementRule setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

}
