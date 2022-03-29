// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 拓扑节点
    public class TopologyNode : TeaModel {
        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 节点类型: APP DB MQ CACHE
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 节点id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
