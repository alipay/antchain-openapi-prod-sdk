// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 用户组关联关系
    public class UserGroupRelation : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 用户组 ID
        [NameInMap("user_group_id")]
        [Validation(Required=true)]
        public long? UserGroupId { get; set; }

        // 钉钉机器人webhook
        [NameInMap("dingtalk_webhook")]
        [Validation(Required=true)]
        public string DingtalkWebhook { get; set; }

        // 联系人登录名
        [NameInMap("user_login_name")]
        [Validation(Required=true)]
        public string UserLoginName { get; set; }

        // 用户展示名
        [NameInMap("user_display_name")]
        [Validation(Required=false)]
        public string UserDisplayName { get; set; }

        // 钉钉机器人
        [NameInMap("ding_ding_robot")]
        [Validation(Required=false)]
        public string DingDingRobot { get; set; }

    }

}
