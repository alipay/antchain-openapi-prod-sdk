// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class UserInvoiceInfo extends TeaModel {
    // 公司标题（发票抬头）
    /**
     * <strong>example:</strong>
     * <p>xxxx Group Limited</p>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 纳税人类型
    /**
     * <strong>example:</strong>
     * <p>03</p>
     */
    @NameInMap("tax_payer_qualification")
    @Validation(required = true)
    public String taxPayerQualification;

    // 注册国家编号
    /**
     * <strong>example:</strong>
     * <p>HK</p>
     */
    @NameInMap("register_country")
    @Validation(required = true)
    public String registerCountry;

    // 公司注册地址
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 纳税人识别号
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tax_no")
    public String taxNo;

    // 公司注册电话
    /**
     * <strong>example:</strong>
     * <p>17797768855</p>
     */
    @NameInMap("telephone")
    public String telephone;

    // 开户行
    /**
     * <strong>example:</strong>
     * <p>中国人民银行</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    // 银行账号
    /**
     * <strong>example:</strong>
     * <p>12312312</p>
     */
    @NameInMap("bank_account")
    public String bankAccount;

    public static UserInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        UserInvoiceInfo self = new UserInvoiceInfo();
        return TeaModel.build(map, self);
    }

    public UserInvoiceInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UserInvoiceInfo setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public UserInvoiceInfo setRegisterCountry(String registerCountry) {
        this.registerCountry = registerCountry;
        return this;
    }
    public String getRegisterCountry() {
        return this.registerCountry;
    }

    public UserInvoiceInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UserInvoiceInfo setTaxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }
    public String getTaxNo() {
        return this.taxNo;
    }

    public UserInvoiceInfo setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public UserInvoiceInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public UserInvoiceInfo setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

}
