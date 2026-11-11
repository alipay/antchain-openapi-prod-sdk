// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 轮次模型调用用量
    public class TurnModelCallsUsages : TeaModel {
        // 模型名
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 调用状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 输入token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("input_tokens")]
        [Validation(Required=false)]
        public long? InputTokens { get; set; }

        // 输出token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("output_tokens")]
        [Validation(Required=false)]
        public long? OutputTokens { get; set; }

        // 总token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=false)]
        public long? TotalTokens { get; set; }

        // 推理token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("reasoning_tokens")]
        [Validation(Required=false)]
        public long? ReasoningTokens { get; set; }

        // 缓存读取token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("cached_read_tokens")]
        [Validation(Required=false)]
        public long? CachedReadTokens { get; set; }

        // 缓存写入token
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("cached_write_tokens")]
        [Validation(Required=false)]
        public long? CachedWriteTokens { get; set; }

        // 单次模型调用耗时(毫秒)
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("model_duration_ms")]
        [Validation(Required=false)]
        public long? ModelDurationMs { get; set; }

        // 轮次ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("turn_id")]
        [Validation(Required=false)]
        public string TurnId { get; set; }

        // 该轮用量是否完整计量
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("complete")]
        [Validation(Required=false)]
        public bool? Complete { get; set; }

        // 轮次总耗时(毫秒，含模型调用+工具执行)
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("turn_duration_ms")]
        [Validation(Required=false)]
        public long? TurnDurationMs { get; set; }

    }

}
