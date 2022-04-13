// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 集群内ClusterIP类型Service。
    public class ClusterIpService : TeaModel {
        // 对应ClusterIP service名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // ClusterIP service暴露的端口列表。
        [NameInMap("ports")]
        [Validation(Required=false)]
        public List<ServicePortMapping> Ports { get; set; }

    }

}
