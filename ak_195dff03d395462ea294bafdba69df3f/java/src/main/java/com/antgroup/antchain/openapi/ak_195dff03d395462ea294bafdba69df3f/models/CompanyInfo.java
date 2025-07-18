// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CompanyInfo extends TeaModel {
    // 营业执照文件信息
    @NameInMap("business_license_file")
    @Validation(required = true)
    public FileInfo businessLicenseFile;

    // 业务类型 枚举
    /**
     * <strong>example:</strong>
     * <p>业务类型</p>
     */
    @NameInMap("product_main_class")
    @Validation(required = true)
    public String productMainClass;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 公司别名
    /**
     * <strong>example:</strong>
     * <p>公司别名</p>
     */
    @NameInMap("company_alias_name")
    @Validation(required = true)
    public String companyAliasName;

    // 公司数科租户id
    /**
     * <strong>example:</strong>
     * <p>ASSDDDAS</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>9121asd231231231231</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户类型： 01：企业；07：个体工商户
    // 默认不填为01
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("merchant_type")
    public String merchantType;

    // 公司联系电话
    /**
     * <strong>example:</strong>
     * <p>1231xx2322</p>
     */
    @NameInMap("company_mobile")
    @Validation(required = true)
    public String companyMobile;

    // 公司联系地址
    /**
     * <strong>example:</strong>
     * <p>xx市xx区</p>
     */
    @NameInMap("company_address")
    @Validation(required = true)
    public String companyAddress;

    // 联系人姓名
    /**
     * <strong>example:</strong>
     * <p>李xx</p>
     */
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系人手机号码
    /**
     * <strong>example:</strong>
     * <p>132xx2312312</p>
     */
    @NameInMap("contact_mobile")
    @Validation(required = true)
    public String contactMobile;

    // 绑定企业支付宝账号
    /**
     * <strong>example:</strong>
     * <p>绑定企业支付宝账号</p>
     */
    @NameInMap("bind_alipay_no")
    @Validation(required = true)
    public String bindAlipayNo;

    // 结算企业支付宝账号
    /**
     * <strong>example:</strong>
     * <p>结算企业支付宝账号</p>
     */
    @NameInMap("settle_alipay_no")
    @Validation(required = true)
    public String settleAlipayNo;

    // 绑定支付宝uid
    /**
     * <strong>example:</strong>
     * <p>绑定支付宝uid</p>
     */
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

    public CompanyInfo setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
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
