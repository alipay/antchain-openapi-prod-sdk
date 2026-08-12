// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudAcmProjectUserRequest extends TeaModel {
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

    // 用户名称（模糊搜索）
    @NameInMap("user_name")
    public String userName;

    public static QueryAntcloudAcmProjectUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAcmProjectUserRequest self = new QueryAntcloudAcmProjectUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAcmProjectUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudAcmProjectUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntcloudAcmProjectUserRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryAntcloudAcmProjectUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
