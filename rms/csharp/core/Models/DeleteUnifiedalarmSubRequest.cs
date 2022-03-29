// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class DeleteUnifiedalarmSubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 通知对象 可能为多个
        [NameInMap("alarm_sub")]
        [Validation(Required=true)]
        public UnifiedAlarmSubDTO AlarmSub { get; set; }

        // 规则id集合
        [NameInMap("rule_id")]
        [Validation(Required=true)]
        public long? RuleId { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
