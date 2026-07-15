// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ExecLoginAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序本次取得的一次性授权码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 用户是否已签署隐私协议
    @NameInMap("privacy_agreement_signed")
    @Validation(required = true)
    public Boolean privacyAgreementSigned;

    public static ExecLoginAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLoginAppRequest self = new ExecLoginAppRequest();
        return TeaModel.build(map, self);
    }

    public ExecLoginAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecLoginAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecLoginAppRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public ExecLoginAppRequest setPrivacyAgreementSigned(Boolean privacyAgreementSigned) {
        this.privacyAgreementSigned = privacyAgreementSigned;
        return this;
    }
    public Boolean getPrivacyAgreementSigned() {
        return this.privacyAgreementSigned;
    }

}
