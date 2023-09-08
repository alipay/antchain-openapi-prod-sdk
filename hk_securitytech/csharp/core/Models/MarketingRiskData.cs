// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 终端安全MarketingRiskData
    public class MarketingRiskData : TeaModel {
        // risk_level
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // sug_action
        [NameInMap("sug_action")]
        [Validation(Required=true)]
        public string SugAction { get; set; }

        // `
        [NameInMap("risk_labels")]
        [Validation(Required=true)]
        public List<string> RiskLabels { get; set; }

    }

}
