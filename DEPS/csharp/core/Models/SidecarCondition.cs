// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar过滤条件
    public class SidecarCondition : TeaModel {
        // 支持的workspaceGroup
        [NameInMap("workspace_groups")]
        [Validation(Required=false)]
        public string WorkspaceGroups { get; set; }

        // 支持的cell列表
        [NameInMap("cells")]
        [Validation(Required=false)]
        public string Cells { get; set; }

    }

}
