// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceConfig extends TeaModel {
    // 容器服务业务实时监控路径。
    @NameInMap("biz_monitor_paths")
    public java.util.List<String> bizMonitorPaths;

    // 内网访问配置。
    @NameInMap("cluster_ip_services")
    public java.util.List<ClusterIpService> clusterIpServices;

    // 容器配置。
    @NameInMap("container_specs")
    @Validation(required = true)
    public java.util.List<ContainerSpec> containerSpecs;

    // 容器服务部署配置。
    @NameInMap("deploy_config")
    @Validation(required = true)
    public DeployConfig deployConfig;

    // 弹性配置。
    @NameInMap("elastic_config")
    @Validation(required = true)
    public ElasticConfig elasticConfig;

    // 容器服务是否开启业务实时监控。
    @NameInMap("enable_biz_monitor")
    public Boolean enableBizMonitor;

    // 容器服务是否开启日志监控。
    @NameInMap("enable_log_config")
    public Boolean enableLogConfig;

    // 容器服务是否开启SofaMesh。
    @NameInMap("enable_sofa_mesh")
    public Boolean enableSofaMesh;

    // 统一接入配置。
    @NameInMap("ingresses")
    public java.util.List<IngressConfig> ingresses;

    // 内网负载均衡访问配置（旧版）
    @NameInMap("inner_load_balancer_services")
    public java.util.List<LoadBalancerService> innerLoadBalancerServices;

    // 公网访问负载均衡配置（旧版）
    @NameInMap("public_load_balancer_services")
    public java.util.List<LoadBalancerService> publicLoadBalancerServices;

    // sidecar 模版配置
    @NameInMap("sidecar_configs")
    public java.util.List<SidecarTemplate> sidecarConfigs;

    // 容器服务关联的Pod是否使用宿主机网络。
    @NameInMap("use_host_network")
    public Boolean useHostNetwork;

    // 负载均衡配置
    @NameInMap("load_balancer_services")
    public java.util.List<LoadBalancerService> loadBalancerServices;

    // volumeClaimConfigs
    @NameInMap("volume_claim_configs")
    public java.util.List<VolumeClaimConfig> volumeClaimConfigs;

    // 容忍度配置
    @NameInMap("tolerations")
    public java.util.List<Toleration> tolerations;

    // 启用的sidercar列表，只针对首次发布生效
    @NameInMap("sidercars")
    public java.util.List<SidecarConfig> sidercars;

    // headless service 配置
    @NameInMap("headless_services")
    public java.util.List<HeadlessService> headlessServices;

    // 资源overrides（lks 1.24.0后开始支持）
    @NameInMap("resource_overrides")
    public java.util.List<ResourceOverride> resourceOverrides;

    public static ContainerServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceConfig self = new ContainerServiceConfig();
        return TeaModel.build(map, self);
    }

    public ContainerServiceConfig setBizMonitorPaths(java.util.List<String> bizMonitorPaths) {
        this.bizMonitorPaths = bizMonitorPaths;
        return this;
    }
    public java.util.List<String> getBizMonitorPaths() {
        return this.bizMonitorPaths;
    }

    public ContainerServiceConfig setClusterIpServices(java.util.List<ClusterIpService> clusterIpServices) {
        this.clusterIpServices = clusterIpServices;
        return this;
    }
    public java.util.List<ClusterIpService> getClusterIpServices() {
        return this.clusterIpServices;
    }

    public ContainerServiceConfig setContainerSpecs(java.util.List<ContainerSpec> containerSpecs) {
        this.containerSpecs = containerSpecs;
        return this;
    }
    public java.util.List<ContainerSpec> getContainerSpecs() {
        return this.containerSpecs;
    }

    public ContainerServiceConfig setDeployConfig(DeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public ContainerServiceConfig setElasticConfig(ElasticConfig elasticConfig) {
        this.elasticConfig = elasticConfig;
        return this;
    }
    public ElasticConfig getElasticConfig() {
        return this.elasticConfig;
    }

    public ContainerServiceConfig setEnableBizMonitor(Boolean enableBizMonitor) {
        this.enableBizMonitor = enableBizMonitor;
        return this;
    }
    public Boolean getEnableBizMonitor() {
        return this.enableBizMonitor;
    }

    public ContainerServiceConfig setEnableLogConfig(Boolean enableLogConfig) {
        this.enableLogConfig = enableLogConfig;
        return this;
    }
    public Boolean getEnableLogConfig() {
        return this.enableLogConfig;
    }

    public ContainerServiceConfig setEnableSofaMesh(Boolean enableSofaMesh) {
        this.enableSofaMesh = enableSofaMesh;
        return this;
    }
    public Boolean getEnableSofaMesh() {
        return this.enableSofaMesh;
    }

    public ContainerServiceConfig setIngresses(java.util.List<IngressConfig> ingresses) {
        this.ingresses = ingresses;
        return this;
    }
    public java.util.List<IngressConfig> getIngresses() {
        return this.ingresses;
    }

    public ContainerServiceConfig setInnerLoadBalancerServices(java.util.List<LoadBalancerService> innerLoadBalancerServices) {
        this.innerLoadBalancerServices = innerLoadBalancerServices;
        return this;
    }
    public java.util.List<LoadBalancerService> getInnerLoadBalancerServices() {
        return this.innerLoadBalancerServices;
    }

    public ContainerServiceConfig setPublicLoadBalancerServices(java.util.List<LoadBalancerService> publicLoadBalancerServices) {
        this.publicLoadBalancerServices = publicLoadBalancerServices;
        return this;
    }
    public java.util.List<LoadBalancerService> getPublicLoadBalancerServices() {
        return this.publicLoadBalancerServices;
    }

    public ContainerServiceConfig setSidecarConfigs(java.util.List<SidecarTemplate> sidecarConfigs) {
        this.sidecarConfigs = sidecarConfigs;
        return this;
    }
    public java.util.List<SidecarTemplate> getSidecarConfigs() {
        return this.sidecarConfigs;
    }

    public ContainerServiceConfig setUseHostNetwork(Boolean useHostNetwork) {
        this.useHostNetwork = useHostNetwork;
        return this;
    }
    public Boolean getUseHostNetwork() {
        return this.useHostNetwork;
    }

    public ContainerServiceConfig setLoadBalancerServices(java.util.List<LoadBalancerService> loadBalancerServices) {
        this.loadBalancerServices = loadBalancerServices;
        return this;
    }
    public java.util.List<LoadBalancerService> getLoadBalancerServices() {
        return this.loadBalancerServices;
    }

    public ContainerServiceConfig setVolumeClaimConfigs(java.util.List<VolumeClaimConfig> volumeClaimConfigs) {
        this.volumeClaimConfigs = volumeClaimConfigs;
        return this;
    }
    public java.util.List<VolumeClaimConfig> getVolumeClaimConfigs() {
        return this.volumeClaimConfigs;
    }

    public ContainerServiceConfig setTolerations(java.util.List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }
    public java.util.List<Toleration> getTolerations() {
        return this.tolerations;
    }

    public ContainerServiceConfig setSidercars(java.util.List<SidecarConfig> sidercars) {
        this.sidercars = sidercars;
        return this;
    }
    public java.util.List<SidecarConfig> getSidercars() {
        return this.sidercars;
    }

    public ContainerServiceConfig setHeadlessServices(java.util.List<HeadlessService> headlessServices) {
        this.headlessServices = headlessServices;
        return this;
    }
    public java.util.List<HeadlessService> getHeadlessServices() {
        return this.headlessServices;
    }

    public ContainerServiceConfig setResourceOverrides(java.util.List<ResourceOverride> resourceOverrides) {
        this.resourceOverrides = resourceOverrides;
        return this;
    }
    public java.util.List<ResourceOverride> getResourceOverrides() {
        return this.resourceOverrides;
    }

}
