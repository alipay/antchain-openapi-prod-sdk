// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 流信息
    public class AvatarStreamInfo : TeaModel {
        // 形象id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 音色编码
        [NameInMap("voice_code")]
        [Validation(Required=false)]
        public string VoiceCode { get; set; }

        // 背景信息
        [NameInMap("background")]
        [Validation(Required=false)]
        public string Background { get; set; }

        // 流id
        [NameInMap("stream_id")]
        [Validation(Required=true)]
        public string StreamId { get; set; }

    }

}
