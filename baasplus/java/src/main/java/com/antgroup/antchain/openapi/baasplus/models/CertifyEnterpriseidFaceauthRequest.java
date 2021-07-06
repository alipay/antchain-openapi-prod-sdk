// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CertifyEnterpriseidFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 回调通知地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证完成后回跳地址
    // 
    @NameInMap("redirect_url")
    public String redirectUrl;

    public static CertifyEnterpriseidFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyEnterpriseidFaceauthRequest self = new CertifyEnterpriseidFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public CertifyEnterpriseidFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyEnterpriseidFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyEnterpriseidFaceauthRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CertifyEnterpriseidFaceauthRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyEnterpriseidFaceauthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

}
