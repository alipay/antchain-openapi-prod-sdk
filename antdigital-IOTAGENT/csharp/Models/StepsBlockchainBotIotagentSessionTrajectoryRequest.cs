// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StepsBlockchainBotIotagentSessionTrajectoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 轮次ID或操作ID
        [NameInMap("turn_id")]
        [Validation(Required=true)]
        public string TurnId { get; set; }

        // 分页游标，首次为空
        [NameInMap("cursor")]
        [Validation(Required=false)]
        public string Cursor { get; set; }

        // 每页大小 1-200，默认 100
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 定位步骤ID，首次定位用，不可与cursor同传
        [NameInMap("focus_step_id")]
        [Validation(Required=false)]
        public string FocusStepId { get; set; }

    }

}
