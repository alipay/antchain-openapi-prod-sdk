// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class UserInvoiceConfigVO extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>XX公司</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业电话
    /**
     * <strong>example:</strong>
     * <p>0571-877776</p>
     */
    @NameInMap("company_phone_no")
    public String companyPhoneNo;

    // 公司地址(详细地址)
    /**
     * <strong>example:</strong>
     * <p>上海市黄浦区外马路</p>
     */
    @NameInMap("company_address")
    public String companyAddress;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>招商银行</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    // 银行账号
    /**
     * <strong>example:</strong>
     * <p>34355565</p>
     */
    @NameInMap("bank_account")
    public String bankAccount;

    // 税号
    /**
     * <strong>example:</strong>
     * <p>35556T5</p>
     */
    @NameInMap("tax_no")
    public String taxNo;

    // 是否是一般纳税人
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("general_taxpayer")
    @Validation(required = true)
    public Boolean generalTaxpayer;

    public static UserInvoiceConfigVO build(java.util.Map<String, ?> map) throws Exception {
        UserInvoiceConfigVO self = new UserInvoiceConfigVO();
        return TeaModel.build(map, self);
    }

    public UserInvoiceConfigVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UserInvoiceConfigVO setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UserInvoiceConfigVO setCompanyPhoneNo(String companyPhoneNo) {
        this.companyPhoneNo = companyPhoneNo;
        return this;
    }
    public String getCompanyPhoneNo() {
        return this.companyPhoneNo;
    }

    public UserInvoiceConfigVO setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public UserInvoiceConfigVO setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public UserInvoiceConfigVO setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public UserInvoiceConfigVO setTaxNo(String taxNo) {
        this.taxNo = taxNo;
        return this;
    }
    public String getTaxNo() {
        return this.taxNo;
    }

    public UserInvoiceConfigVO setGeneralTaxpayer(Boolean generalTaxpayer) {
        this.generalTaxpayer = generalTaxpayer;
        return this;
    }
    public Boolean getGeneralTaxpayer() {
        return this.generalTaxpayer;
    }

}
