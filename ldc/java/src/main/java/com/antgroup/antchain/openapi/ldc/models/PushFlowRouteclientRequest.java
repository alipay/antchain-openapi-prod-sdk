// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PushFlowRouteclientRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 流量类型
    // NORMAL：正常流量
    // PRESS：压测流量
    @NameInMap("flow_type")
    @Validation(required = true)
    public String flowType;

    // 异构机房列表
    @NameInMap("isomerism_sites")
    public java.util.List<String> isomerismSites;

    // 操作人
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 推送类型
    // DRM：DRM推送
    // JMX：JMX推送
    // SPANNER：SPANNER推送
    @NameInMap("push_type")
    @Validation(required = true)
    public String pushType;

    // 工作空间
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 部署单元组的流量规则
    @NameInMap("unit_flows")
    @Validation(required = true)
    public java.util.List<UnitFlow> unitFlows;

    public static PushFlowRouteclientRequest build(java.util.Map<String, ?> map) throws Exception {
        PushFlowRouteclientRequest self = new PushFlowRouteclientRequest();
        return TeaModel.build(map, self);
    }

    public PushFlowRouteclientRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushFlowRouteclientRequest setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public PushFlowRouteclientRequest setIsomerismSites(java.util.List<String> isomerismSites) {
        this.isomerismSites = isomerismSites;
        return this;
    }
    public java.util.List<String> getIsomerismSites() {
        return this.isomerismSites;
    }

    public PushFlowRouteclientRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public PushFlowRouteclientRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public PushFlowRouteclientRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public PushFlowRouteclientRequest setUnitFlows(java.util.List<UnitFlow> unitFlows) {
        this.unitFlows = unitFlows;
        return this;
    }
    public java.util.List<UnitFlow> getUnitFlows() {
        return this.unitFlows;
    }

}
