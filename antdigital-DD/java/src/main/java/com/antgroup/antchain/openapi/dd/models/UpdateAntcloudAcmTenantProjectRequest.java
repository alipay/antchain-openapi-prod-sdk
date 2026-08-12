// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class UpdateAntcloudAcmTenantProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作者用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 项目描述
    @NameInMap("description")
    public String description;

    public static UpdateAntcloudAcmTenantProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntcloudAcmTenantProjectRequest self = new UpdateAntcloudAcmTenantProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntcloudAcmTenantProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntcloudAcmTenantProjectRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateAntcloudAcmTenantProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAntcloudAcmTenantProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateAntcloudAcmTenantProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
