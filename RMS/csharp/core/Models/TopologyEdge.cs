// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 拓扑边
    public class TopologyEdge : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // source节点的id
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // target节点的id
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

    }

}
