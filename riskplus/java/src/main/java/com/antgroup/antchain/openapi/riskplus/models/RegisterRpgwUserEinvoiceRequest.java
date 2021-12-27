// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RegisterRpgwUserEinvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业标识，固定值
    @NameInMap("company_code")
    @Validation(required = true)
    public String companyCode;

    // 调用方平台用户id
    @NameInMap("platform_user_identification")
    @Validation(required = true)
    public String platformUserIdentification;

    // 身份证号码
    @NameInMap("identification_number")
    @Validation(required = true)
    public String identificationNumber;

    // 用户手机号
    @NameInMap("mobile_phone")
    @Validation(required = true)
    public String mobilePhone;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 身份证照片人像面照片url
    @NameInMap("identity_front_pic")
    @Validation(required = true)
    public String identityFrontPic;

    // 身份证照片国徽面url
    @NameInMap("identity_back_pic")
    @Validation(required = true)
    public String identityBackPic;

    // 身份证有效期开始时间，格式yyyy-MM-dd
    @NameInMap("idcard_validity_start")
    @Validation(required = true)
    public String idcardValidityStart;

    // 身份证有效期结束时间，格式yyyy-MM-dd
    @NameInMap("idcard_validity_end")
    @Validation(required = true)
    public String idcardValidityEnd;

    // 实名认证时间，格式yyyy-MM-dd HH:mm:ss
    @NameInMap("identity_time")
    @Validation(required = true)
    public String identityTime;

    // 注册模式，固定值
    @NameInMap("register_mode")
    @Validation(required = true)
    public String registerMode;

    // 注册时间，格式yyyy-MM-dd HH:mm:ss
    @NameInMap("register_time")
    @Validation(required = true)
    public String registerTime;

    // 用户人脸照片url
    @NameInMap("face_pic")
    public String facePic;

    // 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
    @NameInMap("alipay_account")
    public String alipayAccount;

    // 微信支付个人账户（openid）
    @NameInMap("wxpay_account")
    public String wxpayAccount;

    // 银行卡号，标准一类或二类卡格式，持卡人为本用户
    @NameInMap("bankcard_no")
    public String bankcardNo;

    // 开户行名称
    @NameInMap("bank_name")
    public String bankName;

    // 开户行归属地省市
    @NameInMap("bankcard_city")
    public String bankcardCity;

    // 用户所在省市
    @NameInMap("city")
    public String city;

    // 拓展信息
    @NameInMap("ext_json")
    public String extJson;

    public static RegisterRpgwUserEinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterRpgwUserEinvoiceRequest self = new RegisterRpgwUserEinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterRpgwUserEinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterRpgwUserEinvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterRpgwUserEinvoiceRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public RegisterRpgwUserEinvoiceRequest setPlatformUserIdentification(String platformUserIdentification) {
        this.platformUserIdentification = platformUserIdentification;
        return this;
    }
    public String getPlatformUserIdentification() {
        return this.platformUserIdentification;
    }

    public RegisterRpgwUserEinvoiceRequest setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
        return this;
    }
    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public RegisterRpgwUserEinvoiceRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public RegisterRpgwUserEinvoiceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public RegisterRpgwUserEinvoiceRequest setIdentityFrontPic(String identityFrontPic) {
        this.identityFrontPic = identityFrontPic;
        return this;
    }
    public String getIdentityFrontPic() {
        return this.identityFrontPic;
    }

    public RegisterRpgwUserEinvoiceRequest setIdentityBackPic(String identityBackPic) {
        this.identityBackPic = identityBackPic;
        return this;
    }
    public String getIdentityBackPic() {
        return this.identityBackPic;
    }

    public RegisterRpgwUserEinvoiceRequest setIdcardValidityStart(String idcardValidityStart) {
        this.idcardValidityStart = idcardValidityStart;
        return this;
    }
    public String getIdcardValidityStart() {
        return this.idcardValidityStart;
    }

    public RegisterRpgwUserEinvoiceRequest setIdcardValidityEnd(String idcardValidityEnd) {
        this.idcardValidityEnd = idcardValidityEnd;
        return this;
    }
    public String getIdcardValidityEnd() {
        return this.idcardValidityEnd;
    }

    public RegisterRpgwUserEinvoiceRequest setIdentityTime(String identityTime) {
        this.identityTime = identityTime;
        return this;
    }
    public String getIdentityTime() {
        return this.identityTime;
    }

    public RegisterRpgwUserEinvoiceRequest setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
        return this;
    }
    public String getRegisterMode() {
        return this.registerMode;
    }

    public RegisterRpgwUserEinvoiceRequest setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public String getRegisterTime() {
        return this.registerTime;
    }

    public RegisterRpgwUserEinvoiceRequest setFacePic(String facePic) {
        this.facePic = facePic;
        return this;
    }
    public String getFacePic() {
        return this.facePic;
    }

    public RegisterRpgwUserEinvoiceRequest setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
        return this;
    }
    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public RegisterRpgwUserEinvoiceRequest setWxpayAccount(String wxpayAccount) {
        this.wxpayAccount = wxpayAccount;
        return this;
    }
    public String getWxpayAccount() {
        return this.wxpayAccount;
    }

    public RegisterRpgwUserEinvoiceRequest setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
        return this;
    }
    public String getBankcardNo() {
        return this.bankcardNo;
    }

    public RegisterRpgwUserEinvoiceRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public RegisterRpgwUserEinvoiceRequest setBankcardCity(String bankcardCity) {
        this.bankcardCity = bankcardCity;
        return this;
    }
    public String getBankcardCity() {
        return this.bankcardCity;
    }

    public RegisterRpgwUserEinvoiceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public RegisterRpgwUserEinvoiceRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
