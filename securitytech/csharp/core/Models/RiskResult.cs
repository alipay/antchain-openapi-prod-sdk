// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 风险结果
    public class RiskResult : TeaModel {
        // 数据列表
        [NameInMap("risk_data")]
        [Validation(Required=true)]
        public List<RiskData> RiskData { get; set; }

        // 解决方案编码
        [NameInMap("solution_code")]
        [Validation(Required=true)]
        public string SolutionCode { get; set; }

    }

}
