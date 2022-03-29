// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CreateAlarmSubscriptionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 告警等级 (-1表示全部订阅)
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // 是否开启通知降频 (0 - 关闭，1 - 开启)
        [NameInMap("notify_reduce_switch")]
        [Validation(Required=true)]
        public long? NotifyReduceSwitch { get; set; }

        // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源 ID
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 用户登录名列表
        [NameInMap("user_login_names")]
        [Validation(Required=false)]
        public List<string> UserLoginNames { get; set; }

        // 用户组 ID列表
        [NameInMap("user_group_ids")]
        [Validation(Required=false)]
        public List<long?> UserGroupIds { get; set; }

        // http web hook id列表
        [NameInMap("alarm_web_hook_ids")]
        [Validation(Required=false)]
        public List<long?> AlarmWebHookIds { get; set; }

    }

}
