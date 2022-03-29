// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 钉钉机器人
    public class DingDingRobot : TeaModel {
        // 钉钉机器人名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 钉钉机器人token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 钉钉机器人ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 是否全局有效
        [NameInMap("scope_global")]
        [Validation(Required=false)]
        public bool? ScopeGlobal { get; set; }

        // 订阅类型：0、当前workspace有效； 1、当前租户有效
        [NameInMap("valid_scope")]
        [Validation(Required=false)]
        public long? ValidScope { get; set; }

        // 订阅告警规则数量
        [NameInMap("subscribe_count")]
        [Validation(Required=false)]
        public long? SubscribeCount { get; set; }

    }

}
