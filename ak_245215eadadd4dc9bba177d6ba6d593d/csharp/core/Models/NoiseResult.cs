// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 噪音检测结果
    public class NoiseResult : TeaModel {
        // success/failed/queuing/processing
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 声音大小
        [NameInMap("speaker_db")]
        [Validation(Required=false)]
        public string SpeakerDb { get; set; }

        // 噪音值
        [NameInMap("noise_db")]
        [Validation(Required=false)]
        public string NoiseDb { get; set; }

    }

}
