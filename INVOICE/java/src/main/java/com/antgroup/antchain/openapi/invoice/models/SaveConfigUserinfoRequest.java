// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class SaveConfigUserinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 公司名称
    @NameInMap("company_name")
    public String companyName;

    // 企业电话
    @NameInMap("company_phone_no")
    public String companyPhoneNo;

    // 公司地址
    @NameInMap("company_address")
    public String companyAddress;

    // 银行名称
    @NameInMap("bank_name")
    public String bankName;

    // 银行卡号
    @NameInMap("bank_no")
    public String bankNo;

    // 企业税号
    @NameInMap("tax_registration_no")
    public String taxRegistrationNo;

    // 是否是一般纳税人
    @NameInMap("general_taxpayer")
    @Validation(required = true)
    public Boolean generalTaxpayer;

    // 发票介质 电票 01 纸质02
    @NameInMap("invoice_material")
    @Validation(required = true)
    public String invoiceMaterial;

    public static SaveConfigUserinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigUserinfoRequest self = new SaveConfigUserinfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveConfigUserinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveConfigUserinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveConfigUserinfoRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SaveConfigUserinfoRequest setCompanyPhoneNo(String companyPhoneNo) {
        this.companyPhoneNo = companyPhoneNo;
        return this;
    }
    public String getCompanyPhoneNo() {
        return this.companyPhoneNo;
    }

    public SaveConfigUserinfoRequest setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public SaveConfigUserinfoRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public SaveConfigUserinfoRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public SaveConfigUserinfoRequest setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
        return this;
    }
    public String getTaxRegistrationNo() {
        return this.taxRegistrationNo;
    }

    public SaveConfigUserinfoRequest setGeneralTaxpayer(Boolean generalTaxpayer) {
        this.generalTaxpayer = generalTaxpayer;
        return this;
    }
    public Boolean getGeneralTaxpayer() {
        return this.generalTaxpayer;
    }

    public SaveConfigUserinfoRequest setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

}
