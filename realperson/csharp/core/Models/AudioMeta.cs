// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 音频元数据
    public class AudioMeta : TeaModel {
        // 采样率
        [NameInMap("sample_freq")]
        [Validation(Required=false)]
        public long? SampleFreq { get; set; }

        // 音频道数
        [NameInMap("channels_num")]
        [Validation(Required=false)]
        public long? ChannelsNum { get; set; }

        // 音频数据采样点所占位数
        [NameInMap("bits")]
        [Validation(Required=false)]
        public long? Bits { get; set; }

        // 语音信道分离标识
        [NameInMap("channel")]
        [Validation(Required=false)]
        public long? Channel { get; set; }

    }

}
