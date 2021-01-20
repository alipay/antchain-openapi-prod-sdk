// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateSingleworkspaceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // VPC ｜ Classic
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 地域id
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 可用区id列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

        // 环境唯一标识
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
