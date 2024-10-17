// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class CloneUniversalsaasDigitalhumanAvatarVoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 训练音频url
        [NameInMap("voice_url")]
        [Validation(Required=true)]
        public string VoiceUrl { get; set; }

        // 音频名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
