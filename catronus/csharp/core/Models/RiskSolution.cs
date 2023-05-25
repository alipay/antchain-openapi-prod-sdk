// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 风险解决方案
    public class RiskSolution : TeaModel {
        // 风险解决方案ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 风险名称
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 修复类型
        [NameInMap("fix_type")]
        [Validation(Required=true)]
        public string FixType { get; set; }

        // 风险描述
        [NameInMap("risk_description")]
        [Validation(Required=true)]
        public string RiskDescription { get; set; }

        // 风险解决方案
        [NameInMap("solution_plan")]
        [Validation(Required=true)]
        public string SolutionPlan { get; set; }

        // 应急解决方案
        [NameInMap("emergency_plan")]
        [Validation(Required=true)]
        public string EmergencyPlan { get; set; }

        // 负责人
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

    }

}
