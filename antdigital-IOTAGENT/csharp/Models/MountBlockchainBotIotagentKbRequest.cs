// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class MountBlockchainBotIotagentKbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标 Agent ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 知识库 ID
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 产品实例 ID（共享租户/实例范围接入时传入校验可见性）
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

    }

}
