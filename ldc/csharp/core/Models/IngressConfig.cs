// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入配置。
    public class IngressConfig : TeaModel {
        // 统一接入域名。
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 监听及转发规则配置。
        [NameInMap("listeners")]
        [Validation(Required=false)]
        public List<LoadBalancerListenerWithRule> Listeners { get; set; }

        // 关联的负载均衡实例的ID。
        [NameInMap("load_balancer_iaas_id")]
        [Validation(Required=false)]
        public string LoadBalancerIaasId { get; set; }

        // 关联负载均衡实例名称。
        [NameInMap("load_balancer_name")]
        [Validation(Required=false)]
        public string LoadBalancerName { get; set; }

        // 负载均衡网络类型。
        [NameInMap("load_balancer_type")]
        [Validation(Required=false)]
        public string LoadBalancerType { get; set; }

        // ingress名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Spanner集群名称。
        [NameInMap("spanner_cluster_id")]
        [Validation(Required=false)]
        public string SpannerClusterId { get; set; }

        // 统一接入协议（http|https）
        [NameInMap("unified_access_entries")]
        [Validation(Required=false)]
        public List<string> UnifiedAccessEntries { get; set; }

        // 与统一接入协议相对应的统一接入实例入端口列表
        [NameInMap("unified_access_entry_ports")]
        [Validation(Required=false)]
        public List<long?> UnifiedAccessEntryPorts { get; set; }

        // 所属统一接入实例
        [NameInMap("unified_access_instance_name")]
        [Validation(Required=false)]
        public string UnifiedAccessInstanceName { get; set; }

        // 统一接入实例联邦负载均衡id
        [NameInMap("unified_access_instance_federated_id")]
        [Validation(Required=false)]
        public string UnifiedAccessInstanceFederatedId { get; set; }

        // 监听及转发规则配置 V2
        [NameInMap("listeners_v2")]
        [Validation(Required=false)]
        public List<LoadBalancerListener> ListenersV2 { get; set; }

        // 统一接入路由模式（LDC|NONLDC）
        [NameInMap("unified_access_route_rule")]
        [Validation(Required=false)]
        public string UnifiedAccessRouteRule { get; set; }

    }

}
