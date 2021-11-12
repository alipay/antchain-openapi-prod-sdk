// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 监听器。
    public class Listener : TeaModel {
        // 后端端口。
        [NameInMap("backend_server_port")]
        [Validation(Required=false)]
        public long? BackendServerPort { get; set; }

        // 前端端口。
        [NameInMap("listener_port")]
        [Validation(Required=false)]
        public long? ListenerPort { get; set; }

        // 负载均衡实例id。
        [NameInMap("load_balancer_id")]
        [Validation(Required=false)]
        public string LoadBalancerId { get; set; }

        // 监听器协议。HTTP/HTTPS/TCP
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 资源池id。
        [NameInMap("resource_pool_id")]
        [Validation(Required=false)]
        public string ResourcePoolId { get; set; }

    }

}
