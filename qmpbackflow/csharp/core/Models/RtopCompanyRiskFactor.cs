// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 风险维度
    public class RtopCompanyRiskFactor : TeaModel {
        // 维度名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 维度分数
        [NameInMap("score")]
        [Validation(Required=false)]
        public long? Score { get; set; }

    }

}
