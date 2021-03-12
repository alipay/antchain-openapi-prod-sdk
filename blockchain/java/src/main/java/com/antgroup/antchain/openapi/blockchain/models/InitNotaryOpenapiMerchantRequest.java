// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitNotaryOpenapiMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证来源，PC_AUTH或APP_AUTH
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 认证成功页面回跳地址（只在移动端跳转，PC暂不支持）
    @NameInMap("callback_url")
    public String callbackUrl;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业统一社会信用代码
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 企业证件类型，目前只支持企业营业执照类型，值为NATIONAL_LEGAL_MERGE
    @NameInMap("ep_cert_type")
    @Validation(required = true)
    public String epCertType;

    // 认证类型，目前只支持企业认证信息，值为EP_CERT_INFO
    @NameInMap("identity_type")
    @Validation(required = true)
    public String identityType;

    // 法人姓名
    @NameInMap("legal_person_cert_name")
    @Validation(required = true)
    public String legalPersonCertName;

    // 法人身份证号
    @NameInMap("legal_person_cert_no")
    @Validation(required = true)
    public String legalPersonCertNo;

    // 法人认证证件类型，目前只支持身份证，值为IDENTITY_CARD
    @NameInMap("legal_person_cert_type")
    @Validation(required = true)
    public String legalPersonCertType;

    // 认证成功回调地址
    @NameInMap("return_url")
    public String returnUrl;

    // 商户请求的唯一标志，商户要保证其唯一性。值为32位长度的字母数字下划线组合
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    public static InitNotaryOpenapiMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        InitNotaryOpenapiMerchantRequest self = new InitNotaryOpenapiMerchantRequest();
        return TeaModel.build(map, self);
    }

    public InitNotaryOpenapiMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitNotaryOpenapiMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitNotaryOpenapiMerchantRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public InitNotaryOpenapiMerchantRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitNotaryOpenapiMerchantRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public InitNotaryOpenapiMerchantRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public InitNotaryOpenapiMerchantRequest setEpCertType(String epCertType) {
        this.epCertType = epCertType;
        return this;
    }
    public String getEpCertType() {
        return this.epCertType;
    }

    public InitNotaryOpenapiMerchantRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public InitNotaryOpenapiMerchantRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public InitNotaryOpenapiMerchantRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public InitNotaryOpenapiMerchantRequest setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public InitNotaryOpenapiMerchantRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitNotaryOpenapiMerchantRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
