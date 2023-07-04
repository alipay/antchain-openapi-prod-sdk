// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 检测配置
    public class TCP : TeaModel {
        // tcp port
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

    }

}
