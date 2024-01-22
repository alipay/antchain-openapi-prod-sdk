// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 设备风险咨询结果
    public class RiskQueryData : TeaModel {
        // 风险评分
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public string RiskScore { get; set; }

        // 风险标签
        [NameInMap("risk_labels")]
        [Validation(Required=true)]
        public List<string> RiskLabels { get; set; }

    }

}
