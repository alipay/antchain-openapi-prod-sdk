// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateIdentificationRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证人的姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 被验证者的身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 授权码，针对某些特定场景使用，非必填
    @NameInMap("auth_code")
    public String authCode;

    // 认证流程结束回调通知地址，非必传
    @NameInMap("callback_url")
    public String callbackUrl;

    // 认证结束后跳转地址，非必填
    @NameInMap("return_url")
    public String returnUrl;

    public static CreateIdentificationRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentificationRealpersonRequest self = new CreateIdentificationRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentificationRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIdentificationRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIdentificationRealpersonRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateIdentificationRealpersonRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateIdentificationRealpersonRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CreateIdentificationRealpersonRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateIdentificationRealpersonRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
