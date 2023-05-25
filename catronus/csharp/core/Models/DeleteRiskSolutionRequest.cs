// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class DeleteRiskSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险解决方案ID
        [NameInMap("risk_solution_id")]
        [Validation(Required=true)]
        public string RiskSolutionId { get; set; }

    }

}
