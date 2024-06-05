// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SignDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人签约产品码
    @NameInMap("personal_product_code")
    @Validation(required = true)
    public String personalProductCode;

    // 销售产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
    @NameInMap("return_url")
    @Validation(required = true)
    public String returnUrl;

    // 用户在商户网站的登录账号，用于在签约页面展示
    @NameInMap("external_logon_id")
    @Validation(required = true)
    public String externalLogonId;

    // 支付宝用户ID
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
    @NameInMap("sign_scene")
    @Validation(required = true)
    public String signScene;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 子商户信息
    @NameInMap("sub_merchant")
    public SubMerchantParams subMerchant;

    // 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
    @NameInMap("sign_validity_period")
    public String signValidityPeriod;

    // 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
    @NameInMap("effect_time")
    public Long effectTime;

    public static SignDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        SignDigitalkeyWithholdRequest self = new SignDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public SignDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignDigitalkeyWithholdRequest setPersonalProductCode(String personalProductCode) {
        this.personalProductCode = personalProductCode;
        return this;
    }
    public String getPersonalProductCode() {
        return this.personalProductCode;
    }

    public SignDigitalkeyWithholdRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SignDigitalkeyWithholdRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SignDigitalkeyWithholdRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public SignDigitalkeyWithholdRequest setExternalLogonId(String externalLogonId) {
        this.externalLogonId = externalLogonId;
        return this;
    }
    public String getExternalLogonId() {
        return this.externalLogonId;
    }

    public SignDigitalkeyWithholdRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public SignDigitalkeyWithholdRequest setSignScene(String signScene) {
        this.signScene = signScene;
        return this;
    }
    public String getSignScene() {
        return this.signScene;
    }

    public SignDigitalkeyWithholdRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public SignDigitalkeyWithholdRequest setSubMerchant(SubMerchantParams subMerchant) {
        this.subMerchant = subMerchant;
        return this;
    }
    public SubMerchantParams getSubMerchant() {
        return this.subMerchant;
    }

    public SignDigitalkeyWithholdRequest setSignValidityPeriod(String signValidityPeriod) {
        this.signValidityPeriod = signValidityPeriod;
        return this;
    }
    public String getSignValidityPeriod() {
        return this.signValidityPeriod;
    }

    public SignDigitalkeyWithholdRequest setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public Long getEffectTime() {
        return this.effectTime;
    }

}
