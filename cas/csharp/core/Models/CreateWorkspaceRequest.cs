// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateWorkspaceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace 显示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // workspace 唯一标识符。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // VPC ｜ Classic
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // 地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 可用区
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

    }

}
