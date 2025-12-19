// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // agent对话客户端返回结果
    public class AgentChatCustomResponse : TeaModel {
        // 消息id
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
