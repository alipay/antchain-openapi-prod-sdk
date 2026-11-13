// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 消耗
    public class ChatUsage : TeaModel {
        // 输入 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>121212</para>
        /// </summary>
        [NameInMap("prompt_tokens")]
        [Validation(Required=false)]
        public string PromptTokens { get; set; }

        // 输出 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1111</para>
        /// </summary>
        [NameInMap("completion_tokens")]
        [Validation(Required=false)]
        public string CompletionTokens { get; set; }

        // 总 token 数
        /// <summary>
        /// <b>Example:</b>
        /// <para>121212</para>
        /// </summary>
        [NameInMap("total_tokens")]
        [Validation(Required=false)]
        public string TotalTokens { get; set; }

        // 本次调用实际消耗金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>11.01</para>
        /// </summary>
        [NameInMap("original_price")]
        [Validation(Required=false)]
        public string OriginalPrice { get; set; }

        // 币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>CNY</para>
        /// </summary>
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

    }

}
