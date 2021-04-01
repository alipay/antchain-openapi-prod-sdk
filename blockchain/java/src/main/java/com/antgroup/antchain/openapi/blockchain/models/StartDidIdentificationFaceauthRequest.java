// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidIdentificationFaceauthRequest extends TeaModel {
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

    public static StartDidIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidIdentificationFaceauthRequest self = new StartDidIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public StartDidIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidIdentificationFaceauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public StartDidIdentificationFaceauthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidIdentificationFaceauthRequest setIdentityParam(IdentityParam identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public IdentityParam getIdentityParam() {
        return this.identityParam;
    }

    public StartDidIdentificationFaceauthRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public StartDidIdentificationFaceauthRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
