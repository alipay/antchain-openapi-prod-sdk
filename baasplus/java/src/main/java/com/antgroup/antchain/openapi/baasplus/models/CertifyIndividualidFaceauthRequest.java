// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CertifyIndividualidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回调通知地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证的唯一性id
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 认证完成后回跳地址
    // 
    @NameInMap("redirect_url")
    public String redirectUrl;

    public static CertifyIndividualidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyIndividualidFaceauthRequest self = new CertifyIndividualidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public CertifyIndividualidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyIndividualidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyIndividualidFaceauthRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyIndividualidFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public CertifyIndividualidFaceauthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

}
