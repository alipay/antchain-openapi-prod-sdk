// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 产品模板信息（I-0133）
    public class OpenApiTemplateInfo : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("voice_id")]
        [Validation(Required=true)]
        public string VoiceId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>示例说明</para>
        /// </summary>
        [NameInMap("role_prompt")]
        [Validation(Required=true)]
        public string RolePrompt { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("voice_parameters")]
        [Validation(Required=true)]
        public OpenApiVoiceParameters VoiceParameters { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>测试产品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("default_template")]
        [Validation(Required=true)]
        public bool? DefaultTemplate { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("base_template_id")]
        [Validation(Required=false)]
        public string BaseTemplateId { get; set; }

    }

}
