// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class CreateRiskSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 关联风险ID
        [NameInMap("risk_id")]
        [Validation(Required=true)]
        public string RiskId { get; set; }

        // 解决方案来源
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

    }

}
