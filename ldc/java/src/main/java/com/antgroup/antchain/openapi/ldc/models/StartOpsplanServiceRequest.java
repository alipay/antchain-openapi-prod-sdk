// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class StartOpsplanServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务发布ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    public static StartOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOpsplanServiceRequest self = new StartOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartOpsplanServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartOpsplanServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public StartOpsplanServiceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
