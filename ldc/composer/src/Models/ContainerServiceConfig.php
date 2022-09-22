<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceConfig extends Model
{
    // 容器服务业务实时监控路径。
    /**
     * @example ["/home/admin/logs"]
     *
     * @var string[]
     */
    public $bizMonitorPaths;

    // 内网访问配置。
    /**
     * @example []
     *
     * @var ClusterIpService[]
     */
    public $clusterIpServices;

    // 容器配置。
    /**
     * @example []
     *
     * @var ContainerSpec[]
     */
    public $containerSpecs;

    // 容器服务部署配置。
    /**
     * @example {}
     *
     * @var DeployConfig
     */
    public $deployConfig;

    // 弹性配置。
    /**
     * @example {}
     *
     * @var ElasticConfig
     */
    public $elasticConfig;

    // 容器服务是否开启业务实时监控。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableBizMonitor;

    // 容器服务是否开启日志监控。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableLogConfig;

    // 容器服务是否开启SofaMesh。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableSofaMesh;

    // 统一接入配置。
    /**
     * @example [{}]
     *
     * @var IngressConfig[]
     */
    public $ingresses;

    // 内网负载均衡访问配置（旧版）
    /**
     * @example []
     *
     * @var LoadBalancerService[]
     */
    public $innerLoadBalancerServices;

    // 公网访问负载均衡配置（旧版）
    /**
     * @example []
     *
     * @var LoadBalancerService[]
     */
    public $publicLoadBalancerServices;

    // sidecar 模版配置
    /**
     * @example
     *
     * @var SidecarTemplate[]
     */
    public $sidecarConfigs;

    // 容器服务关联的Pod是否使用宿主机网络。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $useHostNetwork;

    // 负载均衡配置
    /**
     * @example
     *
     * @var LoadBalancerService[]
     */
    public $loadBalancerServices;

    // volumeClaimConfigs
    /**
     * @example
     *
     * @var VolumeClaimConfig[]
     */
    public $volumeClaimConfigs;

    // 容忍度配置
    /**
     * @example []
     *
     * @var Toleration[]
     */
    public $tolerations;

    // 启用的sidercar列表，只针对首次发布生效
    /**
     * @example []
     *
     * @var SidecarConfig[]
     */
    public $sidercars;

    // headless service 配置
    /**
     * @example []
     *
     * @var HeadlessService[]
     */
    public $headlessServices;

    // 资源overrides（lks 1.24.0后开始支持）
    /**
     * @example [{}]
     *
     * @var ResourceOverride[]
     */
    public $resourceOverrides;

    // 摘流配置
    /**
     * @example {}
     *
     * @var TrafficConfig
     */
    public $trafficConfig;
    protected $_name = [
        'bizMonitorPaths'            => 'biz_monitor_paths',
        'clusterIpServices'          => 'cluster_ip_services',
        'containerSpecs'             => 'container_specs',
        'deployConfig'               => 'deploy_config',
        'elasticConfig'              => 'elastic_config',
        'enableBizMonitor'           => 'enable_biz_monitor',
        'enableLogConfig'            => 'enable_log_config',
        'enableSofaMesh'             => 'enable_sofa_mesh',
        'ingresses'                  => 'ingresses',
        'innerLoadBalancerServices'  => 'inner_load_balancer_services',
        'publicLoadBalancerServices' => 'public_load_balancer_services',
        'sidecarConfigs'             => 'sidecar_configs',
        'useHostNetwork'             => 'use_host_network',
        'loadBalancerServices'       => 'load_balancer_services',
        'volumeClaimConfigs'         => 'volume_claim_configs',
        'tolerations'                => 'tolerations',
        'sidercars'                  => 'sidercars',
        'headlessServices'           => 'headless_services',
        'resourceOverrides'          => 'resource_overrides',
        'trafficConfig'              => 'traffic_config',
    ];

    public function validate()
    {
        Model::validateRequired('containerSpecs', $this->containerSpecs, true);
        Model::validateRequired('deployConfig', $this->deployConfig, true);
        Model::validateRequired('elasticConfig', $this->elasticConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizMonitorPaths) {
            $res['biz_monitor_paths'] = $this->bizMonitorPaths;
        }
        if (null !== $this->clusterIpServices) {
            $res['cluster_ip_services'] = [];
            if (null !== $this->clusterIpServices && \is_array($this->clusterIpServices)) {
                $n = 0;
                foreach ($this->clusterIpServices as $item) {
                    $res['cluster_ip_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->containerSpecs) {
            $res['container_specs'] = [];
            if (null !== $this->containerSpecs && \is_array($this->containerSpecs)) {
                $n = 0;
                foreach ($this->containerSpecs as $item) {
                    $res['container_specs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deployConfig) {
            $res['deploy_config'] = null !== $this->deployConfig ? $this->deployConfig->toMap() : null;
        }
        if (null !== $this->elasticConfig) {
            $res['elastic_config'] = null !== $this->elasticConfig ? $this->elasticConfig->toMap() : null;
        }
        if (null !== $this->enableBizMonitor) {
            $res['enable_biz_monitor'] = $this->enableBizMonitor;
        }
        if (null !== $this->enableLogConfig) {
            $res['enable_log_config'] = $this->enableLogConfig;
        }
        if (null !== $this->enableSofaMesh) {
            $res['enable_sofa_mesh'] = $this->enableSofaMesh;
        }
        if (null !== $this->ingresses) {
            $res['ingresses'] = [];
            if (null !== $this->ingresses && \is_array($this->ingresses)) {
                $n = 0;
                foreach ($this->ingresses as $item) {
                    $res['ingresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->innerLoadBalancerServices) {
            $res['inner_load_balancer_services'] = [];
            if (null !== $this->innerLoadBalancerServices && \is_array($this->innerLoadBalancerServices)) {
                $n = 0;
                foreach ($this->innerLoadBalancerServices as $item) {
                    $res['inner_load_balancer_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->publicLoadBalancerServices) {
            $res['public_load_balancer_services'] = [];
            if (null !== $this->publicLoadBalancerServices && \is_array($this->publicLoadBalancerServices)) {
                $n = 0;
                foreach ($this->publicLoadBalancerServices as $item) {
                    $res['public_load_balancer_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sidecarConfigs) {
            $res['sidecar_configs'] = [];
            if (null !== $this->sidecarConfigs && \is_array($this->sidecarConfigs)) {
                $n = 0;
                foreach ($this->sidecarConfigs as $item) {
                    $res['sidecar_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->useHostNetwork) {
            $res['use_host_network'] = $this->useHostNetwork;
        }
        if (null !== $this->loadBalancerServices) {
            $res['load_balancer_services'] = [];
            if (null !== $this->loadBalancerServices && \is_array($this->loadBalancerServices)) {
                $n = 0;
                foreach ($this->loadBalancerServices as $item) {
                    $res['load_balancer_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->volumeClaimConfigs) {
            $res['volume_claim_configs'] = [];
            if (null !== $this->volumeClaimConfigs && \is_array($this->volumeClaimConfigs)) {
                $n = 0;
                foreach ($this->volumeClaimConfigs as $item) {
                    $res['volume_claim_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tolerations) {
            $res['tolerations'] = [];
            if (null !== $this->tolerations && \is_array($this->tolerations)) {
                $n = 0;
                foreach ($this->tolerations as $item) {
                    $res['tolerations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sidercars) {
            $res['sidercars'] = [];
            if (null !== $this->sidercars && \is_array($this->sidercars)) {
                $n = 0;
                foreach ($this->sidercars as $item) {
                    $res['sidercars'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->headlessServices) {
            $res['headless_services'] = [];
            if (null !== $this->headlessServices && \is_array($this->headlessServices)) {
                $n = 0;
                foreach ($this->headlessServices as $item) {
                    $res['headless_services'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resourceOverrides) {
            $res['resource_overrides'] = [];
            if (null !== $this->resourceOverrides && \is_array($this->resourceOverrides)) {
                $n = 0;
                foreach ($this->resourceOverrides as $item) {
                    $res['resource_overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->trafficConfig) {
            $res['traffic_config'] = null !== $this->trafficConfig ? $this->trafficConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_monitor_paths'])) {
            if (!empty($map['biz_monitor_paths'])) {
                $model->bizMonitorPaths = $map['biz_monitor_paths'];
            }
        }
        if (isset($map['cluster_ip_services'])) {
            if (!empty($map['cluster_ip_services'])) {
                $model->clusterIpServices = [];
                $n                        = 0;
                foreach ($map['cluster_ip_services'] as $item) {
                    $model->clusterIpServices[$n++] = null !== $item ? ClusterIpService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['container_specs'])) {
            if (!empty($map['container_specs'])) {
                $model->containerSpecs = [];
                $n                     = 0;
                foreach ($map['container_specs'] as $item) {
                    $model->containerSpecs[$n++] = null !== $item ? ContainerSpec::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['deploy_config'])) {
            $model->deployConfig = DeployConfig::fromMap($map['deploy_config']);
        }
        if (isset($map['elastic_config'])) {
            $model->elasticConfig = ElasticConfig::fromMap($map['elastic_config']);
        }
        if (isset($map['enable_biz_monitor'])) {
            $model->enableBizMonitor = $map['enable_biz_monitor'];
        }
        if (isset($map['enable_log_config'])) {
            $model->enableLogConfig = $map['enable_log_config'];
        }
        if (isset($map['enable_sofa_mesh'])) {
            $model->enableSofaMesh = $map['enable_sofa_mesh'];
        }
        if (isset($map['ingresses'])) {
            if (!empty($map['ingresses'])) {
                $model->ingresses = [];
                $n                = 0;
                foreach ($map['ingresses'] as $item) {
                    $model->ingresses[$n++] = null !== $item ? IngressConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['inner_load_balancer_services'])) {
            if (!empty($map['inner_load_balancer_services'])) {
                $model->innerLoadBalancerServices = [];
                $n                                = 0;
                foreach ($map['inner_load_balancer_services'] as $item) {
                    $model->innerLoadBalancerServices[$n++] = null !== $item ? LoadBalancerService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['public_load_balancer_services'])) {
            if (!empty($map['public_load_balancer_services'])) {
                $model->publicLoadBalancerServices = [];
                $n                                 = 0;
                foreach ($map['public_load_balancer_services'] as $item) {
                    $model->publicLoadBalancerServices[$n++] = null !== $item ? LoadBalancerService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sidecar_configs'])) {
            if (!empty($map['sidecar_configs'])) {
                $model->sidecarConfigs = [];
                $n                     = 0;
                foreach ($map['sidecar_configs'] as $item) {
                    $model->sidecarConfigs[$n++] = null !== $item ? SidecarTemplate::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['use_host_network'])) {
            $model->useHostNetwork = $map['use_host_network'];
        }
        if (isset($map['load_balancer_services'])) {
            if (!empty($map['load_balancer_services'])) {
                $model->loadBalancerServices = [];
                $n                           = 0;
                foreach ($map['load_balancer_services'] as $item) {
                    $model->loadBalancerServices[$n++] = null !== $item ? LoadBalancerService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['volume_claim_configs'])) {
            if (!empty($map['volume_claim_configs'])) {
                $model->volumeClaimConfigs = [];
                $n                         = 0;
                foreach ($map['volume_claim_configs'] as $item) {
                    $model->volumeClaimConfigs[$n++] = null !== $item ? VolumeClaimConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tolerations'])) {
            if (!empty($map['tolerations'])) {
                $model->tolerations = [];
                $n                  = 0;
                foreach ($map['tolerations'] as $item) {
                    $model->tolerations[$n++] = null !== $item ? Toleration::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sidercars'])) {
            if (!empty($map['sidercars'])) {
                $model->sidercars = [];
                $n                = 0;
                foreach ($map['sidercars'] as $item) {
                    $model->sidercars[$n++] = null !== $item ? SidecarConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['headless_services'])) {
            if (!empty($map['headless_services'])) {
                $model->headlessServices = [];
                $n                       = 0;
                foreach ($map['headless_services'] as $item) {
                    $model->headlessServices[$n++] = null !== $item ? HeadlessService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['resource_overrides'])) {
            if (!empty($map['resource_overrides'])) {
                $model->resourceOverrides = [];
                $n                        = 0;
                foreach ($map['resource_overrides'] as $item) {
                    $model->resourceOverrides[$n++] = null !== $item ? ResourceOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['traffic_config'])) {
            $model->trafficConfig = TrafficConfig::fromMap($map['traffic_config']);
        }

        return $model;
    }
}
