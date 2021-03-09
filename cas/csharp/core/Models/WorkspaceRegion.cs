// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // WorkspaceRegion
    public class WorkspaceRegion : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // securedIsolationIdentity
        [NameInMap("secured_isolation_identity")]
        [Validation(Required=true)]
        public string SecuredIsolationIdentity { get; set; }

        // securedIsolationName
        [NameInMap("secured_isolation_name")]
        [Validation(Required=true)]
        public string SecuredIsolationName { get; set; }

        // securedZoneId
        [NameInMap("secured_zone_id")]
        [Validation(Required=true)]
        public string SecuredZoneId { get; set; }

    }

}
