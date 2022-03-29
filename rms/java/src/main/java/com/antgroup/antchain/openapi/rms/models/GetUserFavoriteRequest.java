// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetUserFavoriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 收藏资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    //  收藏资源 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static GetUserFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserFavoriteRequest self = new GetUserFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public GetUserFavoriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUserFavoriteRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetUserFavoriteRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetUserFavoriteRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
