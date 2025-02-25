// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 字幕对齐任务结果
    public class CaptionsResult : TeaModel {
        // 音频时长
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // 字幕时间戳信息
        [NameInMap("sentences")]
        [Validation(Required=true)]
        public List<Sentence> Sentences { get; set; }

    }

}
