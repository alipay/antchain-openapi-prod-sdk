// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPMerchantApplyInfo extends TeaModel {
    // 链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 支付宝的登陆用户名(必须实名制)
    @NameInMap("alipay_login_name")
    @Validation(required = true)
    public String alipayLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    @NameInMap("merchant_alias_name")
    @Validation(required = true)
    public String merchantAliasName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    @NameInMap("merchant_type")
    @Validation(required = true)
    public Long merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
    @NameInMap("merchant_cert_type")
    @Validation(required = true)
    public Long merchantCertType;

    // 商户证件编号(企业提供营业执照),本期人工审核
    @NameInMap("merchant_cert_number")
    @Validation(required = true)
    public String merchantCertNumber;

    // 商户营业执照的图片地址,本期人工审核
    @NameInMap("merchant_cert_image")
    @Validation(required = true)
    public String merchantCertImage;

    // 税务登记证明的图片,本期人工审核
    @NameInMap("merchant_sign_image")
    @Validation(required = true)
    public String merchantSignImage;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    @NameInMap("mcc")
    @Validation(required = true)
    public String mcc;

    // 商户法人名称, merchant_type = 01时必填
    // 
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    // 
    @NameInMap("legal_cert_no")
    @Validation(required = true)
    public String legalCertNo;

    // 商户经营地址
    // 
    @NameInMap("address_info")
    @Validation(required = true)
    public IPAddressInfo addressInfo;

    // 默认结算规则
    // 
    @NameInMap("settle_rule")
    @Validation(required = true)
    public IPSettleRule settleRule;

    // 商户联系人信息
    // 
    @NameInMap("contact_info")
    @Validation(required = true)
    public IPContactInfo contactInfo;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    // 
    @NameInMap("card_info")
    @Validation(required = true)
    public IPCardInfo cardInfo;

    public static IPMerchantApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        IPMerchantApplyInfo self = new IPMerchantApplyInfo();
        return TeaModel.build(map, self);
    }

    public IPMerchantApplyInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IPMerchantApplyInfo setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public IPMerchantApplyInfo setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public IPMerchantApplyInfo setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public Long getMerchantType() {
        return this.merchantType;
    }

    public IPMerchantApplyInfo setMerchantCertType(Long merchantCertType) {
        this.merchantCertType = merchantCertType;
        return this;
    }
    public Long getMerchantCertType() {
        return this.merchantCertType;
    }

    public IPMerchantApplyInfo setMerchantCertNumber(String merchantCertNumber) {
        this.merchantCertNumber = merchantCertNumber;
        return this;
    }
    public String getMerchantCertNumber() {
        return this.merchantCertNumber;
    }

    public IPMerchantApplyInfo setMerchantCertImage(String merchantCertImage) {
        this.merchantCertImage = merchantCertImage;
        return this;
    }
    public String getMerchantCertImage() {
        return this.merchantCertImage;
    }

    public IPMerchantApplyInfo setMerchantSignImage(String merchantSignImage) {
        this.merchantSignImage = merchantSignImage;
        return this;
    }
    public String getMerchantSignImage() {
        return this.merchantSignImage;
    }

    public IPMerchantApplyInfo setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public IPMerchantApplyInfo setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public IPMerchantApplyInfo setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public IPMerchantApplyInfo setAddressInfo(IPAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public IPAddressInfo getAddressInfo() {
        return this.addressInfo;
    }

    public IPMerchantApplyInfo setSettleRule(IPSettleRule settleRule) {
        this.settleRule = settleRule;
        return this;
    }
    public IPSettleRule getSettleRule() {
        return this.settleRule;
    }

    public IPMerchantApplyInfo setContactInfo(IPContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IPContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public IPMerchantApplyInfo setCardInfo(IPCardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }
    public IPCardInfo getCardInfo() {
        return this.cardInfo;
    }

}
