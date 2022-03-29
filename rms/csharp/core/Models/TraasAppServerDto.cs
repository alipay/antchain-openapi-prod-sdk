// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // TraasAppServerDto
    public class TraasAppServerDto : TeaModel {
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

        // collect_id
        [NameInMap("collect_id")]
        [Validation(Required=true)]
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

        // cell_uuid
        [NameInMap("cell_uuid")]
        [Validation(Required=false)]
        public string CellUuid { get; set; }

        // zone_uuid
        [NameInMap("zone_uuid")]
        [Validation(Required=false)]
        public string ZoneUuid { get; set; }

        // app_uuid
        [NameInMap("app_uuid")]
        [Validation(Required=false)]
        public string AppUuid { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // app_service_uuid
        [NameInMap("app_service_uuid")]
        [Validation(Required=false)]
        public string AppServiceUuid { get; set; }

        // vm_uuid
        [NameInMap("vm_uuid")]
        [Validation(Required=false)]
        public string VmUuid { get; set; }

        // pod_uuid
        [NameInMap("pod_uuid")]
        [Validation(Required=false)]
        public string PodUuid { get; set; }

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

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

        // host_ip
        [NameInMap("host_ip")]
        [Validation(Required=true)]
        public string HostIp { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
