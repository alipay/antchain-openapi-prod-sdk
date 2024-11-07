// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class CreateUniversalsaasDigitalhumanVoiceTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 话术脚本
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 语速，支持 0.5-2 倍速
        [NameInMap("speed")]
        [Validation(Required=true)]
        public string Speed { get; set; }

        // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
        [NameInMap("pitch")]
        [Validation(Required=false)]
        public string Pitch { get; set; }

        // [0.1, 3]，默认为1，通常保留一位小数即可
        [NameInMap("volume")]
        [Validation(Required=false)]
        public string Volume { get; set; }

        // 音色id
        [NameInMap("voice_id")]
        [Validation(Required=true)]
        public string VoiceId { get; set; }

        // 是否返回字幕信息，默认不返回
        [NameInMap("open_caption")]
        [Validation(Required=false)]
        public bool? OpenCaption { get; set; }

    }

}
