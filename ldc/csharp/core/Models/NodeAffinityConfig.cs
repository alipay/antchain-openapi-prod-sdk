// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // node affinity entity
    public class NodeAffinityConfig : TeaModel {
        // match_expressions
        [NameInMap("match_expressions")]
        [Validation(Required=false)]
        public List<MatchExpression> MatchExpressions { get; set; }

        // requested
        [NameInMap("requested")]
        [Validation(Required=false)]
        public bool? Requested { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
