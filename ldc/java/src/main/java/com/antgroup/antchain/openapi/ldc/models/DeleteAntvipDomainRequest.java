// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteAntvipDomainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用名称
    @NameInMap("application")
    @Validation(required = true)
    public String application;

    // 部署单元cell名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    public static DeleteAntvipDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntvipDomainRequest self = new DeleteAntvipDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntvipDomainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAntvipDomainRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteAntvipDomainRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public DeleteAntvipDomainRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

}
