// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidIdentificationFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证类型,枚举值 PC_AUTH、APP_AUTH
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 颁发证书的subject did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 用户身份信息
    @NameInMap("identity_param")
    @Validation(required = true)
    public IdentityParam identityParam;

    // 认证接口回调路径，POST接口 请求示例： { "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c", "did":"xxxxx","vcId":"xxxxx" }
    @NameInMap("return_url")
    public String returnUrl;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 认证ID
    @NameInMap("certify_id")
    public String certifyId;

    // 二维码URL，用户支付宝扫一扫实人认证
    @NameInMap("certify_url")
    public String certifyUrl;

    public static StartBaasDidIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidIdentificationFaceauthRequest self = new StartBaasDidIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasDidIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasDidIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasDidIdentificationFaceauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public StartBaasDidIdentificationFaceauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartBaasDidIdentificationFaceauthRequest setIdentityParam(IdentityParam identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public IdentityParam getIdentityParam() {
        return this.identityParam;
    }

    public StartBaasDidIdentificationFaceauthRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public StartBaasDidIdentificationFaceauthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartBaasDidIdentificationFaceauthRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public StartBaasDidIdentificationFaceauthRequest setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

}
