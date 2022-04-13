// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 灾备信息
    public class DisasterInfo : TeaModel {
        // 同城灾备单元(组)
        [NameInMap("local_failover_target")]
        [Validation(Required=true)]
        public string LocalFailoverTarget { get; set; }

        // 异地灾备单元(组)
        [NameInMap("remote_failover_target")]
        [Validation(Required=true)]
        public string RemoteFailoverTarget { get; set; }

        // 逻辑单元&部署单元名称
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 容灾类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 正常容灾状态。
        [NameInMap("disaster_recovery_state")]
        [Validation(Required=true)]
        public string DisasterRecoveryState { get; set; }

        // 压测容灾状态。
        [NameInMap("press_disaster_recovery_state")]
        [Validation(Required=true)]
        public string PressDisasterRecoveryState { get; set; }

    }

}
