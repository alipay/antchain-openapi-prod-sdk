// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业日期趋势统计
    public class RtopDateDistribution : TeaModel {
        // 统计值
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

        // 年龄
        [NameInMap("date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date { get; set; }

    }

}
