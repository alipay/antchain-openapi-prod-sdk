// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 权限码
    @NameInMap("auth")
    @Validation(required = true)
    public String auth;

    // 用户名列表
    @NameInMap("user_names")
    @Validation(required = true)
    public java.util.List<String> userNames;

    // 权限的资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 权限对应的资源ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    public static CreateAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthRequest self = new CreateAuthRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateAuthRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public CreateAuthRequest setUserNames(java.util.List<String> userNames) {
        this.userNames = userNames;
        return this;
    }
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

    public CreateAuthRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateAuthRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
