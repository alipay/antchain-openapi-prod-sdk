// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // ServiceSummary
    public class ServiceSummary : TeaModel {
        // 应用数
        [NameInMap("app_count")]
        [Validation(Required=false)]
        public long? AppCount { get; set; }

        // 服务数
        [NameInMap("service_count")]
        [Validation(Required=false)]
        public long? ServiceCount { get; set; }

        // 节点数
        [NameInMap("node_count")]
        [Validation(Required=false)]
        public long? NodeCount { get; set; }

    }

}
