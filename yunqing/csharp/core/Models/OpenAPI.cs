// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // OpenAPI定义
    public class OpenAPI : TeaModel {
        // API方法
        [NameInMap("method")]
        [Validation(Required=true)]
        public string Method { get; set; }

        // API版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
