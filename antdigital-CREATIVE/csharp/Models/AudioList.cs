// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 音频信息
    public class AudioList : TeaModel {
        // 音频 URL 列表
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.test.com/123">www.test.com/123</a></para>
        /// </summary>
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public string AudioUrl { get; set; }

        // 音频格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>wav</para>
        /// </summary>
        [NameInMap("audio_format")]
        [Validation(Required=false)]
        public string AudioFormat { get; set; }

        // 处理后播放时长（秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.6</para>
        /// </summary>
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public string DurationSeconds { get; set; }

    }

}
