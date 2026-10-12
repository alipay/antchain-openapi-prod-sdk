// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 用量信息
    public class Usage : TeaModel {
        // 分辨率
        /// <summary>
        /// <b>Example:</b>
        /// <para>720p，1080p</para>
        /// </summary>
        [NameInMap("resolution")]
        [Validation(Required=false)]
        public string Resolution { get; set; }

        // 视频时长（单位：秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>15</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 视频比例
        /// <summary>
        /// <b>Example:</b>
        /// <para>16:9</para>
        /// </summary>
        [NameInMap("ratio")]
        [Validation(Required=false)]
        public string Ratio { get; set; }

        // 消耗 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>10800</para>
        /// </summary>
        [NameInMap("completion_tokens")]
        [Validation(Required=false)]
        public long? CompletionTokens { get; set; }

        // 消耗credit数
        /// <summary>
        /// <b>Example:</b>
        /// <para>7</para>
        /// </summary>
        [NameInMap("completion_credits")]
        [Validation(Required=false)]
        public long? CompletionCredits { get; set; }

    }

}
