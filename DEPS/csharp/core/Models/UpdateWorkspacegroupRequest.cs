// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateWorkspacegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 域名后缀。
        [NameInMap("domain_suffix")]
        [Validation(Required=false)]
        public string DomainSuffix { get; set; }

        // workspacegroup名称，唯一标识一个环境。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // workspacegroup显示名称。
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 包含工作空间名称。
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<string> Workspaces { get; set; }

    }

}
