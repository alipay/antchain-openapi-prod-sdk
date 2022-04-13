// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // V1PodAffinityTerm
    public class PodAffinityTerm : TeaModel {
        // labelSelctor
        [NameInMap("label_selector")]
        [Validation(Required=true)]
        public LabelSelector LabelSelector { get; set; }

        // namespaces
        [NameInMap("namespaces")]
        [Validation(Required=true)]
        public List<string> Namespaces { get; set; }

    }

}
