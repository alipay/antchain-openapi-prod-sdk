// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateTraasmetaHostmachineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // collect_id
        [NameInMap("collect_id")]
        [Validation(Required=false)]
        public string CollectId { get; set; }

        // tenant_uuid
        [NameInMap("tenant_uuid")]
        [Validation(Required=false)]
        public string TenantUuid { get; set; }

        // tenant_name
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // workspace_uuid
        [NameInMap("workspace_uuid")]
        [Validation(Required=false)]
        public string WorkspaceUuid { get; set; }

        // workspace_name
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // zone_uuid
        [NameInMap("zone_uuid")]
        [Validation(Required=false)]
        public string ZoneUuid { get; set; }

        // zone_name
        [NameInMap("zone_name")]
        [Validation(Required=false)]
        public string ZoneName { get; set; }

        // outside_id
        [NameInMap("outside_id")]
        [Validation(Required=false)]
        public string OutsideId { get; set; }

        // source_from
        [NameInMap("source_from")]
        [Validation(Required=false)]
        public string SourceFrom { get; set; }

        // extension
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

    }

}
