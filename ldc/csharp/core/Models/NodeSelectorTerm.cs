// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // nodeSelectorterm
    public class NodeSelectorTerm : TeaModel {
        // A list of node selector requirements by node labels.
        // 
        [NameInMap("match_expressions")]
        [Validation(Required=false)]
        public List<NodeSelectorRequirement> MatchExpressions { get; set; }

        // A list of node selector requirements by node fields.
        // 
        [NameInMap("match_fields")]
        [Validation(Required=true)]
        public List<NodeSelectorRequirement> MatchFields { get; set; }

    }

}
