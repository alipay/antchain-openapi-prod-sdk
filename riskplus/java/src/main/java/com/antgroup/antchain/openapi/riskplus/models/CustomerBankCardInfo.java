// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomerBankCardInfo extends TeaModel {
    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>工商银行</p>
     */
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 银行编码
    /**
     * <strong>example:</strong>
     * <p>ICBC</p>
     */
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>6226211215645646</p>
     */
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 是否已签约
    /**
     * <strong>example:</strong>
     * <p>Y/N</p>
     */
    @NameInMap("signed")
    public String signed;

    // 是否为账户代扣银行卡
    /**
     * <strong>example:</strong>
     * <p>Y/N</p>
     */
    @NameInMap("acct_bank_card")
    public String acctBankCard;

    public static CustomerBankCardInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomerBankCardInfo self = new CustomerBankCardInfo();
        return TeaModel.build(map, self);
    }

    public CustomerBankCardInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public CustomerBankCardInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public CustomerBankCardInfo setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public CustomerBankCardInfo setSigned(String signed) {
        this.signed = signed;
        return this;
    }
    public String getSigned() {
        return this.signed;
    }

    public CustomerBankCardInfo setAcctBankCard(String acctBankCard) {
        this.acctBankCard = acctBankCard;
        return this;
    }
    public String getAcctBankCard() {
        return this.acctBankCard;
    }

}
