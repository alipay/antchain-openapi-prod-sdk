// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUserFavoriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 收藏资源 ID 列表
    @NameInMap("resource_ids")
    @Validation(required = true)
    public java.util.List<String> resourceIds;

    // 收藏资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static QueryUserFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserFavoriteRequest self = new QueryUserFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserFavoriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserFavoriteRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public QueryUserFavoriteRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryUserFavoriteRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
