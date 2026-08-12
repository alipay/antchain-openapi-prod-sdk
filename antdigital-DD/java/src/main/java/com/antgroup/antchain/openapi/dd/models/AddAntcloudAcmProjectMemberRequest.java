// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class AddAntcloudAcmProjectMemberRequest extends TeaModel {
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

    // 成员用户ID列表
    @NameInMap("users")
    @Validation(required = true)
    public java.util.List<String> users;

    public static AddAntcloudAcmProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntcloudAcmProjectMemberRequest self = new AddAntcloudAcmProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddAntcloudAcmProjectMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAntcloudAcmProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddAntcloudAcmProjectMemberRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddAntcloudAcmProjectMemberRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
