// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 负载均衡后端服务器。
    public class BackendServer : TeaModel {
        // 容器id。
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

        // 容器所在的资源池id。
        [NameInMap("container_resource_pool_id")]
        [Validation(Required=false)]
        public string ContainerResourcePoolId { get; set; }

        // 资源池id。
        [NameInMap("lb_resource_pool_id")]
        [Validation(Required=false)]
        public string LbResourcePoolId { get; set; }

        // 负载均衡实例id。
        [NameInMap("load_balancer_id")]
        [Validation(Required=false)]
        public string LoadBalancerId { get; set; }

        // 权重。
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
