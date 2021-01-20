// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用管理-当前 workspace 的部署图/拓扑图
    public class DeployView : TeaModel {
        // 当前 workspace 下的所有应用服务
        [NameInMap("workspace_app_services")]
        [Validation(Required=false)]
        public List<AppServiceEntity> WorkspaceAppServices { get; set; }

        // workspace 显示名称
        [NameInMap("workspace_display_name")]
        [Validation(Required=false)]
        public string WorkspaceDisplayName { get; set; }

        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // workspace 名称
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

    }

}
