// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchdeleteUserFavoriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 资源类型
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 已收藏资源ID列表（文件夹，传入文件夹ID；自定义监控，传入自定义监控ID；应用，传入universal_table_id）
    @NameInMap("resource_ids")
    @Validation(required = true)
    public java.util.List<String> resourceIds;

    public static BatchdeleteUserFavoriteRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteUserFavoriteRequest self = new BatchdeleteUserFavoriteRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteUserFavoriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteUserFavoriteRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchdeleteUserFavoriteRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public BatchdeleteUserFavoriteRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}
