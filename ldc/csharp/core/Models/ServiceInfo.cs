// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Service 信息
    public class ServiceInfo : TeaModel {
        // 元信息
        [NameInMap("meta")]
        [Validation(Required=true)]
        public ContainerServiceObjectMeta Meta { get; set; }

        // Service 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 负载均衡服务的网络类型（internet | intranet | office | multidomain）
        [NameInMap("load_balancer_address_type")]
        [Validation(Required=false)]
        public string LoadBalancerAddressType { get; set; }

        // Service 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public ServiceStatus Status { get; set; }

        // service端口映射列表
        [NameInMap("ports")]
        [Validation(Required=false)]
        public List<ServicePort> Ports { get; set; }

    }

}
