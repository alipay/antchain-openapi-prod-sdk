// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 返回体度量
    public class RultMetric : TeaModel {
        // 度量编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ori_use_amount</para>
        /// </summary>
        [NameInMap("metric_code")]
        [Validation(Required=true)]
        public string MetricCode { get; set; }

        // 度量聚合结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>21.22</para>
        /// </summary>
        [NameInMap("metric_value")]
        [Validation(Required=true)]
        public string MetricValue { get; set; }

    }

}
