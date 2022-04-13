// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦负载均衡实例属性
    public class FedLoadBalancer : TeaModel {
        // 联邦负载均衡实例名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 地址类型，比如公网、内网
        [NameInMap("addr_type")]
        [Validation(Required=true)]
        public string AddrType { get; set; }

        // 联邦负载均衡实例的状态，由多个local 负载均衡实例的状态汇聚计算而来
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 关联的应用服务情况
        [NameInMap("container_services_info")]
        [Validation(Required=false)]
        public List<FedLoadBalancerContainerServiceRel> ContainerServicesInfo { get; set; }

        // local lb实例信息
        [NameInMap("local_loadbalancer_instances")]
        [Validation(Required=false)]
        public List<LocalLoadBalancer> LocalLoadbalancerInstances { get; set; }

    }

}
