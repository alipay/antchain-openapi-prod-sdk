// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ProtocolVO
    public class ProtocolVO : TeaModel {
        // 协议类型
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public string Port { get; set; }

    }

}
