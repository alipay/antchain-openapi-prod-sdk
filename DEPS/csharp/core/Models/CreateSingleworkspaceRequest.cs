// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateSingleworkspaceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace 显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // workspace 唯一标识符
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // VPC ｜ Classic
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 地域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 枚举值：
        //   标准工作空间NORMAL;
        //   单元化工作空间UNIT
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 可用区
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

    }

}
