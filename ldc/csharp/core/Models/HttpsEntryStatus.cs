// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入实例的https entry status
    public class HttpsEntryStatus : TeaModel {
        // 统一接入实例https entry分配到的spanner 后端端口
        [NameInMap("backend_port")]
        [Validation(Required=false)]
        public long? BackendPort { get; set; }

        // 统一接入实例对应的service分配到的节点端口
        [NameInMap("node_port")]
        [Validation(Required=false)]
        public long? NodePort { get; set; }

    }

}
