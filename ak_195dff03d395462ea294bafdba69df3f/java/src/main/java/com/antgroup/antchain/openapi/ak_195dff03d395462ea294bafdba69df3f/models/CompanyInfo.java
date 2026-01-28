// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CompanyInfo extends TeaModel {
    // 营业执照文件信息
    @NameInMap("business_license_file")
    @Validation(required = true)
    public FileInfo businessLicenseFile;

    // 证件是否长期有效  
    // true：长期，false：非长期
    // payChannel =JDPAY必填
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("business_license_cert_expire_flag")
    public Boolean businessLicenseCertExpireFlag;

    // 证件有效期开始日期(payChannel =JDPAY)
    // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
    // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
    /**
     * <strong>example:</strong>
     * <p>2024-10-17</p>
     */
    @NameInMap("business_license_cert_effect_date")
    public String businessLicenseCertEffectDate;

    // 证件有效期结束日期（payChannel =JDPAY选填参数）
    // certExpireFlag为false必填，时间格式：yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2024-10-17</p>
     */
    @NameInMap("business_license_cert_expire_date")
    public String businessLicenseCertExpireDate;

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
    public String companyMobile;

    // 公司联系地址
    /**
     * <strong>example:</strong>
     * <p>xx市xx区</p>
     */
    @NameInMap("company_address")
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

    // 联系地址-省份code(payChannel =JDPAY必填)
    /**
     * <strong>example:</strong>
     * <p>430000</p>
     */
    @NameInMap("contact_address_province_code")
    public String contactAddressProvinceCode;

    // 联系地址-省份名称（payChannel =JDPAY必填）
    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("contact_address_province_name")
    public String contactAddressProvinceName;

    // 联系地址-市code（payChannel =JDPAY必填）
    // 
    /**
     * <strong>example:</strong>
     * <p>403100</p>
     */
    @NameInMap("contact_address_city_code")
    public String contactAddressCityCode;

    // 联系人地址-市名称（payChannel =JDPAY必填）
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("contact_address_city_name")
    public String contactAddressCityName;

    // 联系人详细地址（payChannel =JDPAY必填）
    /**
     * <strong>example:</strong>
     * <p>杭州市余杭区xxx</p>
     */
    @NameInMap("contact_address_detail")
    public String contactAddressDetail;

    // 联系人邮箱（pay_channel=JDPAY必填）
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123123122134@163.com">123123122134@163.com</a></p>
     */
    @NameInMap("contact_email")
    public String contactEmail;

    // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
    /**
     * <strong>example:</strong>
     * <p>绑定企业支付宝账号</p>
     */
    @NameInMap("bind_alipay_no")
    public String bindAlipayNo;

    // 结算企业支付宝账号（pay_channel=ALIPAY必填）
    /**
     * <strong>example:</strong>
     * <p>结算企业支付宝账号</p>
     */
    @NameInMap("settle_alipay_no")
    public String settleAlipayNo;

    // 绑定支付宝uid（pay_channel=ALIPAY必填）
    /**
     * <strong>example:</strong>
     * <p>绑定支付宝uid</p>
     */
    @NameInMap("bind_alipay_uid")
    public String bindAlipayUid;

    // 经营范围
    // payChannel =JDPAY必填
    /**
     * <strong>example:</strong>
     * <p>经营租赁等业务</p>
     */
    @NameInMap("business_scope")
    public String businessScope;

    // 开户许可证（payChannel =JDPAY必填）
    // 
    @NameInMap("bank_opening_license_file")
    public FileInfo bankOpeningLicenseFile;

    // 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
    // 
    @NameInMap("cooperation_agreement_file")
    public FileInfo cooperationAgreementFile;

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

    public CompanyInfo setBusinessLicenseCertExpireFlag(Boolean businessLicenseCertExpireFlag) {
        this.businessLicenseCertExpireFlag = businessLicenseCertExpireFlag;
        return this;
    }
    public Boolean getBusinessLicenseCertExpireFlag() {
        return this.businessLicenseCertExpireFlag;
    }

    public CompanyInfo setBusinessLicenseCertEffectDate(String businessLicenseCertEffectDate) {
        this.businessLicenseCertEffectDate = businessLicenseCertEffectDate;
        return this;
    }
    public String getBusinessLicenseCertEffectDate() {
        return this.businessLicenseCertEffectDate;
    }

    public CompanyInfo setBusinessLicenseCertExpireDate(String businessLicenseCertExpireDate) {
        this.businessLicenseCertExpireDate = businessLicenseCertExpireDate;
        return this;
    }
    public String getBusinessLicenseCertExpireDate() {
        return this.businessLicenseCertExpireDate;
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

    public CompanyInfo setContactAddressProvinceCode(String contactAddressProvinceCode) {
        this.contactAddressProvinceCode = contactAddressProvinceCode;
        return this;
    }
    public String getContactAddressProvinceCode() {
        return this.contactAddressProvinceCode;
    }

    public CompanyInfo setContactAddressProvinceName(String contactAddressProvinceName) {
        this.contactAddressProvinceName = contactAddressProvinceName;
        return this;
    }
    public String getContactAddressProvinceName() {
        return this.contactAddressProvinceName;
    }

    public CompanyInfo setContactAddressCityCode(String contactAddressCityCode) {
        this.contactAddressCityCode = contactAddressCityCode;
        return this;
    }
    public String getContactAddressCityCode() {
        return this.contactAddressCityCode;
    }

    public CompanyInfo setContactAddressCityName(String contactAddressCityName) {
        this.contactAddressCityName = contactAddressCityName;
        return this;
    }
    public String getContactAddressCityName() {
        return this.contactAddressCityName;
    }

    public CompanyInfo setContactAddressDetail(String contactAddressDetail) {
        this.contactAddressDetail = contactAddressDetail;
        return this;
    }
    public String getContactAddressDetail() {
        return this.contactAddressDetail;
    }

    public CompanyInfo setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
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

    public CompanyInfo setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }
    public String getBusinessScope() {
        return this.businessScope;
    }

    public CompanyInfo setBankOpeningLicenseFile(FileInfo bankOpeningLicenseFile) {
        this.bankOpeningLicenseFile = bankOpeningLicenseFile;
        return this;
    }
    public FileInfo getBankOpeningLicenseFile() {
        return this.bankOpeningLicenseFile;
    }

    public CompanyInfo setCooperationAgreementFile(FileInfo cooperationAgreementFile) {
        this.cooperationAgreementFile = cooperationAgreementFile;
        return this;
    }
    public FileInfo getCooperationAgreementFile() {
        return this.cooperationAgreementFile;
    }

}
