// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ApplyIpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方的链上账户Id
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

    // 商户类型(本期仅支持:  1:企业, 6:个人商户)
    @NameInMap("merchant_type")
    @Validation(required = true)
    public Long merchantType;

    // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证)
    // 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
    @NameInMap("merchant_cert_type")
    @Validation(required = true)
    public Long merchantCertType;

    // 商户证件编号(企业提供营业执照),本期人工审核
    @NameInMap("merchant_cert_number")
    public String merchantCertNumber;

    // 商户营业执照的图片地址,本期人工审核
    @NameInMap("merchant_cert_image")
    public String merchantCertImage;

    // 税务登记证明的图片,本期人工审核
    @NameInMap("merchant_sign_image")
    public String merchantSignImage;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    @NameInMap("mcc")
    @Validation(required = true)
    public String mcc;

    // 商户法人名称, merchant_type = 01时必填	
    @NameInMap("legal_name")
    public String legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 商户法人证件类型，默认大陆身份证：CRED_PSN_CH_IDCARD
    @NameInMap("legal_cert_type")
    public String legalCertType;

    // 商户经营地址
    @NameInMap("address_info")
    @Validation(required = true)
    public IPAddressInfo addressInfo;

    // 商户联系人信息
    @NameInMap("contact_info")
    @Validation(required = true)
    public IPContactInfo contactInfo;

    // 默认结算规则
    @NameInMap("settle_rule")
    @Validation(required = true)
    public IPSettleRule settleRule;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    @NameInMap("card_info")
    public IPCardInfo cardInfo;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static ApplyIpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIpAccountRequest self = new ApplyIpAccountRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyIpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyIpAccountRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ApplyIpAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ApplyIpAccountRequest setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public ApplyIpAccountRequest setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public ApplyIpAccountRequest setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public Long getMerchantType() {
        return this.merchantType;
    }

    public ApplyIpAccountRequest setMerchantCertType(Long merchantCertType) {
        this.merchantCertType = merchantCertType;
        return this;
    }
    public Long getMerchantCertType() {
        return this.merchantCertType;
    }

    public ApplyIpAccountRequest setMerchantCertNumber(String merchantCertNumber) {
        this.merchantCertNumber = merchantCertNumber;
        return this;
    }
    public String getMerchantCertNumber() {
        return this.merchantCertNumber;
    }

    public ApplyIpAccountRequest setMerchantCertImage(String merchantCertImage) {
        this.merchantCertImage = merchantCertImage;
        return this;
    }
    public String getMerchantCertImage() {
        return this.merchantCertImage;
    }

    public ApplyIpAccountRequest setMerchantSignImage(String merchantSignImage) {
        this.merchantSignImage = merchantSignImage;
        return this;
    }
    public String getMerchantSignImage() {
        return this.merchantSignImage;
    }

    public ApplyIpAccountRequest setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public ApplyIpAccountRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public ApplyIpAccountRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public ApplyIpAccountRequest setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
        return this;
    }
    public String getLegalCertType() {
        return this.legalCertType;
    }

    public ApplyIpAccountRequest setAddressInfo(IPAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public IPAddressInfo getAddressInfo() {
        return this.addressInfo;
    }

    public ApplyIpAccountRequest setContactInfo(IPContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IPContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public ApplyIpAccountRequest setSettleRule(IPSettleRule settleRule) {
        this.settleRule = settleRule;
        return this;
    }
    public IPSettleRule getSettleRule() {
        return this.settleRule;
    }

    public ApplyIpAccountRequest setCardInfo(IPCardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }
    public IPCardInfo getCardInfo() {
        return this.cardInfo;
    }

    public ApplyIpAccountRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
