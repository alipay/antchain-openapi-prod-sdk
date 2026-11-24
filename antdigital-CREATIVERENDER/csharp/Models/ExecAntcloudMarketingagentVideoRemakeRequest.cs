// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentVideoRemakeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 阶段一 task_id（= 阶段一 messageId）
        [NameInMap("storyboard_message_id")]
        [Validation(Required=true)]
        public string StoryboardMessageId { get; set; }

        // 用户编辑后的新分镜脚本（纯字符串）；
        [NameInMap("new_storyboard_script")]
        [Validation(Required=true)]
        public string NewStoryboardScript { get; set; }

        // 拆解返回的会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 本轮 USER 消息展示文案
        [NameInMap("prompt")]
        [Validation(Required=false)]
        public string Prompt { get; set; }

    }

}
