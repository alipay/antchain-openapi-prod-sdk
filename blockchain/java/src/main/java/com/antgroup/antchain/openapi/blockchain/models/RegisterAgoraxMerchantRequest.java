// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RegisterAgoraxMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户别名。支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及线下当面付场景，请填写线下店铺名称
    @NameInMap("alias_name")
    @Validation(required = true)
    public String aliasName;

    // 进件的二级商户名称，需与收款支付宝账户名称一致
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用授权码
    @NameInMap("app_auth_token")
    @Validation(required = true)
    public String appAuthToken;

    // 商家类型。01：企业，07：个体工商户，06：个人商户
    @NameInMap("merchant_type")
    @Validation(required = true)
    public String merchantType;

    // 联系人信息
    @NameInMap("contact_infos")
    @Validation(required = true)
    public ContactInfo contactInfos;

    // 默认结算规则
    @NameInMap("default_settle_rule")
    @Validation(required = true)
    public DefaultSettleRule defaultSettleRule;

    // 使用服务，当面付: 当面付，jsapi支付: jsapi支付
    @NameInMap("service")
    @Validation(required = true)
    public java.util.List<String> service;

    // 商户类别码
    @NameInMap("mcc")
    @Validation(required = true)
    public String mcc;

    // 商户证件编号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 商户证件类型
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 个体工商户营业执照上的名称
    @NameInMap("cert_name")
    public String certName;

    // 营业执照图片，file_id
    @NameInMap("cert_image")
    public String certImage;

    // 法人名称
    @NameInMap("legal_name")
    public String legalName;

    // 法人身份证号
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 商户支付宝账号，用作结算账号
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 二级商户支付宝账户，用于签约、协议确认
    @NameInMap("binding_alipay_logon_id")
    public String bindingAlipayLogonId;

    // 结算银行卡信息
    @NameInMap("biz_cards")
    public SettleCardInfo bizCards;

    // 经营地址
    @NameInMap("business_address")
    public AddressInfo businessAddress;

    // 门头照
    @NameInMap("out_door_images")
    public String outDoorImages;

    // 内景照
    @NameInMap("in_door_images")
    public String inDoorImages;

    // 授权函（图片）
    @NameInMap("license_auth_letter_image")
    public String licenseAuthLetterImage;

    // 商户站点信息
    @NameInMap("sites")
    public SiteInfo sites;

    // 商户行业资质
    @NameInMap("qualifications")
    public java.util.List<IndustryQualificationInfo> qualifications;

    // 法人身份证正面图
    @NameInMap("legal_cert_front_image")
    public String legalCertFrontImage;

    // 法人身份证反面图
    @NameInMap("legal_cert_back_image")
    public String legalCertBackImage;

    // 信息关联的openId
    @NameInMap("info_source_open_id")
    public String infoSourceOpenId;

    public static RegisterAgoraxMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAgoraxMerchantRequest self = new RegisterAgoraxMerchantRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAgoraxMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAgoraxMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAgoraxMerchantRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public RegisterAgoraxMerchantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterAgoraxMerchantRequest setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
        return this;
    }
    public String getAppAuthToken() {
        return this.appAuthToken;
    }

    public RegisterAgoraxMerchantRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public RegisterAgoraxMerchantRequest setContactInfos(ContactInfo contactInfos) {
        this.contactInfos = contactInfos;
        return this;
    }
    public ContactInfo getContactInfos() {
        return this.contactInfos;
    }

    public RegisterAgoraxMerchantRequest setDefaultSettleRule(DefaultSettleRule defaultSettleRule) {
        this.defaultSettleRule = defaultSettleRule;
        return this;
    }
    public DefaultSettleRule getDefaultSettleRule() {
        return this.defaultSettleRule;
    }

    public RegisterAgoraxMerchantRequest setService(java.util.List<String> service) {
        this.service = service;
        return this;
    }
    public java.util.List<String> getService() {
        return this.service;
    }

    public RegisterAgoraxMerchantRequest setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public RegisterAgoraxMerchantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public RegisterAgoraxMerchantRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public RegisterAgoraxMerchantRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public RegisterAgoraxMerchantRequest setCertImage(String certImage) {
        this.certImage = certImage;
        return this;
    }
    public String getCertImage() {
        return this.certImage;
    }

    public RegisterAgoraxMerchantRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public RegisterAgoraxMerchantRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public RegisterAgoraxMerchantRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public RegisterAgoraxMerchantRequest setBindingAlipayLogonId(String bindingAlipayLogonId) {
        this.bindingAlipayLogonId = bindingAlipayLogonId;
        return this;
    }
    public String getBindingAlipayLogonId() {
        return this.bindingAlipayLogonId;
    }

    public RegisterAgoraxMerchantRequest setBizCards(SettleCardInfo bizCards) {
        this.bizCards = bizCards;
        return this;
    }
    public SettleCardInfo getBizCards() {
        return this.bizCards;
    }

    public RegisterAgoraxMerchantRequest setBusinessAddress(AddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
    public AddressInfo getBusinessAddress() {
        return this.businessAddress;
    }

    public RegisterAgoraxMerchantRequest setOutDoorImages(String outDoorImages) {
        this.outDoorImages = outDoorImages;
        return this;
    }
    public String getOutDoorImages() {
        return this.outDoorImages;
    }

    public RegisterAgoraxMerchantRequest setInDoorImages(String inDoorImages) {
        this.inDoorImages = inDoorImages;
        return this;
    }
    public String getInDoorImages() {
        return this.inDoorImages;
    }

    public RegisterAgoraxMerchantRequest setLicenseAuthLetterImage(String licenseAuthLetterImage) {
        this.licenseAuthLetterImage = licenseAuthLetterImage;
        return this;
    }
    public String getLicenseAuthLetterImage() {
        return this.licenseAuthLetterImage;
    }

    public RegisterAgoraxMerchantRequest setSites(SiteInfo sites) {
        this.sites = sites;
        return this;
    }
    public SiteInfo getSites() {
        return this.sites;
    }

    public RegisterAgoraxMerchantRequest setQualifications(java.util.List<IndustryQualificationInfo> qualifications) {
        this.qualifications = qualifications;
        return this;
    }
    public java.util.List<IndustryQualificationInfo> getQualifications() {
        return this.qualifications;
    }

    public RegisterAgoraxMerchantRequest setLegalCertFrontImage(String legalCertFrontImage) {
        this.legalCertFrontImage = legalCertFrontImage;
        return this;
    }
    public String getLegalCertFrontImage() {
        return this.legalCertFrontImage;
    }

    public RegisterAgoraxMerchantRequest setLegalCertBackImage(String legalCertBackImage) {
        this.legalCertBackImage = legalCertBackImage;
        return this;
    }
    public String getLegalCertBackImage() {
        return this.legalCertBackImage;
    }

    public RegisterAgoraxMerchantRequest setInfoSourceOpenId(String infoSourceOpenId) {
        this.infoSourceOpenId = infoSourceOpenId;
        return this;
    }
    public String getInfoSourceOpenId() {
        return this.infoSourceOpenId;
    }

}
