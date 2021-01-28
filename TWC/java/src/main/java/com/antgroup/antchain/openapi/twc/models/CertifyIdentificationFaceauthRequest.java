// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CertifyIdentificationFaceauthRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证流程ID
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 认证流程结束回调通知地址，非必传
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证结束后跳转地址，非必填
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 授权码，针对某些特定场景使用，非必填
    @NameInMap("auth_code")
    public String authCode;

    public static CertifyIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyIdentificationFaceauthRequest self = new CertifyIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public CertifyIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyIdentificationFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CertifyIdentificationFaceauthRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyIdentificationFaceauthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public CertifyIdentificationFaceauthRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
