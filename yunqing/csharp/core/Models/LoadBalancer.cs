// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 负载均衡实例。
    public class LoadBalancer : TeaModel {
        // 地址类型。INTRANET/INTERNET/OFFICE
        [NameInMap("address_type")]
        [Validation(Required=false)]
        public string AddressType { get; set; }

        // 后端服务器列表。
        [NameInMap("backend_servers")]
        [Validation(Required=false)]
        public List<BackendServer> BackendServers { get; set; }

        // 实例域名。
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 监听器列表。
        [NameInMap("listeners")]
        [Validation(Required=false)]
        public List<Listener> Listeners { get; set; }

        // 实例名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型。SLB/ALB。
        [NameInMap("provider")]
        [Validation(Required=false)]
        public string Provider { get; set; }

        // 实例id。
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 资源池id。
        [NameInMap("resource_pool_id")]
        [Validation(Required=false)]
        public string ResourcePoolId { get; set; }

        // vip地址。
        [NameInMap("vip")]
        [Validation(Required=false)]
        public string Vip { get; set; }

    }

}
