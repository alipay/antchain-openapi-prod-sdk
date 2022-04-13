// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddAntvipDomainRequest extends TeaModel {
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

    // 要添加的部署单元名称列表
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<String> cells;

    // 健康检查类型，默认为TCP
    @NameInMap("health_check_type")
    public String healthCheckType;

    // 健康检查端口，非必填项
    @NameInMap("health_check_default_port")
    public Long healthCheckDefaultPort;

    public static AddAntvipDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntvipDomainRequest self = new AddAntvipDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddAntvipDomainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAntvipDomainRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public AddAntvipDomainRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public AddAntvipDomainRequest setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

    public AddAntvipDomainRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public AddAntvipDomainRequest setHealthCheckDefaultPort(Long healthCheckDefaultPort) {
        this.healthCheckDefaultPort = healthCheckDefaultPort;
        return this;
    }
    public Long getHealthCheckDefaultPort() {
        return this.healthCheckDefaultPort;
    }

}
