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
        /// <summary>
        /// <b>Example:</b>
        /// <para>16000</para>
        /// </summary>
        [NameInMap("sample_freq")]
        [Validation(Required=false)]
        public long? SampleFreq { get; set; }

        // 音频道数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("channels_num")]
        [Validation(Required=false)]
        public long? ChannelsNum { get; set; }

        // 音频数据采样点所占位数
        /// <summary>
        /// <b>Example:</b>
        /// <para>16</para>
        /// </summary>
        [NameInMap("bits")]
        [Validation(Required=false)]
        public long? Bits { get; set; }

        // 语音信道分离标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public long? Channel { get; set; }

    }

}
