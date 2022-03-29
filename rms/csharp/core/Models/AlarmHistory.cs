// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmHistory
    public class AlarmHistory : TeaModel {
        // alarm_level
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // alarmPkgId
        [NameInMap("alarm_pkg_id")]
        [Validation(Required=true)]
        public long? AlarmPkgId { get; set; }

        // alarm_rule_name
        [NameInMap("alarm_rule_name")]
        [Validation(Required=true)]
        public string AlarmRuleName { get; set; }

        // alarmSourceType
        [NameInMap("alarm_source_type")]
        [Validation(Required=true)]
        public string AlarmSourceType { get; set; }

        // alarm_time
        [NameInMap("alarm_time")]
        [Validation(Required=true)]
        public long? AlarmTime { get; set; }

        // biz_domain_id
        [NameInMap("biz_domain_id")]
        [Validation(Required=true)]
        public long? BizDomainId { get; set; }

        // context
        [NameInMap("context")]
        [Validation(Required=true)]
        public string Context { get; set; }

        // custom_plugin_id
        [NameInMap("custom_plugin_id")]
        [Validation(Required=true)]
        public long? CustomPluginId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // meta_group_id
        [NameInMap("meta_group_id")]
        [Validation(Required=true)]
        public long? MetaGroupId { get; set; }

        // msg
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // stack_entity_id
        [NameInMap("stack_entity_id")]
        [Validation(Required=true)]
        public long? StackEntityId { get; set; }

        // stack_id
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

        // stack_monitor_item_name
        [NameInMap("stack_monitor_item_name")]
        [Validation(Required=true)]
        public string StackMonitorItemName { get; set; }

        // stack_universal_table_id
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=true)]
        public string StackUniversalTableId { get; set; }

        // tag_value_id
        [NameInMap("tag_value_id")]
        [Validation(Required=true)]
        public long? TagValueId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

    }

}
