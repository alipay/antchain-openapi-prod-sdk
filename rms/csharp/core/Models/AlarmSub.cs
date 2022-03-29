// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警订阅结构体
    public class AlarmSub : TeaModel {
        // 主键 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 用户登录名
        [NameInMap("user_login_name")]
        [Validation(Required=false)]
        public string UserLoginName { get; set; }

        // 告警组 ID
        [NameInMap("user_group_id")]
        [Validation(Required=false)]
        public long? UserGroupId { get; set; }

        // the notifyChannel
        [NameInMap("notify_channel")]
        [Validation(Required=false)]
        public string NotifyChannel { get; set; }

        // 告警套餐 ID
        [NameInMap("alarm_pkg_id")]
        [Validation(Required=false)]
        public long? AlarmPkgId { get; set; }

        // 自定义监控 ID
        [NameInMap("custom_plugin_id")]
        [Validation(Required=false)]
        public long? CustomPluginId { get; set; }

        // the stackAlarmRuleId
        [NameInMap("stack_alarm_rule_id")]
        [Validation(Required=false)]
        public long? StackAlarmRuleId { get; set; }

        // 文件夹 ID
        [NameInMap("folder_id")]
        [Validation(Required=false)]
        public long? FolderId { get; set; }

        // the metaGroupId
        [NameInMap("meta_group_id")]
        [Validation(Required=false)]
        public long? MetaGroupId { get; set; }

        // 技术栈实体
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=false)]
        public string StackUniversalTableId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 创建者
        [NameInMap("creater")]
        [Validation(Required=true)]
        public string Creater { get; set; }

        // 修改人
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 告警级别
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // 降频通知开关
        [NameInMap("notify_reduce_switch")]
        [Validation(Required=true)]
        public long? NotifyReduceSwitch { get; set; }

        // web hook id
        [NameInMap("alarm_http_web_hook_id")]
        [Validation(Required=false)]
        public long? AlarmHttpWebHookId { get; set; }

    }

}
