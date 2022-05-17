// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppportraitAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 待查询的应用名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // TenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // TenantName
    @NameInMap("tenant_name")
    public String tenantName;

    public static GetAppportraitAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppportraitAppRequest self = new GetAppportraitAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAppportraitAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAppportraitAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAppportraitAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAppportraitAppRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
