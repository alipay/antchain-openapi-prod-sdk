// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class SettlementRequest extends TeaModel {
    // 结算方式：
    // 企业支付宝账号 Alipay
    // 银行卡账号 BankCard
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    // 银行卡账号
    @NameInMap("bank_no")
    public String bankNo;

    // 银行卡用户名称
    @NameInMap("bank_account_name")
    public String bankAccountName;

    // 银行支行名称
    @NameInMap("bank_branch_name")
    public String bankBranchName;

    // 支付宝账号
    @NameInMap("alipay_account")
    public String alipayAccount;

    public static SettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        SettlementRequest self = new SettlementRequest();
        return TeaModel.build(map, self);
    }

    public SettlementRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public SettlementRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public SettlementRequest setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
        return this;
    }
    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public SettlementRequest setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public SettlementRequest setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

}
