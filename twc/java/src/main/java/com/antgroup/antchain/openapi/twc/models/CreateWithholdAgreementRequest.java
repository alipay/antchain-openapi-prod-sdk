// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateWithholdAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信总金额，单位元
    @NameInMap("credit_amount")
    @Validation(required = true)
    public String creditAmount;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 对服务产品的描述
    @NameInMap("merchant_service_description")
    public String merchantServiceDescription;

    // 商户的服务名称，滴滴出行免密支付
    @NameInMap("merchant_service_name")
    @Validation(required = true)
    public String merchantServiceName;

    // 姓名和身份证号拼接sha256的hash
    @NameInMap("name_cert_hash")
    @Validation(required = true)
    public String nameCertHash;

    // 还款计划的链接
    @NameInMap("repayment_url")
    @Validation(required = true)
    public String repaymentUrl;

    // 签约成功后回调的地址
    @NameInMap("return_url")
    public String returnUrl;

    // 第三方用户id
    @NameInMap("third_party_id")
    @Validation(required = true)
    public String thirdPartyId;

    public static CreateWithholdAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdAgreementRequest self = new CreateWithholdAgreementRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWithholdAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWithholdAgreementRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public CreateWithholdAgreementRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public CreateWithholdAgreementRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateWithholdAgreementRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateWithholdAgreementRequest setMerchantServiceDescription(String merchantServiceDescription) {
        this.merchantServiceDescription = merchantServiceDescription;
        return this;
    }
    public String getMerchantServiceDescription() {
        return this.merchantServiceDescription;
    }

    public CreateWithholdAgreementRequest setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public CreateWithholdAgreementRequest setNameCertHash(String nameCertHash) {
        this.nameCertHash = nameCertHash;
        return this;
    }
    public String getNameCertHash() {
        return this.nameCertHash;
    }

    public CreateWithholdAgreementRequest setRepaymentUrl(String repaymentUrl) {
        this.repaymentUrl = repaymentUrl;
        return this;
    }
    public String getRepaymentUrl() {
        return this.repaymentUrl;
    }

    public CreateWithholdAgreementRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateWithholdAgreementRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
