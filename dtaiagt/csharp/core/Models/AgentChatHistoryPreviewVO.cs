// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent历史对话信息列表vo
    public class AgentChatHistoryPreviewVO : TeaModel {
        // 对话历史列表
        [NameInMap("session_list")]
        [Validation(Required=true)]
        public List<SingleAgentChatHistoryPreview> SessionList { get; set; }

    }

}
