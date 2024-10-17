// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人训练结果
    public class TrainingResult : TeaModel {
        // 数字人id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 音色id
        [NameInMap("voice_id")]
        [Validation(Required=false)]
        public string VoiceId { get; set; }

    }

}
