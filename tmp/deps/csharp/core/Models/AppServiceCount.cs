// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用管理-应用服务计数
    public class AppServiceCount : TeaModel {
        // 经典容器服务数量
        [NameInMap("classic_count")]
        [Validation(Required=false)]
        public long? ClassicCount { get; set; }

        // 容器应用服务数量
        [NameInMap("container_count")]
        [Validation(Required=false)]
        public long? ContainerCount { get; set; }

        // 无服务器应用服务数
        [NameInMap("serverless_count")]
        [Validation(Required=false)]
        public long? ServerlessCount { get; set; }

    }

}
