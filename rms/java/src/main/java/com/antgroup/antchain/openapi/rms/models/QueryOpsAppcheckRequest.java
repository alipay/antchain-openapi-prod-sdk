// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryOpsAppcheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 应用名称
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 0：异常 1：正常
    @NameInMap("status")
    public Long status;

    public static QueryOpsAppcheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsAppcheckRequest self = new QueryOpsAppcheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsAppcheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsAppcheckRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryOpsAppcheckRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryOpsAppcheckRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
