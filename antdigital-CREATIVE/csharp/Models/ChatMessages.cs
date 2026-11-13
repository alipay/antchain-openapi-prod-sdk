// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 非空消息列表
    public class ChatMessages : TeaModel {
        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>user</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // 文本内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>文本内容</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
