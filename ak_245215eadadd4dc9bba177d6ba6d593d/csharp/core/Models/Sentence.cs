// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 字幕单句配置
    public class Sentence : TeaModel {
        // 字幕单句文本
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 字幕单句开始时间
        [NameInMap("begin_time")]
        [Validation(Required=true)]
        public long? BeginTime { get; set; }

        // 字幕单句结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

    }

}
