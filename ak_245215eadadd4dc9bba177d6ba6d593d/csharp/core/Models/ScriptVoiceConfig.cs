// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 脚本语音配置
    public class ScriptVoiceConfig : TeaModel {
        // 音色id，合成驱动选择text时必填
        [NameInMap("voice_id")]
        [Validation(Required=false)]
        public string VoiceId { get; set; }

        // 话术脚本内容，合成驱动选择text时必填
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // 0.5～2，语速，合成驱动选择text时必填
        [NameInMap("speed")]
        [Validation(Required=false)]
        public long? Speed { get; set; }

        // 音频URL，合成驱动选择audio时必填
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public string AudioUrl { get; set; }

    }

}
