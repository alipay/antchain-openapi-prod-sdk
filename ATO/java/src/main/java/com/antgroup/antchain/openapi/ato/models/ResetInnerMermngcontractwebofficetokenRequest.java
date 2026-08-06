// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ResetInnerMermngcontractwebofficetokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // trace_id
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 访问token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 刷新token
    @NameInMap("refresh_token")
    @Validation(required = true)
    public String refreshToken;

    public static ResetInnerMermngcontractwebofficetokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetInnerMermngcontractwebofficetokenRequest self = new ResetInnerMermngcontractwebofficetokenRequest();
        return TeaModel.build(map, self);
    }

    public ResetInnerMermngcontractwebofficetokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetInnerMermngcontractwebofficetokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetInnerMermngcontractwebofficetokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResetInnerMermngcontractwebofficetokenRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ResetInnerMermngcontractwebofficetokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ResetInnerMermngcontractwebofficetokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
