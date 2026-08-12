// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class UpdateAntcloudAcmProjectStatusRequest extends TeaModel {
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

    // false代表禁用，true代表启用
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    public static UpdateAntcloudAcmProjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntcloudAcmProjectStatusRequest self = new UpdateAntcloudAcmProjectStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntcloudAcmProjectStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntcloudAcmProjectStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateAntcloudAcmProjectStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAntcloudAcmProjectStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
