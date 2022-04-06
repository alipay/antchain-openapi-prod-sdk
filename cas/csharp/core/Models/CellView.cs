// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 部署单元（Cell）
    public class CellView : TeaModel {
        // 部署单元对应的paas id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 部署单元名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部署单元显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 部署单元描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // deploymentZoneId
        [NameInMap("deployment_zone_id")]
        [Validation(Required=false)]
        public string DeploymentZoneId { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // workspaceGroupId
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // masterZoneId
        [NameInMap("master_zone_id")]
        [Validation(Required=false)]
        public string MasterZoneId { get; set; }

        // appendedZoneIds
        [NameInMap("appended_zone_ids")]
        [Validation(Required=false)]
        public List<string> AppendedZoneIds { get; set; }

        // List<ZoneView> zones
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<ZoneView> Zones { get; set; }

    }

}
