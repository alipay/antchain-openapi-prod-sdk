// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 监控告警传输对象
    public class AlarmSubDTO : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 告警展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 修改人
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 告警订阅类型(folder、customplugin)
        [NameInMap("subscription_type")]
        [Validation(Required=true)]
        public string SubscriptionType { get; set; }

        // 通知组列表
        [NameInMap("user_groups")]
        [Validation(Required=false)]
        public List<UserGroup> UserGroups { get; set; }

        // 联系人登录名数组
        [NameInMap("user_login_names")]
        [Validation(Required=false)]
        public List<string> UserLoginNames { get; set; }

    }

}
