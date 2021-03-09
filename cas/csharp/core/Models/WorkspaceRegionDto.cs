// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // WorkspaceRegionDto
    public class WorkspaceRegionDto : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // regionName
        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // 安全域id
        [NameInMap("secured_zone_id")]
        [Validation(Required=false)]
        public string SecuredZoneId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // workspaceLogicRegionStatus
        [NameInMap("workspace_logic_region_status")]
        [Validation(Required=false)]
        public string WorkspaceLogicRegionStatus { get; set; }

        // workspaceLogicRegionType
        [NameInMap("workspace_logic_region_type")]
        [Validation(Required=false)]
        public string WorkspaceLogicRegionType { get; set; }

        // workspaceZoneDtos
        [NameInMap("workspace_zone_dtos")]
        [Validation(Required=false)]
        public List<WorkspaceZoneDto> WorkspaceZoneDtos { get; set; }

    }

}
