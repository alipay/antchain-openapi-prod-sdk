// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListAuthRequest extends TeaModel {
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

    // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源ID列表
    @NameInMap("resource_ids")
    @Validation(required = true)
    public java.util.List<String> resourceIds;

    public static ListAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRequest self = new ListAuthRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAuthRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListAuthRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public ListAuthRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAuthRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
