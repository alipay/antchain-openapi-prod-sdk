// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class FaultInjectRuleItemModel extends TeaModel {
    // 规则类型 ABORT/DELAY
    @NameInMap("rule_type")
    public String ruleType;

    // 执行策略 拦截/监控
    @NameInMap("action")
    public ActionModel action;

    // 故障注入配置
    @NameInMap("configs")
    public FaultInjectConfigModel configs;

    // 流量匹配条件
    @NameInMap("traffic_conditions")
    public java.util.List<BaseConditionModel> trafficConditions;

    public static FaultInjectRuleItemModel build(java.util.Map<String, ?> map) throws Exception {
        FaultInjectRuleItemModel self = new FaultInjectRuleItemModel();
        return TeaModel.build(map, self);
    }

    public FaultInjectRuleItemModel setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public FaultInjectRuleItemModel setAction(ActionModel action) {
        this.action = action;
        return this;
    }
    public ActionModel getAction() {
        return this.action;
    }

    public FaultInjectRuleItemModel setConfigs(FaultInjectConfigModel configs) {
        this.configs = configs;
        return this;
    }
    public FaultInjectConfigModel getConfigs() {
        return this.configs;
    }

    public FaultInjectRuleItemModel setTrafficConditions(java.util.List<BaseConditionModel> trafficConditions) {
        this.trafficConditions = trafficConditions;
        return this;
    }
    public java.util.List<BaseConditionModel> getTrafficConditions() {
        return this.trafficConditions;
    }

}
