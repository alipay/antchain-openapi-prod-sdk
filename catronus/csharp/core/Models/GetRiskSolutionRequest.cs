// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class GetRiskSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
        [NameInMap("risk_solution_id")]
        [Validation(Required=false)]
        public string RiskSolutionId { get; set; }

        // 风险ID，risk_id和risk_solution_id至少有一个非空
        [NameInMap("risk_id")]
        [Validation(Required=false)]
        public string RiskId { get; set; }

    }

}
