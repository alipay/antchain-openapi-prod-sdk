// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // http方式的健康检查配置
    public class HttpGetAction : TeaModel {
        // 健康检查url地址。
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 健康检查端口。
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

        // 协议类型，http/https。
        [NameInMap("scheme")]
        [Validation(Required=true)]
        public string Scheme { get; set; }

    }

}
