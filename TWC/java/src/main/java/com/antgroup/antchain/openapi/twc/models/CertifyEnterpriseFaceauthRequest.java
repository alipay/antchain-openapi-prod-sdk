// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CertifyEnterpriseFaceauthRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务唯一性标识
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 回调通知地址
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证完成后回跳地址
    @NameInMap("redirect_url")
    public String redirectUrl;

    public static CertifyEnterpriseFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyEnterpriseFaceauthRequest self = new CertifyEnterpriseFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public CertifyEnterpriseFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyEnterpriseFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyEnterpriseFaceauthRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CertifyEnterpriseFaceauthRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CertifyEnterpriseFaceauthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

}
