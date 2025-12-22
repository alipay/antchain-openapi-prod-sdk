// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BankAccountInfo extends TeaModel {
    // 开户名称
    /**
     * <strong>example:</strong>
     * <p>张某某</p>
     */
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 开户行
    /**
     * <strong>example:</strong>
     * <p>某某银行</p>
     */
    @NameInMap("account_bank")
    @Validation(required = true)
    public String accountBank;

    // 开户账号
    /**
     * <strong>example:</strong>
     * <p>6234242342343456</p>
     */
    @NameInMap("account_number")
    @Validation(required = true)
    public String accountNumber;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>132312312xx</p>
     */
    @NameInMap("account_phone")
    @Validation(required = true)
    public String accountPhone;

    public static BankAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        BankAccountInfo self = new BankAccountInfo();
        return TeaModel.build(map, self);
    }

    public BankAccountInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BankAccountInfo setAccountBank(String accountBank) {
        this.accountBank = accountBank;
        return this;
    }
    public String getAccountBank() {
        return this.accountBank;
    }

    public BankAccountInfo setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BankAccountInfo setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
        return this;
    }
    public String getAccountPhone() {
        return this.accountPhone;
    }

}
