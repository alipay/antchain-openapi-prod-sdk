// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用服务示例
    public class AppService : TeaModel {
        // 应用服务实例名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
