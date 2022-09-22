// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecFlowDisasterswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容灾切换类型，枚举型，CUTOFF（切流），RECOVER（恢复）
    @NameInMap("disaster_type")
    @Validation(required = true)
    public String disasterType;

    // 容灾切换范围，枚举型，GROUP（单元组）、ZONE（单元）、IDC（机房，暂不支持）
    @NameInMap("disaster_scope")
    @Validation(required = true)
    public String disasterScope;

    // 同城或者异地容灾，true代表异地容灾，false代表同城容灾
    @NameInMap("remote")
    @Validation(required = true)
    public Boolean remote;

    // 容灾切换对象列表
    @NameInMap("targets")
    @Validation(required = true)
    public java.util.List<String> targets;

    // 操作者，选填，应填登录名
    @NameInMap("operator")
    public String operator;

    public static ExecFlowDisasterswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecFlowDisasterswitchRequest self = new ExecFlowDisasterswitchRequest();
        return TeaModel.build(map, self);
    }

    public ExecFlowDisasterswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecFlowDisasterswitchRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ExecFlowDisasterswitchRequest setDisasterType(String disasterType) {
        this.disasterType = disasterType;
        return this;
    }
    public String getDisasterType() {
        return this.disasterType;
    }

    public ExecFlowDisasterswitchRequest setDisasterScope(String disasterScope) {
        this.disasterScope = disasterScope;
        return this;
    }
    public String getDisasterScope() {
        return this.disasterScope;
    }

    public ExecFlowDisasterswitchRequest setRemote(Boolean remote) {
        this.remote = remote;
        return this;
    }
    public Boolean getRemote() {
        return this.remote;
    }

    public ExecFlowDisasterswitchRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public ExecFlowDisasterswitchRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
