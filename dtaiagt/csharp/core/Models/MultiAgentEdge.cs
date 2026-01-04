// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情 --> 隶属multi-agent的sub agents --> edges 信息
    public class MultiAgentEdge : TeaModel {
        // edge 指向的下个agent instance id
        // 
        [NameInMap("next_instance_id")]
        [Validation(Required=true)]
        public string NextInstanceId { get; set; }

        // 跳到next agent的prompt
        // 
        [NameInMap("prompt")]
        [Validation(Required=true)]
        public string Prompt { get; set; }

    }

}
