// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CompanyInfoUpdate extends TeaModel {
    // 营业执照文件信息
    @NameInMap("business_license_file")
    public FileInfo businessLicenseFile;

    // 业务类型 枚举
    @NameInMap("product_main_class")
    public String productMainClass;

    // 公司名称
    @NameInMap("company_name")
    public String companyName;

    // 公司别名
    @NameInMap("company_alias_name")
    public String companyAliasName;

    // 公司数科租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 公司联系电话
    @NameInMap("company_mobile")
    public String companyMobile;

    // 公司联系地址
    @NameInMap("company_address")
    public String companyAddress;

    // 联系人姓名
    @NameInMap("contact_name")
    public String contactName;

    // 联系人手机号码
    @NameInMap("contact_mobile")
    public String contactMobile;

    public static CompanyInfoUpdate build(java.util.Map<String, ?> map) throws Exception {
        CompanyInfoUpdate self = new CompanyInfoUpdate();
        return TeaModel.build(map, self);
    }

    public CompanyInfoUpdate setBusinessLicenseFile(FileInfo businessLicenseFile) {
        this.businessLicenseFile = businessLicenseFile;
        return this;
    }
    public FileInfo getBusinessLicenseFile() {
        return this.businessLicenseFile;
    }

    public CompanyInfoUpdate setProductMainClass(String productMainClass) {
        this.productMainClass = productMainClass;
        return this;
    }
    public String getProductMainClass() {
        return this.productMainClass;
    }

    public CompanyInfoUpdate setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CompanyInfoUpdate setCompanyAliasName(String companyAliasName) {
        this.companyAliasName = companyAliasName;
        return this;
    }
    public String getCompanyAliasName() {
        return this.companyAliasName;
    }

    public CompanyInfoUpdate setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CompanyInfoUpdate setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
        return this;
    }
    public String getCompanyMobile() {
        return this.companyMobile;
    }

    public CompanyInfoUpdate setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public CompanyInfoUpdate setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CompanyInfoUpdate setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

}
