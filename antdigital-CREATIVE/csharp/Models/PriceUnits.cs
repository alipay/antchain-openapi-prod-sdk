// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 输出单元列表
    public class PriceUnits : TeaModel {
        // 当前输出单元定价维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;test&quot;:&quot;1&quot;}</para>
        /// </summary>
        [NameInMap("dimensions")]
        [Validation(Required=false)]
        public string Dimensions { get; set; }

        // 当前输出单元计量指标
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;test&quot;:&quot;1&quot;}</para>
        /// </summary>
        [NameInMap("metrics")]
        [Validation(Required=false)]
        public string Metrics { get; set; }

    }

}
