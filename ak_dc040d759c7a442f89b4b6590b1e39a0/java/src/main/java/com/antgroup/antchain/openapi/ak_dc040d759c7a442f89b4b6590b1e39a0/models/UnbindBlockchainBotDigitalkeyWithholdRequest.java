// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class UnbindBlockchainBotDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
    @NameInMap("personal_product_code")
    @Validation(required = true)
    public String personalProductCode;

    // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
    @NameInMap("sign_scene")
    @Validation(required = true)
    public String signScene;

    // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    public static UnbindBlockchainBotDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindBlockchainBotDigitalkeyWithholdRequest self = new UnbindBlockchainBotDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setPersonalProductCode(String personalProductCode) {
        this.personalProductCode = personalProductCode;
        return this;
    }
    public String getPersonalProductCode() {
        return this.personalProductCode;
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setSignScene(String signScene) {
        this.signScene = signScene;
        return this;
    }
    public String getSignScene() {
        return this.signScene;
    }

    public UnbindBlockchainBotDigitalkeyWithholdRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

}
