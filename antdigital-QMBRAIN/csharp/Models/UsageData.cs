// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    // 使用信息
    public class UsageData : TeaModel {
        // 输出消耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>38</para>
        /// </summary>
        [NameInMap("completion_tokens")]
        [Validation(Required=true)]
        public long? CompletionTokens { get; set; }

        // 输入消耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("prompt_tokens")]
        [Validation(Required=true)]
        public long? PromptTokens { get; set; }

        // 总计消耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>49</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=true)]
        public long? TotalTokens { get; set; }

        // 请求token详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>{       &quot;cached_tokens&quot;: 0     }</para>
        /// </summary>
        [NameInMap("prompt_tokens_details")]
        [Validation(Required=true)]
        public PromptTokensDetail PromptTokensDetails { get; set; }

    }

}
