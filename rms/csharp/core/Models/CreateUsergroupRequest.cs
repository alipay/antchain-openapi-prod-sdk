// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CreateUsergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 通知组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 钉钉机器人token数组
        [NameInMap("dingtalk_webhooks")]
        [Validation(Required=false)]
        public List<string> DingtalkWebhooks { get; set; }

        // 联系人登录名称数组
        [NameInMap("user_login_names")]
        [Validation(Required=false)]
        public List<string> UserLoginNames { get; set; }

        // 0、当前workspace有效；
        // 1、当前租户有效
        [NameInMap("valid_scope")]
        [Validation(Required=false)]
        public long? ValidScope { get; set; }

        // 钉钉机器人
        [NameInMap("ding_ding_robots")]
        [Validation(Required=false)]
        public List<string> DingDingRobots { get; set; }

    }

}
