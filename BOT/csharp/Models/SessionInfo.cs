// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 会话信息列表
    public class SessionInfo : TeaModel {
        // 会话名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>碳矩阵智能体</para>
        /// </summary>
        [NameInMap("session_name")]
        [Validation(Required=true)]
        public string SessionName { get; set; }

        // 会话id
        /// <summary>
        /// <b>Example:</b>
        /// <para>会话id</para>
        /// </summary>
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
