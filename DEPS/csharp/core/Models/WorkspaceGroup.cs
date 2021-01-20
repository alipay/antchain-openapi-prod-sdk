// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // WorkspaceGroup
    public class WorkspaceGroup : TeaModel {
        // 环境名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 环境显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 环境状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户名称
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 工作空间名称列表
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<string> Workspaces { get; set; }

    }

}
