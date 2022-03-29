// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 主机元数据
    public class TraasHostMachineDto : TeaModel {
        // uuid
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=true)]
        public string Hostname { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // collect_ip
        [NameInMap("collect_ip")]
        [Validation(Required=true)]
        public string CollectIp { get; set; }

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
        [Validation(Required=true)]
        public string SourceFrom { get; set; }

        // extension
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

    }

}
