// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 运维容器服务分组依赖链
    public class OpsContainerServiceChain : TeaModel {
        // 运维容器分组列表
        [NameInMap("groups")]
        [Validation(Required=true)]
        public List<OpsContainerServiceGroup> Groups { get; set; }

    }

}
