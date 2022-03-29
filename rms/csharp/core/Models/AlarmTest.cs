// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 测试演示
    public class AlarmTest : TeaModel {
        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警规则id 
        [NameInMap("alarm_rule_id")]
        [Validation(Required=true)]
        public long? AlarmRuleId { get; set; }

    }

}
