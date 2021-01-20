// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateWorkspacegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组显示名称。
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 域名后缀。
        [NameInMap("domain_suffix")]
        [Validation(Required=false)]
        public string DomainSuffix { get; set; }

        // 工作空间组唯一标识。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 发布部署模式。
        [NameInMap("release_mode")]
        [Validation(Required=false)]
        public string ReleaseMode { get; set; }

        // 包含工作空间列表。
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<string> Workspaces { get; set; }

    }

}
