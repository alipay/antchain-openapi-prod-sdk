// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 聊天消息
    public class ChatMessageInfo : TeaModel {
        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 提问内容
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        // 恢复内容
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 创建时间
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

    }

}
