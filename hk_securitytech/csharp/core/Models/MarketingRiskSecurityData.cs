// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // MarketingRiskSecurityData
    public class MarketingRiskSecurityData : TeaModel {
        // apdid_token
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // signature
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // solution_risk_code
        [NameInMap("solution_risk_code")]
        [Validation(Required=true)]
        public string SolutionRiskCode { get; set; }

    }

}
