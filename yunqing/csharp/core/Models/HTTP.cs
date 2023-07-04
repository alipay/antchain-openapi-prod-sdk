// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // http配置
    public class HTTP : TeaModel {
        // 检查path
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // http schema
        [NameInMap("scheme")]
        [Validation(Required=true)]
        public string Scheme { get; set; }

        // port
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

    }

}
