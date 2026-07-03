// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 风报风险标签统计
    public class RiskStormLabelResp : TeaModel {
        // 标签次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("label_count")]
        [Validation(Required=true)]
        public int? LabelCount { get; set; }

        // 标签id
        /// <summary>
        /// <b>Example:</b>
        /// <para>cancelled</para>
        /// </summary>
        [NameInMap("label_id")]
        [Validation(Required=true)]
        public string LabelId { get; set; }

        // 标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>注销</para>
        /// </summary>
        [NameInMap("label_name")]
        [Validation(Required=true)]
        public string LabelName { get; set; }

    }

}
