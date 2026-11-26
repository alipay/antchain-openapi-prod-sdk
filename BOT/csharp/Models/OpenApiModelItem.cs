// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 全局模型目录条目（IoTAgent model.list 响应 items 元素）；思考等级为受控选项，未声明思考策略的模型不输出 thinking_policy/supported_efforts/default_effort
    public class OpenApiModelItem : TeaModel {
        // 模型目录稳定键（chat model_key 提交该值）
        /// <summary>
        /// <b>Example:</b>
        /// <para>dtmaas/deepseek-v4.1-flash</para>
        /// </summary>
        [NameInMap("model_key")]
        [Validation(Required=true)]
        public string ModelKey { get; set; }

        // 模型供应商
        /// <summary>
        /// <b>Example:</b>
        /// <para>dtmaas-default</para>
        /// </summary>
        [NameInMap("supplier_id")]
        [Validation(Required=true)]
        public string SupplierId { get; set; }

        // 上游模型标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>deepseek-v4.1-flash-1017</para>
        /// </summary>
        [NameInMap("upstream_model_id")]
        [Validation(Required=true)]
        public string UpstreamModelId { get; set; }

        // 展示显示名
        /// <summary>
        /// <b>Example:</b>
        /// <para>DeepSeek V4.1 Flash (DTMaaS)</para>
        /// </summary>
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 能力位列表（TEXT/VISION/OMNI/ASR/TTS/EMBEDDING/IMAGE_GEN/VOICE_CLONE）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("capabilities")]
        [Validation(Required=true)]
        public List<string> Capabilities { get; set; }

        // 是否该能力位的平台默认模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>false</para>
        /// </summary>
        [NameInMap("is_default")]
        [Validation(Required=true)]
        public bool? IsDefault { get; set; }

        // 启用状态（ACTIVE）
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACTIVE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 思考策略（受控选项，未声明不输出）
        /// <summary>
        /// <b>Example:</b>
        /// <para>OPENAI_REASONING_EFFORT</para>
        /// </summary>
        [NameInMap("thinking_policy")]
        [Validation(Required=false)]
        public string ThinkingPolicy { get; set; }

        // 支持的思考等级（受控选项，未声明不输出）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("supported_efforts")]
        [Validation(Required=false)]
        public List<string> SupportedEfforts { get; set; }

        // 默认思考等级（受控选项，未声明不输出）
        /// <summary>
        /// <b>Example:</b>
        /// <para>low</para>
        /// </summary>
        [NameInMap("default_effort")]
        [Validation(Required=false)]
        public string DefaultEffort { get; set; }

        // 上下文窗口 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000000</para>
        /// </summary>
        [NameInMap("context_window")]
        [Validation(Required=true)]
        public long? ContextWindow { get; set; }

        // 最大输出 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>16384</para>
        /// </summary>
        [NameInMap("max_output_tokens")]
        [Validation(Required=true)]
        public long? MaxOutputTokens { get; set; }

    }

}
