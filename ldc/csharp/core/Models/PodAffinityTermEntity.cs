// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // PodAffinityTermEntity
    public class PodAffinityTermEntity : TeaModel {
        // label_selector
        [NameInMap("label_selector")]
        [Validation(Required=false)]
        public List<MapStringToString> LabelSelector { get; set; }

        // namespaces
        [NameInMap("namespaces")]
        [Validation(Required=false)]
        public List<string> Namespaces { get; set; }

        // topology_key
        [NameInMap("topology_key")]
        [Validation(Required=false)]
        public string TopologyKey { get; set; }

    }

}
