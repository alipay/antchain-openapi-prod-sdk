// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchcreateUnifiedalarmSubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 通知对象 可能有多个
        [NameInMap("alarm_subs")]
        [Validation(Required=true)]
        public List<UnifiedAlarmSubDTO> AlarmSubs { get; set; }

        // 告警规则id集合
        [NameInMap("alarm_rule_ids")]
        [Validation(Required=false)]
        public List<long?> AlarmRuleIds { get; set; }

        // 是否全部订阅
        [NameInMap("sub_all")]
        [Validation(Required=false)]
        public bool? SubAll { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 订阅成员是新增吗？新增时，不做旧的订阅关系做覆盖
        [NameInMap("is_append")]
        [Validation(Required=false)]
        public bool? IsAppend { get; set; }

    }

}
