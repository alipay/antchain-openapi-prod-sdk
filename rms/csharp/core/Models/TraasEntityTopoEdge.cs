// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 实体拓扑边
    public class TraasEntityTopoEdge : TeaModel {
        // source_node
        [NameInMap("source_node")]
        [Validation(Required=true)]
        public TraasEntityTopoNode SourceNode { get; set; }

        // target_node
        [NameInMap("target_node")]
        [Validation(Required=true)]
        public TraasEntityTopoNode TargetNode { get; set; }

        // relation
        [NameInMap("relation")]
        [Validation(Required=true)]
        public string Relation { get; set; }

    }

}
