// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // token 用量
    public class TokenUsageDto : TeaModel {
        // 生成视频消耗的 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>235436757</para>
        /// </summary>
        [NameInMap("completion_tokens")]
        [Validation(Required=true)]
        public long? CompletionTokens { get; set; }

        // 消耗总 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>235436546</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=true)]
        public long? TotalTokens { get; set; }

        // 工具用量
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("tool_usage")]
        [Validation(Required=false)]
        public ToolUsage ToolUsage { get; set; }

    }

}
