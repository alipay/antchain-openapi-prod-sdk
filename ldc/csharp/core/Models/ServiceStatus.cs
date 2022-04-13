// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Service 状态
    public class ServiceStatus : TeaModel {
        // 负载均衡地址
        [NameInMap("load_balancer_ip")]
        [Validation(Required=false)]
        public string LoadBalancerIp { get; set; }

    }

}
