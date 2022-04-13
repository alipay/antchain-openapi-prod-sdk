// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦负载均衡实例与应用服务之间的关联关系，以及占用端口情况。
    public class FedLoadBalancerContainerServiceRel : TeaModel {
        // 应用服务名字
        [NameInMap("container_service_name")]
        [Validation(Required=true)]
        public string ContainerServiceName { get; set; }

        // 应用服务命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 联邦负载均衡实例当前已被占用的端口
        [NameInMap("occupied_ports")]
        [Validation(Required=true)]
        public List<long?> OccupiedPorts { get; set; }

    }

}
