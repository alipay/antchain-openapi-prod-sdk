// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 字幕对齐任务返回结果
    public class CaptionsTask : TeaModel {
        // 任务状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 字幕对齐结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public CaptionsResult Result { get; set; }

    }

}
