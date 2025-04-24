// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文案
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 音频url
        [NameInMap("audio_url")]
        [Validation(Required=true)]
        public string AudioUrl { get; set; }

        // 字幕拆分字数，默认为单句不拆分。
        [NameInMap("split_words")]
        [Validation(Required=false)]
        public long? SplitWords { get; set; }

    }

}
