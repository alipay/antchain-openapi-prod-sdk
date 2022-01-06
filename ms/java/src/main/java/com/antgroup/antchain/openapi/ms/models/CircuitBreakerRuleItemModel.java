// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CircuitBreakerRuleItemModel extends TeaModel {
    // 熔断规则类型(取值avgRt，errorRatio)
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 熔断配置，和ruleType的值有关,
    // "ruleType": "avgRt",
    // "configs": {
    //                         "averageRtThreshold": 50,
    //                         "errorPercentThreshold": 50,
    //                         "requestVolumeThreshold": 10,
    //                         "sleepWindow": 1000,
    //                         "totalMetricWindow": 10
    //                     },
    @NameInMap("configs")
    @Validation(required = true)
    public CircuitBreakerConfigModel configs;

    // "trafficConditions": [
    //                     {
    //                         "type": "system",
    //                         "field": "trafficType",
    //                         "operation": "EQUAL",
    //                         "value": [
    //                             "online"
    //                         ]
    //                     }
    //                 ]
    @NameInMap("traffic_conditions")
    public java.util.List<BaseConditionModel> trafficConditions;

    // 熔断规则中Action,
    // "action": {
    //                     "type": "REJECT"
    //                 },
    @NameInMap("action")
    @Validation(required = true)
    public BaseActionModel action;

    public static CircuitBreakerRuleItemModel build(java.util.Map<String, ?> map) throws Exception {
        CircuitBreakerRuleItemModel self = new CircuitBreakerRuleItemModel();
        return TeaModel.build(map, self);
    }

    public CircuitBreakerRuleItemModel setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CircuitBreakerRuleItemModel setConfigs(CircuitBreakerConfigModel configs) {
        this.configs = configs;
        return this;
    }
    public CircuitBreakerConfigModel getConfigs() {
        return this.configs;
    }

    public CircuitBreakerRuleItemModel setTrafficConditions(java.util.List<BaseConditionModel> trafficConditions) {
        this.trafficConditions = trafficConditions;
        return this;
    }
    public java.util.List<BaseConditionModel> getTrafficConditions() {
        return this.trafficConditions;
    }

    public CircuitBreakerRuleItemModel setAction(BaseActionModel action) {
        this.action = action;
        return this;
    }
    public BaseActionModel getAction() {
        return this.action;
    }

}
