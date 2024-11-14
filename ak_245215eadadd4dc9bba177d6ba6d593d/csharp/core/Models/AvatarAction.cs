// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人动作序列
    public class AvatarAction : TeaModel {
        // 动作序列id
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public long? ActionId { get; set; }

        // 动作时长，单位毫秒
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // 动作预览链接
        [NameInMap("video_path")]
        [Validation(Required=true)]
        public string VideoPath { get; set; }

    }

}
