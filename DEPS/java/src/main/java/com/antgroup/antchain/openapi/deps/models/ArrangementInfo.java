// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ArrangementInfo extends TeaModel {
    // 类型
    @NameInMap("arrangement_type")
    public String arrangementType;

    // 环境变量
    @NameInMap("env_config")
    public java.util.List<Pair> envConfig;

    // 发布概览名称
    @NameInMap("name")
    public String name;

    // 发布进程ID
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // 环境 ID
    @NameInMap("workspace_id")
    public String workspaceId;

    // 策略
    @NameInMap("ops_action_policies")
    public java.util.List<OpsActionPolicy> opsActionPolicies;

    public static ArrangementInfo build(java.util.Map<String, ?> map) throws Exception {
        ArrangementInfo self = new ArrangementInfo();
        return TeaModel.build(map, self);
    }

    public ArrangementInfo setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
        return this;
    }
    public String getArrangementType() {
        return this.arrangementType;
    }

    public ArrangementInfo setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public ArrangementInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ArrangementInfo setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public ArrangementInfo setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ArrangementInfo setOpsActionPolicies(java.util.List<OpsActionPolicy> opsActionPolicies) {
        this.opsActionPolicies = opsActionPolicies;
        return this;
    }
    public java.util.List<OpsActionPolicy> getOpsActionPolicies() {
        return this.opsActionPolicies;
    }

}
