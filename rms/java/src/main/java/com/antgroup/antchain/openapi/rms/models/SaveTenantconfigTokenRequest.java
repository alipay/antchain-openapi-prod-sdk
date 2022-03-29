// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SaveTenantconfigTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // configKey对应值
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // token值
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static SaveTenantconfigTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTenantconfigTokenRequest self = new SaveTenantconfigTokenRequest();
        return TeaModel.build(map, self);
    }

    public SaveTenantconfigTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveTenantconfigTokenRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public SaveTenantconfigTokenRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public SaveTenantconfigTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
