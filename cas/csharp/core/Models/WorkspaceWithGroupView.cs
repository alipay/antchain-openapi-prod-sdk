// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // WorkspaceWithGroupView
    public class WorkspaceWithGroupView : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // region
        [NameInMap("region")]
        [Validation(Required=true)]
        public RegionView Region { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // zones
        [NameInMap("zones")]
        [Validation(Required=true)]
        public List<WorkspaceZoneView> Zones { get; set; }

        // workspaceGroup
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public WorkspaceGroupView WorkspaceGroup { get; set; }

    }

}
