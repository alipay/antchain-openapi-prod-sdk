// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    // 输入token详情
    public class PromptTokensDetail : TeaModel {
        // 缓存token
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("cached_tokens")]
        [Validation(Required=true)]
        public long? CachedTokens { get; set; }

    }

}
