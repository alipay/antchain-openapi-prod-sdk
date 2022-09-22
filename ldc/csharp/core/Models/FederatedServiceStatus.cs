// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // FederatedServiceStatus
    public class FederatedServiceStatus : TeaModel {
        // metadata
        [NameInMap("metadata")]
        [Validation(Required=false)]
        public ObjectMeta Metadata { get; set; }

        // topologyStatus
        [NameInMap("topology_status")]
        [Validation(Required=false)]
        public List<FederatedServiceTopologyStatus> TopologyStatus { get; set; }

    }

}
