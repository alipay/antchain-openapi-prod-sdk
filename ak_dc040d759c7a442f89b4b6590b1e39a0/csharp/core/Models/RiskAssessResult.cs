// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // 风险评估结果
    public class RiskAssessResult : TeaModel {
        // 风险评估结果
        [NameInMap("risk_value")]
        [Validation(Required=true)]
        public string RiskValue { get; set; }

        // 风险评估分数
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public string RiskScore { get; set; }

        // 风险评估标签
        [NameInMap("model_infos")]
        [Validation(Required=true)]
        public RiskModel ModelInfos { get; set; }

    }

}
