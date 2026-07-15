// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权规则详细信息
    public class AuthorizationRule : TeaModel {
        // 规则来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>DID</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 规则索引
        /// <summary>
        /// <b>Example:</b>
        /// <para>serviceType</para>
        /// </summary>
        [NameInMap("index")]
        [Validation(Required=true)]
        public string Index { get; set; }

        // 规则类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEFAULT</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 规则表达式
        /// <summary>
        /// <b>Example:</b>
        /// <para>EQUALS</para>
        /// </summary>
        [NameInMap("expression")]
        [Validation(Required=true)]
        public string Expression { get; set; }

        // 规则内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>content</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
