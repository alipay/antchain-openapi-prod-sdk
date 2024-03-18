// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    // 数字人音色
    public class AvatarVoice : TeaModel {
        // 音色名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 音色代码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // CLONE--克隆音色；
        // PRESET--预置；
        // CUSTOM--自定义，暂时不采用。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 音色形象url
        [NameInMap("pic_url")]
        [Validation(Required=true)]
        public string PicUrl { get; set; }

        // 试听音频片段
        [NameInMap("demo_url")]
        [Validation(Required=true)]
        public string DemoUrl { get; set; }

    }

}
