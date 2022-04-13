// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // V1NodeSelector
    public class NodeSelector : TeaModel {
        // node selector terms
        [NameInMap("node_selector_terms")]
        [Validation(Required=true)]
        public List<NodeSelectorTerm> NodeSelectorTerms { get; set; }

    }

}
