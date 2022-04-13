// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // LoadBalancer类型Service。
    public class LoadBalancerService : TeaModel {
        // 域名。
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 负载均衡实例监听列表。
        [NameInMap("listeners")]
        [Validation(Required=true)]
        public List<LoadBalancerListener> Listeners { get; set; }

        // 关联的负载均衡实例的ID。
        [NameInMap("load_balancer_iaas_id")]
        [Validation(Required=false)]
        public string LoadBalancerIaasId { get; set; }

        // LoadBalancer类型service关联负载均衡实例名称。
        [NameInMap("load_balancer_name")]
        [Validation(Required=false)]
        public string LoadBalancerName { get; set; }

        // LoadBalancer类型service名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Spanner集群名称。
        [NameInMap("spanner_cluster_id")]
        [Validation(Required=false)]
        public string SpannerClusterId { get; set; }

        // 负载均衡实例的网络类型（internet | intranet | office | multidomain）
        [NameInMap("address_type")]
        [Validation(Required=false)]
        public string AddressType { get; set; }

        // 该服务在每个 cell 下要复用的负载均衡实例 ID
        [NameInMap("cell_slb_iaas_id_map")]
        [Validation(Required=false)]
        public List<MapStringToString> CellSlbIaasIdMap { get; set; }

        // custom address type模式下，指定各cell负载均衡vip
        [NameInMap("cell_lb_vip_map")]
        [Validation(Required=false)]
        public List<MapStringToString> CellLbVipMap { get; set; }

        // 是否使用联邦负载均衡实例
        [NameInMap("use_fed_loadbalancer")]
        [Validation(Required=false)]
        public bool? UseFedLoadbalancer { get; set; }

        // 联邦负载均衡实例名称
        [NameInMap("fed_loadbalancer_name")]
        [Validation(Required=false)]
        public string FedLoadbalancerName { get; set; }

    }

}
