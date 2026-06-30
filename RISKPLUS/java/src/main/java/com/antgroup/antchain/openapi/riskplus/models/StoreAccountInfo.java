// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StoreAccountInfo extends TeaModel {
    // 结算银行卡号
    /**
     * <strong>example:</strong>
     * <p>2023343380112</p>
     */
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 结算银行账户名称
    /**
     * <strong>example:</strong>
     * <p>交通银行</p>
     */
    @NameInMap("bank_account_name")
    @Validation(required = true)
    public String bankAccountName;

    // 结算银行code
    /**
     * <strong>example:</strong>
     * <p>ICBC</p>
     */
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // 商户号(支付通道给的商户编号)
    /**
     * <strong>example:</strong>
     * <p>202334332380</p>
     */
    @NameInMap("merchant_no")
    @Validation(required = true)
    public String merchantNo;

    // 银行虚拟户卡号(监管户的账户信息)
    /**
     * <strong>example:</strong>
     * <p>3242352345234</p>
     */
    @NameInMap("e_virtual_bank_card_no")
    @Validation(required = true)
    public String eVirtualBankCardNo;

    // 银行虚拟户账户名称(监管户的账户信息)
    /**
     * <strong>example:</strong>
     * <p>账户1</p>
     */
    @NameInMap("e_virtual_bank_account_name")
    @Validation(required = true)
    public String eVirtualBankAccountName;

    // 银行虚拟户银行code(监管户的账户信息)
    /**
     * <strong>example:</strong>
     * <p>SEFG</p>
     */
    @NameInMap("e_virtual_bank_code")
    @Validation(required = true)
    public String eVirtualBankCode;

    public static StoreAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        StoreAccountInfo self = new StoreAccountInfo();
        return TeaModel.build(map, self);
    }

    public StoreAccountInfo setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public StoreAccountInfo setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
        return this;
    }
    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public StoreAccountInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public StoreAccountInfo setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

    public StoreAccountInfo setEVirtualBankCardNo(String eVirtualBankCardNo) {
        this.eVirtualBankCardNo = eVirtualBankCardNo;
        return this;
    }
    public String getEVirtualBankCardNo() {
        return this.eVirtualBankCardNo;
    }

    public StoreAccountInfo setEVirtualBankAccountName(String eVirtualBankAccountName) {
        this.eVirtualBankAccountName = eVirtualBankAccountName;
        return this;
    }
    public String getEVirtualBankAccountName() {
        return this.eVirtualBankAccountName;
    }

    public StoreAccountInfo setEVirtualBankCode(String eVirtualBankCode) {
        this.eVirtualBankCode = eVirtualBankCode;
        return this;
    }
    public String getEVirtualBankCode() {
        return this.eVirtualBankCode;
    }

}
