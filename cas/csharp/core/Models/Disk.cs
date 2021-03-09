// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // disk
    public class Disk : TeaModel {
        // ssd, cloud_efficiency
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // disk related computer info
        [NameInMap("computer")]
        [Validation(Required=false)]
        public DiskComputer Computer { get; set; }

        // 是否同时删除自动快照
        [NameInMap("delete_auto_snapshot")]
        [Validation(Required=false)]
        public bool? DeleteAutoSnapshot { get; set; }

        // 磁盘是否随container一起释放
        [NameInMap("delete_with_computer")]
        [Validation(Required=false)]
        public bool? DeleteWithComputer { get; set; }

        // device info
        [NameInMap("device")]
        [Validation(Required=false)]
        public string Device { get; set; }

        // 磁盘是否执行自动快照策略
        [NameInMap("enable_auto_snapshot")]
        [Validation(Required=false)]
        public bool? EnableAutoSnapshot { get; set; }

        // iaasId
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 创建磁盘的镜像
        [NameInMap("image_id")]
        [Validation(Required=false)]
        public string ImageId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 磁盘是否可卸载
        [NameInMap("portable")]
        [Validation(Required=false)]
        public bool? Portable { get; set; }

        // providerId
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // regionId
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // disk size
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // disk status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // SYSTEM, DATA
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // zoneId
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
