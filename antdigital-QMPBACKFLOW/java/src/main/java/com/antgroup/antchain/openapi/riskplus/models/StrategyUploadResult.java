// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StrategyUploadResult extends TeaModel {
    // 元数据id
    @NameInMap("rule_meta_id")
    public Long ruleMetaId;

    // 场景id
    @NameInMap("scene_id")
    public Long sceneId;

    // 租户场景id
    @NameInMap("tenant_scene_id")
    public Long tenantSceneId;

    // 圈客规则id
    @NameInMap("decision_rule_id")
    public Long decisionRuleId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    public Long sceneStrategyId;

    public static StrategyUploadResult build(java.util.Map<String, ?> map) throws Exception {
        StrategyUploadResult self = new StrategyUploadResult();
        return TeaModel.build(map, self);
    }

    public StrategyUploadResult setRuleMetaId(Long ruleMetaId) {
        this.ruleMetaId = ruleMetaId;
        return this;
    }
    public Long getRuleMetaId() {
        return this.ruleMetaId;
    }

    public StrategyUploadResult setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public StrategyUploadResult setTenantSceneId(Long tenantSceneId) {
        this.tenantSceneId = tenantSceneId;
        return this;
    }
    public Long getTenantSceneId() {
        return this.tenantSceneId;
    }

    public StrategyUploadResult setDecisionRuleId(Long decisionRuleId) {
        this.decisionRuleId = decisionRuleId;
        return this;
    }
    public Long getDecisionRuleId() {
        return this.decisionRuleId;
    }

    public StrategyUploadResult setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

}
