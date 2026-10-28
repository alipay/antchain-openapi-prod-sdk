// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 音频规格
    public class AudioSpec : TeaModel {
        // 容器，如 WAV
        /// <summary>
        /// <b>Example:</b>
        /// <para>WAV</para>
        /// </summary>
        [NameInMap("container")]
        [Validation(Required=true)]
        public string Container { get; set; }

        // 编码，如 PCM_S16LE
        /// <summary>
        /// <b>Example:</b>
        /// <para>PCM_S16LE</para>
        /// </summary>
        [NameInMap("codec")]
        [Validation(Required=true)]
        public string Codec { get; set; }

        // 采样率，单位 Hz，如 16000
        /// <summary>
        /// <b>Example:</b>
        /// <para>16000</para>
        /// </summary>
        [NameInMap("sample_rate")]
        [Validation(Required=true)]
        public long? SampleRate { get; set; }

        // 声道数，如 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("channels")]
        [Validation(Required=true)]
        public long? Channels { get; set; }

    }

}
