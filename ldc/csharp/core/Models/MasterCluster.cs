// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // master cluster info
    public class MasterCluster : TeaModel {
        // master cluster name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // workspace name
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // region name
        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // zone id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // zone name
        [NameInMap("zone_name")]
        [Validation(Required=false)]
        public string ZoneName { get; set; }

    }

}
