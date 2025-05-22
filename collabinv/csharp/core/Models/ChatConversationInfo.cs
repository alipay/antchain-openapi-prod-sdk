// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // agent会话信息
    public class ChatConversationInfo : TeaModel {
        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // agent ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 会话名称
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 创建时间
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

    }

}
