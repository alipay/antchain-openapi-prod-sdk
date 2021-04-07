// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // TenantWorkspace
    public class TenantWorkspace : TeaModel {
        // displayName
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // gmtCreate
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmtModified
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // workspaceDcs
        [NameInMap("workspace_dcs")]
        [Validation(Required=true)]
        public List<WorkspaceDc> WorkspaceDcs { get; set; }

        // workspaceRegions
        [NameInMap("workspace_regions")]
        [Validation(Required=true)]
        public List<WorkspaceRegion> WorkspaceRegions { get; set; }

    }

}
