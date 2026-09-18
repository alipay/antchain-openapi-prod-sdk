// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoMerchantInfo extends TeaModel {
    // 营业执照登记名称
    /**
     * <strong>example:</strong>
     * <p>营业执照登记名称</p>
     */
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 简称
    /**
     * <strong>example:</strong>
     * <p>简称</p>
     */
    @NameInMap("merchant_short_name")
    @Validation(required = true)
    public String merchantShortName;

    // 企业类型
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("enter_type")
    @Validation(required = true)
    public String enterType;

    // 商户角色
    /**
     * <strong>example:</strong>
     * <p>SI_STORE</p>
     */
    @NameInMap("merchant_role")
    @Validation(required = true)
    public String merchantRole;

    // 法人姓名
    /**
     * <strong>example:</strong>
     * <p>法人姓名</p>
     */
    @NameInMap("legal_person")
    @Validation(required = true)
    public String legalPerson;

    // 法人身份证号
    /**
     * <strong>example:</strong>
     * <p>法人身份证号</p>
     */
    @NameInMap("legal_person_id_card")
    @Validation(required = true)
    public String legalPersonIdCard;

    // 法人手机号
    /**
     * <strong>example:</strong>
     * <p>法人手机号</p>
     */
    @NameInMap("legal_person_phone")
    @Validation(required = true)
    public String legalPersonPhone;

    // 经营地址
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("operate_address")
    @Validation(required = true)
    public MaoOperateAddress operateAddress;

    // 图片
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("images")
    @Validation(required = true)
    public MaoImages images;

    // 结算账户
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("settle_account")
    @Validation(required = true)
    public MaoSettleAccount settleAccount;

    // 联系人列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("contacts")
    @Validation(required = true)
    public java.util.List<MaoContact> contacts;

    // 行业资质
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("industry_fields")
    public java.util.List<MaoQualification> industryFields;

    // 执照有效期
    @NameInMap("license_valid_period")
    public MaoLicenseValidPeriod licenseValidPeriod;

    // 是否连锁企业
    /**
     * <strong>example:</strong>
     * <p>是否连锁企业</p>
     */
    @NameInMap("is_chain")
    public String isChain;

    // 门店经营模式
    /**
     * <strong>example:</strong>
     * <p>门店经营模式</p>
     */
    @NameInMap("store_type")
    public String storeType;

    // 扩展字段
    /**
     * <strong>example:</strong>
     * <p>扩展字段</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

    // 门店经营范围
    /**
     * <strong>example:</strong>
     * <p>门店经营范围</p>
     */
    @NameInMap("business_scope")
    @Validation(required = true)
    public String businessScope;

    // 特殊行业许可证名称
    /**
     * <strong>example:</strong>
     * <p>特殊行业许可证名称</p>
     */
    @NameInMap("special_industry_license_name")
    public String specialIndustryLicenseName;

    // 特殊行业许可证有效期
    /**
     * <strong>example:</strong>
     * <p>特殊行业许可证有效期</p>
     */
    @NameInMap("special_industry_license_valid_period")
    public MaoLicenseValidPeriod specialIndustryLicenseValidPeriod;

    public static MaoMerchantInfo build(java.util.Map<String, ?> map) throws Exception {
        MaoMerchantInfo self = new MaoMerchantInfo();
        return TeaModel.build(map, self);
    }

    public MaoMerchantInfo setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public MaoMerchantInfo setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName;
        return this;
    }
    public String getMerchantShortName() {
        return this.merchantShortName;
    }

    public MaoMerchantInfo setEnterType(String enterType) {
        this.enterType = enterType;
        return this;
    }
    public String getEnterType() {
        return this.enterType;
    }

    public MaoMerchantInfo setMerchantRole(String merchantRole) {
        this.merchantRole = merchantRole;
        return this;
    }
    public String getMerchantRole() {
        return this.merchantRole;
    }

    public MaoMerchantInfo setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public MaoMerchantInfo setLegalPersonIdCard(String legalPersonIdCard) {
        this.legalPersonIdCard = legalPersonIdCard;
        return this;
    }
    public String getLegalPersonIdCard() {
        return this.legalPersonIdCard;
    }

    public MaoMerchantInfo setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
        return this;
    }
    public String getLegalPersonPhone() {
        return this.legalPersonPhone;
    }

    public MaoMerchantInfo setOperateAddress(MaoOperateAddress operateAddress) {
        this.operateAddress = operateAddress;
        return this;
    }
    public MaoOperateAddress getOperateAddress() {
        return this.operateAddress;
    }

    public MaoMerchantInfo setImages(MaoImages images) {
        this.images = images;
        return this;
    }
    public MaoImages getImages() {
        return this.images;
    }

    public MaoMerchantInfo setSettleAccount(MaoSettleAccount settleAccount) {
        this.settleAccount = settleAccount;
        return this;
    }
    public MaoSettleAccount getSettleAccount() {
        return this.settleAccount;
    }

    public MaoMerchantInfo setContacts(java.util.List<MaoContact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<MaoContact> getContacts() {
        return this.contacts;
    }

    public MaoMerchantInfo setIndustryFields(java.util.List<MaoQualification> industryFields) {
        this.industryFields = industryFields;
        return this;
    }
    public java.util.List<MaoQualification> getIndustryFields() {
        return this.industryFields;
    }

    public MaoMerchantInfo setLicenseValidPeriod(MaoLicenseValidPeriod licenseValidPeriod) {
        this.licenseValidPeriod = licenseValidPeriod;
        return this;
    }
    public MaoLicenseValidPeriod getLicenseValidPeriod() {
        return this.licenseValidPeriod;
    }

    public MaoMerchantInfo setIsChain(String isChain) {
        this.isChain = isChain;
        return this;
    }
    public String getIsChain() {
        return this.isChain;
    }

    public MaoMerchantInfo setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public MaoMerchantInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public MaoMerchantInfo setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }
    public String getBusinessScope() {
        return this.businessScope;
    }

    public MaoMerchantInfo setSpecialIndustryLicenseName(String specialIndustryLicenseName) {
        this.specialIndustryLicenseName = specialIndustryLicenseName;
        return this;
    }
    public String getSpecialIndustryLicenseName() {
        return this.specialIndustryLicenseName;
    }

    public MaoMerchantInfo setSpecialIndustryLicenseValidPeriod(MaoLicenseValidPeriod specialIndustryLicenseValidPeriod) {
        this.specialIndustryLicenseValidPeriod = specialIndustryLicenseValidPeriod;
        return this;
    }
    public MaoLicenseValidPeriod getSpecialIndustryLicenseValidPeriod() {
        return this.specialIndustryLicenseValidPeriod;
    }

}
