// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人克隆任务结果
    public class CloneTask : TeaModel {
        // 数字人id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 音色id
        [NameInMap("voice_id")]
        [Validation(Required=false)]
        public string VoiceId { get; set; }

        // 初始化/训练队列中/声音克隆中/声音克隆完成/形象克隆中/形象克隆完成
        [NameInMap("avatar_status")]
        [Validation(Required=false)]
        public string AvatarStatus { get; set; }

        //  数字人训练失败会返回原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

    }

}
