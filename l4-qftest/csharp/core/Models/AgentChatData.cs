// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 权益智能体对话对象
    public class AgentChatData : TeaModel {
        // 会话id	
        // 
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 消息id	
        // 
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 是否已完成
        [NameInMap("finished")]
        [Validation(Required=true)]
        public bool? Finished { get; set; }

        // text: 文本 mage: 图片 stream：流式文本
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
