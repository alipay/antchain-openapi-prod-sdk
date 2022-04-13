// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // tcp方式的健康检查配置。
    public class TcpSocketAction : TeaModel {
        // 健康检查端口。
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

    }

}
