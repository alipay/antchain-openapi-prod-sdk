// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 反欺诈风险数据服务风险规则详情
    public class RiskDetail : TeaModel {
        // 反欺诈风险数据服务命中规则风险权重
        [NameInMap("rule_weight")]
        [Validation(Required=true)]
        public string RuleWeight { get; set; }

        // 反欺诈风险数据服务命中规则名称
        [NameInMap("rule_name")]
        [Validation(Required=true)]
        public string RuleName { get; set; }

    }

}
