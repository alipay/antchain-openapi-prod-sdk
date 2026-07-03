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
        /// <summary>
        /// <b>Example:</b>
        /// <para>above20</para>
        /// </summary>
        [NameInMap("age")]
        [Validation(Required=true)]
        public string Age { get; set; }

        // 统计值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

    }

}
