// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业影响人数性别分布统计
    public class RtopGenderDistribution : TeaModel {
        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

        // 性别
        [NameInMap("gender")]
        [Validation(Required=true)]
        public string Gender { get; set; }

    }

}
