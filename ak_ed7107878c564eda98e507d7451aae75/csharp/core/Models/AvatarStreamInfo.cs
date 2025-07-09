// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 流信息
    public class AvatarStreamInfo : TeaModel {
        // 形象id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 音色编码
        [NameInMap("voice_code")]
        [Validation(Required=false)]
        public string VoiceCode { get; set; }

        // 背景信息
        [NameInMap("background")]
        [Validation(Required=false)]
        public string Background { get; set; }

        // 流id
        [NameInMap("stream_id")]
        [Validation(Required=true)]
        public string StreamId { get; set; }

        // 设备sn号
        [NameInMap("serial_number")]
        [Validation(Required=false)]
        public string SerialNumber { get; set; }

        // 开播时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

    }

}
