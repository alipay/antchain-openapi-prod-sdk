// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障注入规则配置项
    public class FaultInjectRuleItemModel : TeaModel {
        // 规则类型 ABORT/DELAY
        [NameInMap("rule_type")]
        [Validation(Required=false)]
        public string RuleType { get; set; }

        // 执行策略 拦截/监控
        [NameInMap("action")]
        [Validation(Required=false)]
        public ActionModel Action { get; set; }

        // 故障注入配置
        [NameInMap("configs")]
        [Validation(Required=false)]
        public FaultInjectConfigModel Configs { get; set; }

        // 流量匹配条件
        [NameInMap("traffic_conditions")]
        [Validation(Required=false)]
        public List<BaseConditionModel> TrafficConditions { get; set; }

    }

}
