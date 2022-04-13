// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // k8s prefer schedule term
    public class PreferredSchedulingTerm : TeaModel {
        // A null or empty node selector term matches no objects
        [NameInMap("preference")]
        [Validation(Required=false)]
        public NodeSelectorTerm Preference { get; set; }

        // Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
        // 
        [NameInMap("weight")]
        [Validation(Required=true)]
        public long? Weight { get; set; }

    }

}
