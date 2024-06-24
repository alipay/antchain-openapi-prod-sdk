// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CompanyInfo extends TeaModel {
    // 营业执照文件信息
    @NameInMap("business_license_file")
    @Validation(required = true)
    public FileInfo businessLicenseFile;

    // 业务类型 枚举
    @NameInMap("product_main_class")
    @Validation(required = true)
    public String productMainClass;

    // 公司名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 公司别名
    @NameInMap("company_alias_name")
    @Validation(required = true)
    public String companyAliasName;

    // 公司数科租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 公司联系电话
    @NameInMap("company_mobile")
    @Validation(required = true)
    public String companyMobile;

    // 公司联系地址
    @NameInMap("company_address")
    @Validation(required = true)
    public String companyAddress;

    // 联系人姓名
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系人手机号码
    @NameInMap("contact_mobile")
    @Validation(required = true)
    public String contactMobile;

    // 绑定企业支付宝账号
    @NameInMap("bind_alipay_no")
    @Validation(required = true)
    public String bindAlipayNo;

    // 结算企业支付宝账号
    @NameInMap("settle_alipay_no")
    @Validation(required = true)
    public String settleAlipayNo;

    // 绑定支付宝uid
    @NameInMap("bind_alipay_uid")
    @Validation(required = true)
    public String bindAlipayUid;

    public static CompanyInfo build(java.util.Map<String, ?> map) throws Exception {
        CompanyInfo self = new CompanyInfo();
        return TeaModel.build(map, self);
    }

    public CompanyInfo setBusinessLicenseFile(FileInfo businessLicenseFile) {
        this.businessLicenseFile = businessLicenseFile;
        return this;
    }
    public FileInfo getBusinessLicenseFile() {
        return this.businessLicenseFile;
    }

    public CompanyInfo setProductMainClass(String productMainClass) {
        this.productMainClass = productMainClass;
        return this;
    }
    public String getProductMainClass() {
        return this.productMainClass;
    }

    public CompanyInfo setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CompanyInfo setCompanyAliasName(String companyAliasName) {
        this.companyAliasName = companyAliasName;
        return this;
    }
    public String getCompanyAliasName() {
        return this.companyAliasName;
    }

    public CompanyInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CompanyInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CompanyInfo setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
        return this;
    }
    public String getCompanyMobile() {
        return this.companyMobile;
    }

    public CompanyInfo setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public CompanyInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CompanyInfo setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public CompanyInfo setBindAlipayNo(String bindAlipayNo) {
        this.bindAlipayNo = bindAlipayNo;
        return this;
    }
    public String getBindAlipayNo() {
        return this.bindAlipayNo;
    }

    public CompanyInfo setSettleAlipayNo(String settleAlipayNo) {
        this.settleAlipayNo = settleAlipayNo;
        return this;
    }
    public String getSettleAlipayNo() {
        return this.settleAlipayNo;
    }

    public CompanyInfo setBindAlipayUid(String bindAlipayUid) {
        this.bindAlipayUid = bindAlipayUid;
        return this;
    }
    public String getBindAlipayUid() {
        return this.bindAlipayUid;
    }

}
