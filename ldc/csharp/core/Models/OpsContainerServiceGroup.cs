// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 运维容器服务列表
    public class OpsContainerServiceGroup : TeaModel {
        // 运维容器服务列表
        [NameInMap("container_services")]
        [Validation(Required=true)]
        public List<OpsContainerService> ContainerServices { get; set; }

    }

}
