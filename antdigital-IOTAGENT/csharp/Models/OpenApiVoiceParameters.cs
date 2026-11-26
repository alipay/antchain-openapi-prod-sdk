// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 语音参数（I-0133）
    public class OpenApiVoiceParameters : TeaModel {
        // 未确证规范映射/默认为null，不把SDK rate默认当规范已生效
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("speed")]
        [Validation(Required=true)]
        public long? Speed { get; set; }

        // 未确证为null；SDK pitchRate默认1不等于半音0
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("pitch")]
        [Validation(Required=true)]
        public long? Pitch { get; set; }

        // Cosyvoice原应用默认100；其他未确证默认null
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("volume")]
        [Validation(Required=true)]
        public long? Volume { get; set; }

    }

}
