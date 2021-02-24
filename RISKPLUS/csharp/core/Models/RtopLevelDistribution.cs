// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业风险等级分布统计
    public class RtopLevelDistribution : TeaModel {
        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

        // 等级
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

    }

}
