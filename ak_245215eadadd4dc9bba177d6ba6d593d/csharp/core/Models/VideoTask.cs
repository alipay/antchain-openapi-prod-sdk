// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 合成任务
    public class VideoTask : TeaModel {
        // RUNNING, COMPLETE,FAIL
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 完成状态，会返回视频地址
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl { get; set; }

    }

}
