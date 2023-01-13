// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察统计指标Meta元数据
    public class ChainInsightStatisticMetricMeta : TeaModel {
        // 统计指标的类型；枚举：Table，Histogram
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 指标的展示名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 指标的实际名称（自定义指标ID）
        [NameInMap("metric_name")]
        [Validation(Required=true)]
        public string MetricName { get; set; }

    }

}
