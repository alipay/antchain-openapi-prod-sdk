// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 指标数据
    public class MetricData : TeaModel {
        // 维度信息
        [NameInMap("tags")]
        [Validation(Required=true)]
        public List<KeySet> Tags { get; set; }

        // 时序数据
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<MetricValue> Values { get; set; }

    }

}
