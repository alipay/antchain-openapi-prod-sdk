// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class JudgeMultiauthorityRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 批量鉴权对象
        [NameInMap("batch_event")]
        [Validation(Required=true)]
        public AuthenticateBatchEvent BatchEvent { get; set; }

        // 上下文信息
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

    }

}
