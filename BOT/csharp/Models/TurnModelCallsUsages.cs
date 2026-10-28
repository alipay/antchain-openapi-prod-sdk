// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 对话轮次中的模型调用量信息
    public class TurnModelCallsUsages : TeaModel {
        // 模型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>deepseek-v4.1-flash</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 调用状态：COMPLETED / FAILED / CANCELLED / UNKNOWN
        /// <summary>
        /// <b>Example:</b>
        /// <para>COMPLETED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 输入 token
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("input_tokens")]
        [Validation(Required=true)]
        public long? InputTokens { get; set; }

        // 输出 token
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("output_tokens")]
        [Validation(Required=true)]
        public long? OutputTokens { get; set; }

        // 总 token
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=true)]
        public long? TotalTokens { get; set; }

        // 推理 token（可选，有才返回）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("reasoning_tokens")]
        [Validation(Required=false)]
        public long? ReasoningTokens { get; set; }

        // 缓存读取 token（可选）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("cached_read_tokens")]
        [Validation(Required=false)]
        public long? CachedReadTokens { get; set; }

        // 缓存写入 token（可选）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("cached_write_tokens")]
        [Validation(Required=false)]
        public long? CachedWriteTokens { get; set; }

        // 当前模型调用耗时
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("model_duration_ms")]
        [Validation(Required=true)]
        public long? ModelDurationMs { get; set; }

    }

}
