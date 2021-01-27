// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 批量鉴权对象
    public class AuthenticateBatchEvent : TeaModel {
        // 鉴权事件列表
        [NameInMap("events")]
        [Validation(Required=true)]
        public List<AuthenticateEvent> Events { get; set; }

    }

}
