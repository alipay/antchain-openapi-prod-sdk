// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateAlarmSubscriptionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警订阅主键 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 告警级别
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // 降频通知开关
        [NameInMap("notify_reduce_switch")]
        [Validation(Required=true)]
        public long? NotifyReduceSwitch { get; set; }

    }

}
