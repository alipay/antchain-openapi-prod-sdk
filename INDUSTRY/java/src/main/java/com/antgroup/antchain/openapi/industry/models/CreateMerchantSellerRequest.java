// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class CreateMerchantSellerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // source, 由中台为业务方分配, 作为业务来源标识
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
    @NameInMap("merchant_user_id")
    public String merchantUserId;

    // 商户登录账号, 跟merchant_user_id不能同时为空
    @NameInMap("merchant_login_name")
    public String merchantLoginName;

    // 商户别名, 会展示在账单以及支付结果页中
    @NameInMap("merchant_alias_name")
    @Validation(required = true)
    public String merchantAliasName;

    // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
    @NameInMap("mcc")
    public String mcc;

    // 法人姓名，merchant_type = 01时必填
    @NameInMap("legal_name")
    public String legalName;

    // 商户法人身份证号码, merchant_type = 01时必填
    @NameInMap("legal_cert_no")
    public String legalCertNo;

    // 商户经营地址
    @NameInMap("business_address")
    @Validation(required = true)
    public AddressInfo businessAddress;

    // 商户联系人信息
    @NameInMap("contact_infos")
    @Validation(required = true)
    public java.util.List<ContactInfo> contactInfos;

    // 商户使用服务 当面付、app支付、wap支付、电脑支付
    @NameInMap("service")
    @Validation(required = true)
    public java.util.List<String> service;

    // 默认结算规则
    @NameInMap("default_settle_rule")
    @Validation(required = true)
    public SettleRule defaultSettleRule;

    // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
    @NameInMap("biz_cards")
    public CardInfo bizCards;

    // 请求单据号，32位。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static CreateMerchantSellerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantSellerRequest self = new CreateMerchantSellerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMerchantSellerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMerchantSellerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateMerchantSellerRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public CreateMerchantSellerRequest setMerchantLoginName(String merchantLoginName) {
        this.merchantLoginName = merchantLoginName;
        return this;
    }
    public String getMerchantLoginName() {
        return this.merchantLoginName;
    }

    public CreateMerchantSellerRequest setMerchantAliasName(String merchantAliasName) {
        this.merchantAliasName = merchantAliasName;
        return this;
    }
    public String getMerchantAliasName() {
        return this.merchantAliasName;
    }

    public CreateMerchantSellerRequest setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public CreateMerchantSellerRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CreateMerchantSellerRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public CreateMerchantSellerRequest setBusinessAddress(AddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }
    public AddressInfo getBusinessAddress() {
        return this.businessAddress;
    }

    public CreateMerchantSellerRequest setContactInfos(java.util.List<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
        return this;
    }
    public java.util.List<ContactInfo> getContactInfos() {
        return this.contactInfos;
    }

    public CreateMerchantSellerRequest setService(java.util.List<String> service) {
        this.service = service;
        return this;
    }
    public java.util.List<String> getService() {
        return this.service;
    }

    public CreateMerchantSellerRequest setDefaultSettleRule(SettleRule defaultSettleRule) {
        this.defaultSettleRule = defaultSettleRule;
        return this;
    }
    public SettleRule getDefaultSettleRule() {
        return this.defaultSettleRule;
    }

    public CreateMerchantSellerRequest setBizCards(CardInfo bizCards) {
        this.bizCards = bizCards;
        return this;
    }
    public CardInfo getBizCards() {
        return this.bizCards;
    }

    public CreateMerchantSellerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
