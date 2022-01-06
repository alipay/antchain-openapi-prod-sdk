// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 新统一熔断模型，前端传入和后端返回
    public class CircuitBreakerRuleItemModel : TeaModel {
        // 熔断规则类型(取值avgRt，errorRatio)
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // 熔断配置，和ruleType的值有关,
        // "ruleType": "avgRt",
        // "configs": {
        //                         "averageRtThreshold": 50,
        //                         "errorPercentThreshold": 50,
        //                         "requestVolumeThreshold": 10,
        //                         "sleepWindow": 1000,
        //                         "totalMetricWindow": 10
        //                     },
        [NameInMap("configs")]
        [Validation(Required=true)]
        public CircuitBreakerConfigModel Configs { get; set; }

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
        [NameInMap("traffic_conditions")]
        [Validation(Required=false)]
        public List<BaseConditionModel> TrafficConditions { get; set; }

        // 熔断规则中Action,
        // "action": {
        //                     "type": "REJECT"
        //                 },
        [NameInMap("action")]
        [Validation(Required=true)]
        public BaseActionModel Action { get; set; }

    }

}
