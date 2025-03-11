// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台--角色信息
    public class AvatarHumanInfo : TeaModel {
        // 数字人角色id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 数字人角色名
        [NameInMap("human_name")]
        [Validation(Required=true)]
        public string HumanName { get; set; }

        // 数字人形象id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public long? ModelId { get; set; }

        // 数字人音色编码
        [NameInMap("voice_code")]
        [Validation(Required=true)]
        public string VoiceCode { get; set; }

        // 数字人音色名
        [NameInMap("voice_name")]
        [Validation(Required=false)]
        public string VoiceName { get; set; }

        // 数字人音色预览图
        [NameInMap("voice_image")]
        [Validation(Required=false)]
        public string VoiceImage { get; set; }

        // 语速
        [NameInMap("speech_rate")]
        [Validation(Required=false)]
        public long? SpeechRate { get; set; }

        // 音调
        [NameInMap("pitch_rate")]
        [Validation(Required=false)]
        public string PitchRate { get; set; }

        // 音量
        [NameInMap("volume")]
        [Validation(Required=false)]
        public string Volume { get; set; }

    }

}
