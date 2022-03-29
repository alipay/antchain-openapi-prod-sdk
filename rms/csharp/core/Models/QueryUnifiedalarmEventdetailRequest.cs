// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmEventdetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // event id
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 告警规则 ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 按page_size做记录切分。
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
