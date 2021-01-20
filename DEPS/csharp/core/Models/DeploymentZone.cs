// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 部署可用区
    public class DeploymentZone : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 显示名
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 环境 id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 工作空间组 id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 主可用区 ID
        [NameInMap("master_zone_id")]
        [Validation(Required=false)]
        public string MasterZoneId { get; set; }

        // 附属可用区 ID
        [NameInMap("appended_zone_ids")]
        [Validation(Required=false)]
        public List<string> AppendedZoneIds { get; set; }

        // 包含部署单元
        [NameInMap("cells")]
        [Validation(Required=false)]
        public List<Cell> Cells { get; set; }

    }

}
