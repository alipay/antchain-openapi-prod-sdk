// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业地区分布统计
    public class RtopRegionalDistribution : TeaModel {
        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 地区
        [NameInMap("place")]
        [Validation(Required=true)]
        public string Place { get; set; }

        // 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
        [NameInMap("type_distribution")]
        [Validation(Required=false)]
        public List<RtopTypeDistribution> TypeDistribution { get; set; }

    }

}
