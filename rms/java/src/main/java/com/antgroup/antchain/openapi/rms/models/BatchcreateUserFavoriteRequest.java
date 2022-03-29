// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateUserFavoriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 收藏资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 收藏资源ID列表，需要是相同类型下的ID (如果是自定义监控或文件夹，为数值类型，如果是用户应用，是复杂组合字符串)
    @NameInMap("resource_ids")
    @Validation(required = true)
    public java.util.List<String> resourceIds;

    public static BatchcreateUserFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateUserFavoriteRequest self = new BatchcreateUserFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateUserFavoriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateUserFavoriteRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchcreateUserFavoriteRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public BatchcreateUserFavoriteRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
