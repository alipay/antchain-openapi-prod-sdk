// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 会话用量信息
    public class SessionUsage : TeaModel {
        // 输入Token
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("input_tokens")]
        [Validation(Required=true)]
        public long? InputTokens { get; set; }

        // 输出token
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("output_tokens")]
        [Validation(Required=true)]
        public long? OutputTokens { get; set; }

        // 总Token
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=true)]
        public long? TotalTokens { get; set; }

        // 模型调用次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1024</para>
        /// </summary>
        [NameInMap("model_call_count")]
        [Validation(Required=true)]
        public long? ModelCallCount { get; set; }

        // 是否完成
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("complete")]
        [Validation(Required=true)]
        public bool? Complete { get; set; }

        // 当前轮次请求耗时
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("turn_duration_ms")]
        [Validation(Required=true)]
        public long? TurnDurationMs { get; set; }

    }

}
