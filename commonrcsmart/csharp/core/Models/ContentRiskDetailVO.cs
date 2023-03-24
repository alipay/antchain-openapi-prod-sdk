// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    // 审核结果详情
    public class ContentRiskDetailVO : TeaModel {
        // 风险等级
        [NameInMap("risk_level")]
        [Validation(Required=false)]
        public string RiskLevel { get; set; }

        // 风险提示
        [NameInMap("notice")]
        [Validation(Required=false)]
        public string Notice { get; set; }

        // 命中词
        [NameInMap("viola_words")]
        [Validation(Required=false)]
        public string ViolaWords { get; set; }

    }

}
