// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultToleranceRuleItemModel extends TeaModel {
    // 是否启用(0-未启用1-启用2-部分启用)
    @NameInMap("enabled")
    public String enabled;

    // 暂时不用
    @NameInMap("scopes")
    public java.util.List<String> scopes;

    //  流量管控规则
    @NameInMap("conditions")
    public java.util.List<BaseConditionModel> conditions;

    // 具体隔离规则配置
    @NameInMap("configs")
    public FaultToleranceConfigs configs;

    // 行为项(type取值DOWNGRADE隔离/NONE监控)
    @NameInMap("actions")
    public java.util.List<BaseActionModel> actions;

    public static FaultToleranceRuleItemModel build(java.util.Map<String, ?> map) throws Exception {
        FaultToleranceRuleItemModel self = new FaultToleranceRuleItemModel();
        return TeaModel.build(map, self);
    }

    public FaultToleranceRuleItemModel setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public FaultToleranceRuleItemModel setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    public FaultToleranceRuleItemModel setConditions(java.util.List<BaseConditionModel> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<BaseConditionModel> getConditions() {
        return this.conditions;
    }

    public FaultToleranceRuleItemModel setConfigs(FaultToleranceConfigs configs) {
        this.configs = configs;
        return this;
    }
    public FaultToleranceConfigs getConfigs() {
        return this.configs;
    }

    public FaultToleranceRuleItemModel setActions(java.util.List<BaseActionModel> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<BaseActionModel> getActions() {
        return this.actions;
    }

}
