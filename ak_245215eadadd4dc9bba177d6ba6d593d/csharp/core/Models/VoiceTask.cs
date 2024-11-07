// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 音频合成任务返回结果
    public class VoiceTask : TeaModel {
        // RUNNING, COMPLETE,FAIL
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 音频地址
        [NameInMap("audio_url")]
        [Validation(Required=true)]
        public string AudioUrl { get; set; }

        // 音频时长
        [NameInMap("audio_time")]
        [Validation(Required=true)]
        public long? AudioTime { get; set; }

        // 字幕信息
        [NameInMap("captions_info")]
        [Validation(Required=false)]
        public CaptionsInfo CaptionsInfo { get; set; }

    }

}
