// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // 风险评估响应结果
    public class RiskAssessData : TeaModel {
        // 响应头
        [NameInMap("head")]
        [Validation(Required=true)]
        public ResponseHead Head { get; set; }

        // 风险评估结果
        [NameInMap("risk_result")]
        [Validation(Required=true)]
        public RiskAssessResult RiskResult { get; set; }

    }

}
