// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警规则绑定关系
    public class UnifiedAlarmRuleBindingVO : TeaModel {
        // 租户 ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 工作空间 ID
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // 监控对象类型
        [NameInMap("alarm_target_type")]
        [Validation(Required=true)]
        public string AlarmTargetType { get; set; }

        // 监控对象名称
        [NameInMap("alarm_target_identity")]
        [Validation(Required=false)]
        public string AlarmTargetIdentity { get; set; }

        // 告警规则 ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=true)]
        public long? AlarmRuleId { get; set; }

        // 数据源类型
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        // 数据源 ID
        [NameInMap("datasource")]
        [Validation(Required=false)]
        public string Datasource { get; set; }

        // 告警规则详情
        [NameInMap("alarm_rule")]
        [Validation(Required=false)]
        public UnifiedAlarmRuleVO AlarmRule { get; set; }

    }

}
