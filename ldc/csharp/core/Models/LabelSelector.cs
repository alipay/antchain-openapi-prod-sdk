// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // k8s label selector
    public class LabelSelector : TeaModel {
        // matchExpressions is a list of label selector requirements.
        [NameInMap("match_expressions")]
        [Validation(Required=false)]
        public List<LabelSelectorRequirement> MatchExpressions { get; set; }

        // matchLabels is a map of {key,value} pairs
        [NameInMap("match_labels")]
        [Validation(Required=false)]
        public List<Label> MatchLabels { get; set; }

    }

}
