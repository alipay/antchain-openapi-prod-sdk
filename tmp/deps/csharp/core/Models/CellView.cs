// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 部署单元视图
    public class CellView : TeaModel {
        // 扩展部署机房id
        [NameInMap("deployment_zone_id")]
        [Validation(Required=false)]
        public string DeploymentZoneId { get; set; }

        // 部署单元描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // table id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 标识
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // master zone id
        [NameInMap("master_zone_id")]
        [Validation(Required=false)]
        public string MasterZoneId { get; set; }

        // 部署单元状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 工作空间 id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 工作空间组 id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

    }

}
