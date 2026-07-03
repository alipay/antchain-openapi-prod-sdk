// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业类型分布统计
    public class RtopTypeDistribution : TeaModel {
        // 统计值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=true)]
        public int? Count { get; set; }

        // 当前类型下的等级分布
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("levelDistribution")]
        [Validation(Required=true)]
        public List<RtopLevelDistribution> LevelDistribution { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>MLM</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
