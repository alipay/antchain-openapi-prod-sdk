// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class CardInfo extends TeaModel {
    // 卡户名
    @NameInMap("account_holder_name")
    @Validation(required = true)
    public String accountHolderName;

    // 卡号
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 银行名称
    @NameInMap("account_inst_name")
    @Validation(required = true)
    public String accountInstName;

    // 银行缩写
    @NameInMap("account_inst_id")
    @Validation(required = true)
    public String accountInstId;

    // 联行号
    @NameInMap("bank_code")
    public String bankCode;

    // 开户行所在省份
    @NameInMap("account_inst_province")
    @Validation(required = true)
    public String accountInstProvince;

    // 开户行所在城市
    @NameInMap("account_inst_city")
    @Validation(required = true)
    public String accountInstCity;

    // 开户行支行名称
    @NameInMap("account_branch_name")
    @Validation(required = true)
    public String accountBranchName;

    public static CardInfo build(java.util.Map<String, ?> map) throws Exception {
        CardInfo self = new CardInfo();
        return TeaModel.build(map, self);
    }

    public CardInfo setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
    }
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public CardInfo setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public CardInfo setAccountInstName(String accountInstName) {
        this.accountInstName = accountInstName;
        return this;
    }
    public String getAccountInstName() {
        return this.accountInstName;
    }

    public CardInfo setAccountInstId(String accountInstId) {
        this.accountInstId = accountInstId;
        return this;
    }
    public String getAccountInstId() {
        return this.accountInstId;
    }

    public CardInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public CardInfo setAccountInstProvince(String accountInstProvince) {
        this.accountInstProvince = accountInstProvince;
        return this;
    }
    public String getAccountInstProvince() {
        return this.accountInstProvince;
    }

    public CardInfo setAccountInstCity(String accountInstCity) {
        this.accountInstCity = accountInstCity;
        return this;
    }
    public String getAccountInstCity() {
        return this.accountInstCity;
    }

    public CardInfo setAccountBranchName(String accountBranchName) {
        this.accountBranchName = accountBranchName;
        return this;
    }
    public String getAccountBranchName() {
        return this.accountBranchName;
    }

}
