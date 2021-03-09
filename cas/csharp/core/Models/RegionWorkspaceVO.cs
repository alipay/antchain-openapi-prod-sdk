// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // RegionWorkspaceVO
    public class RegionWorkspaceVO : TeaModel {
        // availableNetworkTypes
        [NameInMap("available_network_types")]
        [Validation(Required=true)]
        public List<string> AvailableNetworkTypes { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

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

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // workspaces
        [NameInMap("workspaces")]
        [Validation(Required=true)]
        public List<WorkspaceWithGroupView> Workspaces { get; set; }

    }

}
