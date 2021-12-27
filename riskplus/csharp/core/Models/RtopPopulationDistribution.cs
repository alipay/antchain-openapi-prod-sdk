// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业影响人数分布统计
    public class RtopPopulationDistribution : TeaModel {
        // 市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

    }

}
