// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateAntcloudAcmTenantProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作者用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 项目描述
    @NameInMap("description")
    public String description;

    public static CreateAntcloudAcmTenantProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntcloudAcmTenantProjectRequest self = new CreateAntcloudAcmTenantProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntcloudAcmTenantProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntcloudAcmTenantProjectRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAntcloudAcmTenantProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateAntcloudAcmTenantProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
