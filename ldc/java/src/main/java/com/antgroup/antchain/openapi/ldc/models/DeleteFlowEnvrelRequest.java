// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteFlowEnvrelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标环境
    @NameInMap("dest")
    @Validation(required = true)
    public String dest;

    // 源环境
    @NameInMap("src")
    @Validation(required = true)
    public String src;

    // 关联类型（PROD，GRAY）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static DeleteFlowEnvrelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowEnvrelRequest self = new DeleteFlowEnvrelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowEnvrelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteFlowEnvrelRequest setDest(String dest) {
        this.dest = dest;
        return this;
    }
    public String getDest() {
        return this.dest;
    }

    public DeleteFlowEnvrelRequest setSrc(String src) {
        this.src = src;
        return this;
    }
    public String getSrc() {
        return this.src;
    }

    public DeleteFlowEnvrelRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteFlowEnvrelRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteFlowEnvrelRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
