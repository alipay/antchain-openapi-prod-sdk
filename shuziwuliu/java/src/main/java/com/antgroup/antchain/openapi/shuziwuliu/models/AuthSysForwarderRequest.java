// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class AuthSysForwarderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户端id
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 密钥
    @NameInMap("client_secret")
    @Validation(required = true)
    public String clientSecret;

    // 货代did
    @NameInMap("int_ref_id")
    @Validation(required = true)
    public String intRefId;

    // For HOME application internal
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 渠道source
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static AuthSysForwarderRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthSysForwarderRequest self = new AuthSysForwarderRequest();
        return TeaModel.build(map, self);
    }

    public AuthSysForwarderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthSysForwarderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthSysForwarderRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AuthSysForwarderRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public AuthSysForwarderRequest setIntRefId(String intRefId) {
        this.intRefId = intRefId;
        return this;
    }
    public String getIntRefId() {
        return this.intRefId;
    }

    public AuthSysForwarderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AuthSysForwarderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
