// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 统一告警订阅
    public class UnifiedAlarmSubVO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 告警规则id
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 告警模板id
        [NameInMap("alarm_tpl_id")]
        [Validation(Required=false)]
        public long? AlarmTplId { get; set; }

        // 订阅者的类型
        [NameInMap("subscriber_type")]
        [Validation(Required=false)]
        public string SubscriberType { get; set; }

        // 订阅者
        [NameInMap("subscriber")]
        [Validation(Required=false)]
        public string Subscriber { get; set; }

        // 订阅者名称
        [NameInMap("subscriber_name")]
        [Validation(Required=false)]
        public string SubscriberName { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // 工作空间id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // 创建人,可以理解为当前登录用户
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改人,同creator
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 创建日期
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改日期
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 静默时间
        [NameInMap("silence_time")]
        [Validation(Required=false)]
        public long? SilenceTime { get; set; }

        // 通知渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 订阅者来源
        [NameInMap("subscriber_source")]
        [Validation(Required=false)]
        public string SubscriberSource { get; set; }

    }

}
