// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 来源为Onex的操作类型的额外信息
    public class OnexExtraInfo : TeaModel {
        // Onex接口路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // Onex接口的HTTP Method
        [NameInMap("method")]
        [Validation(Required=true)]
        public string Method { get; set; }

    }

}
