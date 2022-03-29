// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class BatchcreateUnifiedalarmRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 模板 ID
        [NameInMap("tpl_id")]
        [Validation(Required=true)]
        public long? TplId { get; set; }

        // 监控对象名称列表
        [NameInMap("alarm_targets")]
        [Validation(Required=true)]
        public List<AlarmTarget> AlarmTargets { get; set; }

    }

}
