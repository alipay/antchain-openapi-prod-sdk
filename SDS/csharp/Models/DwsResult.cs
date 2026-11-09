// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 聚合查询结果
    public class DwsResult : TeaModel {
        // 维度列表
        [NameInMap("dimension_list")]
        [Validation(Required=true)]
        public List<Dimension> DimensionList { get; set; }

        // 度量列表
        [NameInMap("metric_list")]
        [Validation(Required=true)]
        public List<RultMetric> MetricList { get; set; }

    }

}
