// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class ApplyUserSmsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 邮箱 or 短信 二选一
        [NameInMap("telphone")]
        [Validation(Required=false)]
        public string Telphone { get; set; }

        // 过期时间（单位：秒），默认30分钟
        [NameInMap("expires")]
        [Validation(Required=false)]
        public long? Expires { get; set; }

        // 重发短信时间（单位：S），默认60s
        [NameInMap("intervals")]
        [Validation(Required=false)]
        public long? Intervals { get; set; }

        // 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
        [NameInMap("send_direct")]
        [Validation(Required=false)]
        public long? SendDirect { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
