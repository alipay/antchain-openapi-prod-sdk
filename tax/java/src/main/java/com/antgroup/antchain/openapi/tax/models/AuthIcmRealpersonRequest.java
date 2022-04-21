// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthIcmRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础授权请求
    @NameInMap("request")
    @Validation(required = true)
    public BaseAuthRequest request;

    // 个人证件号
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 名字
    @NameInMap("identity_name")
    @Validation(required = true)
    public String identityName;

    public static AuthIcmRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthIcmRealpersonRequest self = new AuthIcmRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public AuthIcmRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthIcmRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthIcmRealpersonRequest setRequest(BaseAuthRequest request) {
        this.request = request;
        return this;
    }
    public BaseAuthRequest getRequest() {
        return this.request;
    }

    public AuthIcmRealpersonRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public AuthIcmRealpersonRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

}
