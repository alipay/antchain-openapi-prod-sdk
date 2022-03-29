// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmRulebindingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警对象类型：APP应用，HOST主机
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 告警对象名称
        [NameInMap("alarm_target_identity")]
        [Validation(Required=false)]
        public string AlarmTargetIdentity { get; set; }

        // 告警规则ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 数据源 ID
        [NameInMap("datasource")]
        [Validation(Required=false)]
        public string Datasource { get; set; }

        // 数据源类型：CUSTOM自定义监控，STACK技术栈监控
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        // 监控指标 URL
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
