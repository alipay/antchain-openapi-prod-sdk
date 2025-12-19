// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 权益智能体对话返回结构体
    public class AgentChatResponse : TeaModel {
        // 是否结束
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 对话data数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public AgentChatData Data { get; set; }

    }

}
