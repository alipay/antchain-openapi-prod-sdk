// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // master clusters info of each zone
    public class MasterClustersOfZone : TeaModel {
        // master clusters of specific zone
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<MasterCluster> Clusters { get; set; }

        // zone name
        [NameInMap("zone_name")]
        [Validation(Required=true)]
        public string ZoneName { get; set; }

        // if the az has imported cluster
        [NameInMap("has_imported")]
        [Validation(Required=true)]
        public bool? HasImported { get; set; }

    }

}
