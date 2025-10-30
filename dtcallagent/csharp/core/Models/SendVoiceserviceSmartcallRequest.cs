// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALLAGENT.Models
{
    public class SendVoiceserviceSmartcallRequest : TeaModel {
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

        // code
        [NameInMap("voice_code")]
        [Validation(Required=false)]
        public string VoiceCode { get; set; }

        // 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
        [NameInMap("pause_time")]
        [Validation(Required=false)]
        public long? PauseTime { get; set; }

        // 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
        [NameInMap("mute_time")]
        [Validation(Required=false)]
        public long? MuteTime { get; set; }

        // 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
        // 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
        [NameInMap("action_code_break")]
        [Validation(Required=false)]
        public bool? ActionCodeBreak { get; set; }

        // 基于用户持续说话时长打断。单位：毫秒。
        // 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
        [NameInMap("action_code_time_break")]
        [Validation(Required=false)]
        public long? ActionCodeTimeBreak { get; set; }

        // 最大通话时长，超时后自动挂断。单位：秒。
        [NameInMap("session_timeout")]
        [Validation(Required=false)]
        public long? SessionTimeout { get; set; }

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

        // 用户和机器人对话时播放的背景语音文件 ID。
        [NameInMap("background_file_code")]
        [Validation(Required=false)]
        public string BackgroundFileCode { get; set; }

        // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
        // 字符串类型，长度限制为 1~128 个字符。
        [NameInMap("out_id")]
        [Validation(Required=false)]
        public string OutId { get; set; }

        // 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
        [NameInMap("dynamic_id")]
        [Validation(Required=false)]
        public string DynamicId { get; set; }

        // 是否在后处理中执行 ITN。默认为 false，即不执行。
        // 设置为 true 时，中文数字将转为阿拉伯数字输出。
        [NameInMap("enable_i_t_n")]
        [Validation(Required=false)]
        public bool? EnableITN { get; set; }

    }

}
