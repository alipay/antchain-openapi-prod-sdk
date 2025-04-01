// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--音色信息
    public class AvatarVoiceInfo : TeaModel {
        // 音色id
        [NameInMap("voice_id")]
        [Validation(Required=true)]
        public string VoiceId { get; set; }

        // 音色编码
        [NameInMap("voice_code")]
        [Validation(Required=true)]
        public string VoiceCode { get; set; }

        // 音色名
        [NameInMap("voice_name")]
        [Validation(Required=true)]
        public string VoiceName { get; set; }

        // 预览图
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 音色性别
        [NameInMap("gender")]
        [Validation(Required=false)]
        public string Gender { get; set; }

        // 音色类型
        [NameInMap("voice_type")]
        [Validation(Required=false)]
        public string VoiceType { get; set; }

        // 音色试听链接列表
        [NameInMap("audition_list")]
        [Validation(Required=false)]
        public List<string> AuditionList { get; set; }

    }

}
