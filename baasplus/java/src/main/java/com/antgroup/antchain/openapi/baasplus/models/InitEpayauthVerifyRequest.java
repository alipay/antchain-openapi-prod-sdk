// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitEpayauthVerifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待认证银行卡号
    // 
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 人行联行号
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    // 回调通知地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 法人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 企业法人身份证号码
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 手机号码 用于接收打款验证通知短信
    @NameInMap("mobile")
    public String mobile;

    public static InitEpayauthVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEpayauthVerifyRequest self = new InitEpayauthVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitEpayauthVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitEpayauthVerifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitEpayauthVerifyRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public InitEpayauthVerifyRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public InitEpayauthVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitEpayauthVerifyRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public InitEpayauthVerifyRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public InitEpayauthVerifyRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public InitEpayauthVerifyRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public InitEpayauthVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
