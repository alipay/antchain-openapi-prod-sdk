// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models
{
    public class CreateUniversalsaasDigitalhumanVideoTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 画布大小
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 数字人id
        [NameInMap("avatar_id")]
        [Validation(Required=true)]
        public string AvatarId { get; set; }

        // text/audio, 合成驱动--文本/音频
        [NameInMap("driver_type")]
        [Validation(Required=true)]
        public string DriverType { get; set; }

        // 形象设置
        [NameInMap("profile_info")]
        [Validation(Required=false)]
        public ProfileInfo ProfileInfo { get; set; }

        // 话术脚本语音配置
        [NameInMap("script_voice_config")]
        [Validation(Required=true)]
        public ScriptVoiceConfig ScriptVoiceConfig { get; set; }

        // 是否开启字幕
        [NameInMap("open_captions")]
        [Validation(Required=true)]
        public bool? OpenCaptions { get; set; }

        // 字幕配置
        [NameInMap("captions_info")]
        [Validation(Required=false)]
        public CaptionsInfo CaptionsInfo { get; set; }

        // 是否替换字幕敏感词
        [NameInMap("replace_sensitive")]
        [Validation(Required=false)]
        public bool? ReplaceSensitive { get; set; }

        // 背景信息
        [NameInMap("background")]
        [Validation(Required=false)]
        public Background Background { get; set; }

        // 贴片元素信息
        [NameInMap("pasters")]
        [Validation(Required=false)]
        public List<Paster> Pasters { get; set; }

        // 数字人视频生成格式，默认不填
        [NameInMap("format")]
        [Validation(Required=false)]
        public string Format { get; set; }

        // 画布大小
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

    }

}
