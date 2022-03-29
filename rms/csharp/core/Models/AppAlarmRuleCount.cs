// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 应用告警规则总数
    public class AppAlarmRuleCount : TeaModel {
        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用告警规则总数
        [NameInMap("alarm_rule_count")]
        [Validation(Required=true)]
        public long? AlarmRuleCount { get; set; }

    }

}
