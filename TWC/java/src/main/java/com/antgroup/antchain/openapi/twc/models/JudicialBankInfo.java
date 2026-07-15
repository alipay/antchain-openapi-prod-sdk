// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialBankInfo extends TeaModel {
    // 开户行
    /**
     * <strong>example:</strong>
     * <p>开户银行</p>
     */
    @NameInMap("account_bank")
    @Validation(required = true)
    public String accountBank;

    // 开户账号
    /**
     * <strong>example:</strong>
     * <p>f3232sdj32fl312ksdj</p>
     */
    @NameInMap("account_number")
    @Validation(required = true)
    public String accountNumber;

    // 开户名称
    /**
     * <strong>example:</strong>
     * <p>示例开户名称</p>
     */
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 开户联系电话
    /**
     * <strong>example:</strong>
     * <p>15000000000</p>
     */
    @NameInMap("account_contact_phone")
    @Validation(required = true)
    public String accountContactPhone;

    public static JudicialBankInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialBankInfo self = new JudicialBankInfo();
        return TeaModel.build(map, self);
    }

    public JudicialBankInfo setAccountBank(String accountBank) {
        this.accountBank = accountBank;
        return this;
    }
    public String getAccountBank() {
        return this.accountBank;
    }

    public JudicialBankInfo setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public JudicialBankInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public JudicialBankInfo setAccountContactPhone(String accountContactPhone) {
        this.accountContactPhone = accountContactPhone;
        return this;
    }
    public String getAccountContactPhone() {
        return this.accountContactPhone;
    }

}
