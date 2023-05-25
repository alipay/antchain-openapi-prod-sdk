// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class UpdateRiskSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险解决方案ID
        [NameInMap("risk_solution_id")]
        [Validation(Required=true)]
        public string RiskSolutionId { get; set; }

        // 解决方案类型
        [NameInMap("fix_type")]
        [Validation(Required=false)]
        public string FixType { get; set; }

        // 风险描述
        [NameInMap("risk_description")]
        [Validation(Required=false)]
        public string RiskDescription { get; set; }

        // 风险解决方案
        [NameInMap("solution_plan")]
        [Validation(Required=false)]
        public string SolutionPlan { get; set; }

        // 应急解决方案
        [NameInMap("emergency_plan")]
        [Validation(Required=false)]
        public string EmergencyPlan { get; set; }

    }

}
