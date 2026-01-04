// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class UpdateAgentChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // chat id
        // 
        [NameInMap("chat_id")]
        [Validation(Required=true)]
        public string ChatId { get; set; }

        // session_id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 用户反馈[up_vote, down_vote, cancel_up, cancel_down]
        // 
        [NameInMap("user_feedback")]
        [Validation(Required=true)]
        public string UserFeedback { get; set; }

        // 用户建议
        // 
        [NameInMap("user_feed_remark")]
        [Validation(Required=false)]
        public string UserFeedRemark { get; set; }

    }

}
