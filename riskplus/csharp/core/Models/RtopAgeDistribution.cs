// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业影响人数年龄分布统计
    public class RtopAgeDistribution : TeaModel {
        // 年龄
        [NameInMap("age")]
        [Validation(Required=true)]
        public string Age { get; set; }

        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

    }

}
