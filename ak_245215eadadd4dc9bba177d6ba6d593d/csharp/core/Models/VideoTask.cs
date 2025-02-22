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

        // 视频时长
        [NameInMap("video_duration")]
        [Validation(Required=false)]
        public long? VideoDuration { get; set; }

        // 字幕时间戳信息
        [NameInMap("captions_info")]
        [Validation(Required=false)]
        public CaptionsInfo CaptionsInfo { get; set; }

        // 短视频生成失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
