// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QMBRAIN.Models
{
    // chat请求内容
    public class ChatMessage : TeaModel {
        // 橘色
        /// <summary>
        /// <b>Example:</b>
        /// <para>user</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // 请求内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>Hello, how are you?</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
