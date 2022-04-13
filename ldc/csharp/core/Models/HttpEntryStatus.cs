// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例http entry status
    public class HttpEntryStatus : TeaModel {
        // 此entry分配到的spanner后端端口（l7 listener 端口）
        [NameInMap("backend_port")]
        [Validation(Required=false)]
        public long? BackendPort { get; set; }

        // 此entry对应service分配到的节点端口
        [NameInMap("node_port")]
        [Validation(Required=false)]
        public long? NodePort { get; set; }

    }

}
