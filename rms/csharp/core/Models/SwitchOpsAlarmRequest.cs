// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class SwitchOpsAlarmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // DATA_OPS： 诊断告警
        // AGENT：agent告警
        // 
        [NameInMap("alarm_target_type")]
        [Validation(Required=true)]
        public string AlarmTargetType { get; set; }

        // 1：开启告警
        // 0：暂停告警
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 应用
        [NameInMap("alarm_target_identity")]
        [Validation(Required=false)]
        public string AlarmTargetIdentity { get; set; }

    }

}
