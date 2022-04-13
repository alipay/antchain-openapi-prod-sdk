// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务访问配置端口映射。
    public class ServicePortMapping : TeaModel {
        // 访问配置前端端口。
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // 访问配置协议。
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

        // 访问配置后端端口。
        [NameInMap("target_port")]
        [Validation(Required=true)]
        public long? TargetPort { get; set; }

    }

}
