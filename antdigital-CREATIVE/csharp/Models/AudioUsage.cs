// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 音频消耗
    public class AudioUsage : TeaModel {
        // 用量类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>AUDIO_GENERATION</para>
        /// </summary>
        [NameInMap("usage_type")]
        [Validation(Required=false)]
        public string UsageType { get; set; }

        // 计量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>SECOND</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 音频时长（秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.6</para>
        /// </summary>
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public string DurationSeconds { get; set; }

        // 音频数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 本次音频生成的实际消耗金额（必返）
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.11</para>
        /// </summary>
        [NameInMap("original_price")]
        [Validation(Required=false)]
        public string OriginalPrice { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
