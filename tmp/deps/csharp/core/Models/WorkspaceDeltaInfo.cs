// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 发生增量变动的workspace信息
    public class WorkspaceDeltaInfo : TeaModel {
        // 租户名
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 环境名
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
