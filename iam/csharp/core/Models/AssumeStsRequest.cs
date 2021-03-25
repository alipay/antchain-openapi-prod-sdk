// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class AssumeStsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 虚拟身份唯一名称
        [NameInMap("actor_name")]
        [Validation(Required=true)]
        public string ActorName { get; set; }

        // 虚拟身份所属租户
        [NameInMap("actor_tenant")]
        [Validation(Required=true)]
        public string ActorTenant { get; set; }

        // 过期时间，单位为秒，范围900-3600，默认为3600
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public int? DurationSeconds { get; set; }

        // 会话名称
        [NameInMap("session_name")]
        [Validation(Required=true)]
        public string SessionName { get; set; }

    }

}
