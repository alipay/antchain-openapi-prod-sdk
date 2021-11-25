// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateOauthUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 登录渠道(web,h5)
    @NameInMap("login_channel")
    @Validation(required = true)
    public String loginChannel;

    // 客户端口令
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateOauthUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOauthUrlRequest self = new CreateOauthUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateOauthUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOauthUrlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOauthUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOauthUrlRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateOauthUrlRequest setLoginChannel(String loginChannel) {
        this.loginChannel = loginChannel;
        return this;
    }
    public String getLoginChannel() {
        return this.loginChannel;
    }

    public CreateOauthUrlRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
