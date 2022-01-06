// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 应用支持的协议
    public class TransparentProxyProtocolModel : TeaModel {
        // 端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // 协议
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

    }

}
