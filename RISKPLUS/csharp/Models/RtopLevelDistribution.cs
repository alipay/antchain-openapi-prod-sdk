// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业风险等级分布统计
    public class RtopLevelDistribution : TeaModel {
        // 统计值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

        // 等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>EX_HIGH_RISK</para>
        /// </summary>
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

    }

}
