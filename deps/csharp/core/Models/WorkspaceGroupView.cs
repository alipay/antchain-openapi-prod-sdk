// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 工作空间组视图
    public class WorkspaceGroupView : TeaModel {
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

        // 环境状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间列表
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<WorkspaceView> Workspaces { get; set; }

    }

}
