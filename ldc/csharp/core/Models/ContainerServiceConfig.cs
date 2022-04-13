// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务配置。
    public class ContainerServiceConfig : TeaModel {
        // 容器服务业务实时监控路径。
        [NameInMap("biz_monitor_paths")]
        [Validation(Required=false)]
        public List<string> BizMonitorPaths { get; set; }

        // 内网访问配置。
        [NameInMap("cluster_ip_services")]
        [Validation(Required=false)]
        public List<ClusterIpService> ClusterIpServices { get; set; }

        // 容器配置。
        [NameInMap("container_specs")]
        [Validation(Required=true)]
        public List<ContainerSpec> ContainerSpecs { get; set; }

        // 容器服务部署配置。
        [NameInMap("deploy_config")]
        [Validation(Required=true)]
        public DeployConfig DeployConfig { get; set; }

        // 弹性配置。
        [NameInMap("elastic_config")]
        [Validation(Required=true)]
        public ElasticConfig ElasticConfig { get; set; }

        // 容器服务是否开启业务实时监控。
        [NameInMap("enable_biz_monitor")]
        [Validation(Required=false)]
        public bool? EnableBizMonitor { get; set; }

        // 容器服务是否开启日志监控。
        [NameInMap("enable_log_config")]
        [Validation(Required=false)]
        public bool? EnableLogConfig { get; set; }

        // 容器服务是否开启SofaMesh。
        [NameInMap("enable_sofa_mesh")]
        [Validation(Required=false)]
        public bool? EnableSofaMesh { get; set; }

        // 统一接入配置。
        [NameInMap("ingresses")]
        [Validation(Required=false)]
        public List<IngressConfig> Ingresses { get; set; }

        // 内网负载均衡访问配置（旧版）
        [NameInMap("inner_load_balancer_services")]
        [Validation(Required=false)]
        public List<LoadBalancerService> InnerLoadBalancerServices { get; set; }

        // 公网访问负载均衡配置（旧版）
        [NameInMap("public_load_balancer_services")]
        [Validation(Required=false)]
        public List<LoadBalancerService> PublicLoadBalancerServices { get; set; }

        // sidecar 模版配置
        [NameInMap("sidecar_configs")]
        [Validation(Required=false)]
        public List<SidecarTemplate> SidecarConfigs { get; set; }

        // 容器服务关联的Pod是否使用宿主机网络。
        [NameInMap("use_host_network")]
        [Validation(Required=false)]
        public bool? UseHostNetwork { get; set; }

        // 负载均衡配置
        [NameInMap("load_balancer_services")]
        [Validation(Required=false)]
        public List<LoadBalancerService> LoadBalancerServices { get; set; }

        // volumeClaimConfigs
        [NameInMap("volume_claim_configs")]
        [Validation(Required=false)]
        public List<VolumeClaimConfig> VolumeClaimConfigs { get; set; }

        // 容忍度配置
        [NameInMap("tolerations")]
        [Validation(Required=false)]
        public List<Toleration> Tolerations { get; set; }

        // 启用的sidercar列表，只针对首次发布生效
        [NameInMap("sidercars")]
        [Validation(Required=false)]
        public List<SidecarConfig> Sidercars { get; set; }

        // headless service 配置
        [NameInMap("headless_services")]
        [Validation(Required=false)]
        public List<HeadlessService> HeadlessServices { get; set; }

        // 资源overrides（lks 1.24.0后开始支持）
        [NameInMap("resource_overrides")]
        [Validation(Required=false)]
        public List<ResourceOverride> ResourceOverrides { get; set; }

    }

}
