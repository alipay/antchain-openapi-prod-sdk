// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 度量
    public class Metric : TeaModel {
        // 度量编码
        [NameInMap("metric_code")]
        [Validation(Required=true)]
        public string MetricCode { get; set; }

        // 计算列
        [NameInMap("metric_column")]
        [Validation(Required=true)]
        public string MetricColumn { get; set; }

        // 计算方式
        [NameInMap("function_type")]
        [Validation(Required=false)]
        public string FunctionType { get; set; }

    }

}
