// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RefreshInnerTemplatetokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // accessToken
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // refreshToekn
    @NameInMap("refresh_token")
    @Validation(required = true)
    public String refreshToken;

    public static RefreshInnerTemplatetokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshInnerTemplatetokenRequest self = new RefreshInnerTemplatetokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshInnerTemplatetokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefreshInnerTemplatetokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefreshInnerTemplatetokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RefreshInnerTemplatetokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshInnerTemplatetokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
