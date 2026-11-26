// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 可选音色项（I-0133）
    public class OpenApiVoiceInfo : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("voice_id")]
        [Validation(Required=true)]
        public string VoiceId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("languages")]
        [Validation(Required=true)]
        public List<string> Languages { get; set; }

        // 由实际TTS适配器能力产生；不支持的显式参数拒绝，不接受后静默丢弃；枚举:speed,pitch,volume
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("supported_fields")]
        [Validation(Required=true)]
        public List<string> SupportedFields { get; set; }

    }

}
