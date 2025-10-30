// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALLAGENT.Models
{
    public class SendVoiceserviceSinglecallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分配的租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 分配的业务code
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 分配的主叫号码
        [NameInMap("called_show_number")]
        [Validation(Required=true)]
        public string CalledShowNumber { get; set; }

        // 被叫用户号码
        [NameInMap("called_number")]
        [Validation(Required=true)]
        public string CalledNumber { get; set; }

        // 播报文本内容
        [NameInMap("context")]
        [Validation(Required=true)]
        public string Context { get; set; }

        // 录音字段
        [NameInMap("voice_code")]
        [Validation(Required=false)]
        public string VoiceCode { get; set; }

        // TTS 变量播放时的声音风格。
        [NameInMap("tts_style")]
        [Validation(Required=true)]
        public string TtsStyle { get; set; }

        // TTS 变量播放的音量。取值范围：0~100，默认值为 50。
        [NameInMap("tts_volume")]
        [Validation(Required=false)]
        public long? TtsVolume { get; set; }

        // TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
        [NameInMap("tts_speed")]
        [Validation(Required=false)]
        public long? TtsSpeed { get; set; }

        // 播放次数。取值范围：1~3，默认取值 3。
        [NameInMap("play_times")]
        [Validation(Required=false)]
        public long? PlayTimes { get; set; }

        // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
        // 字符串类型，长度限制为 1~128 个字符。
        [NameInMap("out_id")]
        [Validation(Required=false)]
        public string OutId { get; set; }

    }

}
