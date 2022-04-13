// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFlowSitecellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 异构机房部署单元
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 异构机房地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 异构机房名称
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

    public static CreateFlowSitecellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowSitecellRequest self = new CreateFlowSitecellRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowSitecellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFlowSitecellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowSitecellRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateFlowSitecellRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public CreateFlowSitecellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateFlowSitecellRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
