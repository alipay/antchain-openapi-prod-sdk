// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // Cell
    public class Cell : TeaModel {
        // 部署区域名称
        [NameInMap("deployment_zone")]
        [Validation(Required=false)]
        public string DeploymentZone { get; set; }

        // 部署单元描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 部署单元名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 部署单元所属主可用区ID列表
        [NameInMap("master_zone")]
        [Validation(Required=false)]
        public string MasterZone { get; set; }

        // 部署单元显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部署单元对应的paas id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // 部署单元状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 部署单元类型[单元化模式特有]。
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // 环境名称
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

        // 部署单元所属可用区ID列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

        // displayName
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // appendedZoneIds
        [NameInMap("appended_zone_ids")]
        [Validation(Required=false)]
        public List<string> AppendedZoneIds { get; set; }

    }

}
