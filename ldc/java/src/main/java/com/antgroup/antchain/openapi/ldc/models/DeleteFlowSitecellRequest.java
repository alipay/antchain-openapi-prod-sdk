// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteFlowSitecellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 异构机房名
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static DeleteFlowSitecellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowSitecellRequest self = new DeleteFlowSitecellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowSitecellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteFlowSitecellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteFlowSitecellRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public DeleteFlowSitecellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteFlowSitecellRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
