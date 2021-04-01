// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitIdentificationFaceauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证类型,枚举值
    // PC_AUTH、APP_AUTH
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    //    用户身份信息
    @NameInMap("identity_param")
    @Validation(required = true)
    public IdentityParam identityParam;

    // 认证接口回调路径，POST接口
    // 请求示例：
    // {
    //   "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c",
    //   "status":3,
    // }
    @NameInMap("return_url")
    public String returnUrl;

    public static InitIdentificationFaceauthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIdentificationFaceauthRequest self = new InitIdentificationFaceauthRequest();
        return TeaModel.build(map, self);
    }

    public InitIdentificationFaceauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIdentificationFaceauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIdentificationFaceauthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public InitIdentificationFaceauthRequest setIdentityParam(IdentityParam identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public IdentityParam getIdentityParam() {
        return this.identityParam;
    }

    public InitIdentificationFaceauthRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
