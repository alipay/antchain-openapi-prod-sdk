// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--形象信息
    public class AvatarModelInfo : TeaModel {
        // 数字人形象id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public long? ModelId { get; set; }

        // 数字人形象名
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 数字人形象默认音色列表
        [NameInMap("voice_list")]
        [Validation(Required=true)]
        public List<string> VoiceList { get; set; }

        // 数字人形象预览图
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

    }

}
