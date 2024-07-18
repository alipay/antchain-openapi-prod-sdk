// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class CreateUniversalsaasDigitalhumanVoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要转语音的文字
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 语速，[0.5,2.0]，默认1.0
        [NameInMap("speed")]
        [Validation(Required=false)]
        public string Speed { get; set; }

        // 音调，[0.1,3.0]，默认1.0
        [NameInMap("pitch")]
        [Validation(Required=false)]
        public string Pitch { get; set; }

        // 音量，[0.1,3.0]，默认1.0
        [NameInMap("volume")]
        [Validation(Required=false)]
        public string Volume { get; set; }

        // 音色id
        [NameInMap("voice")]
        [Validation(Required=true)]
        public string Voice { get; set; }

    }

}
