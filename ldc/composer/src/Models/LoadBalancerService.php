<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerService extends Model
{
    // 域名。
    /**
     * @example sofa.alipay.net
     *
     * @var string
     */
    public $domain;

    // 负载均衡实例监听列表。
    /**
     * @example []
     *
     * @var LoadBalancerListener[]
     */
    public $listeners;

    // 关联的负载均衡实例的ID。
    /**
     * @example lb-bp1b6c719dfa08ex******
     *
     * @var string
     */
    public $loadBalancerIaasId;

    // LoadBalancer类型service关联负载均衡实例名称。
    /**
     * @example test-lb
     *
     * @var string
     */
    public $loadBalancerName;

    // LoadBalancer类型service名称。
    /**
     * @example lb
     *
     * @var string
     */
    public $name;

    // Spanner集群名称。
    /**
     * @example 00000000
     *
     * @var string
     */
    public $spannerClusterId;

    // 负载均衡实例的网络类型（internet | intranet | office | multidomain）
    /**
     * @example intranet
     *
     * @var string
     */
    public $addressType;

    // 该服务在每个 cell 下要复用的负载均衡实例 ID
    /**
     * @example [{"gz001a":"lb-123456xxx"}]
     *
     * @var MapStringToString[]
     */
    public $cellSlbIaasIdMap;

    // custom address type模式下，指定各cell负载均衡vip
    /**
     * @example [{"rz01a": "121.23.4.5"}, {"rz02a": "202.121.2.3"}]
     *
     * @var MapStringToString[]
     */
    public $cellLbVipMap;

    // 是否使用联邦负载均衡实例
    /**
     * @example true, false
     *
     * @var bool
     */
    public $useFedLoadbalancer;

    // 联邦负载均衡实例名称
    /**
     * @example fed-lb-example
     *
     * @var string
     */
    public $fedLoadbalancerName;

    // 是否开启优雅下线等待，默认为false。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableGracefulShutdownWaiting;

    // 优雅下线等待时间，单位秒，默认0.
    /**
     * @example 10
     *
     * @var int
     */
    public $gracefulShutdownWaitingTime;

    // 是否开启集群内转发优化（集群内访问lb vip时是否走kube-proxy转发链路）
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableInClusterForwardOptimization;
    protected $_name = [
        'domain'                             => 'domain',
        'listeners'                          => 'listeners',
        'loadBalancerIaasId'                 => 'load_balancer_iaas_id',
        'loadBalancerName'                   => 'load_balancer_name',
        'name'                               => 'name',
        'spannerClusterId'                   => 'spanner_cluster_id',
        'addressType'                        => 'address_type',
        'cellSlbIaasIdMap'                   => 'cell_slb_iaas_id_map',
        'cellLbVipMap'                       => 'cell_lb_vip_map',
        'useFedLoadbalancer'                 => 'use_fed_loadbalancer',
        'fedLoadbalancerName'                => 'fed_loadbalancer_name',
        'enableGracefulShutdownWaiting'      => 'enable_graceful_shutdown_waiting',
        'gracefulShutdownWaitingTime'        => 'graceful_shutdown_waiting_time',
        'enableInClusterForwardOptimization' => 'enable_in_cluster_forward_optimization',
    ];

    public function validate()
    {
        Model::validateRequired('listeners', $this->listeners, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->listeners) {
            $res['listeners'] = [];
            if (null !== $this->listeners && \is_array($this->listeners)) {
                $n = 0;
                foreach ($this->listeners as $item) {
                    $res['listeners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->loadBalancerIaasId) {
            $res['load_balancer_iaas_id'] = $this->loadBalancerIaasId;
        }
        if (null !== $this->loadBalancerName) {
            $res['load_balancer_name'] = $this->loadBalancerName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->spannerClusterId) {
            $res['spanner_cluster_id'] = $this->spannerClusterId;
        }
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->cellSlbIaasIdMap) {
            $res['cell_slb_iaas_id_map'] = [];
            if (null !== $this->cellSlbIaasIdMap && \is_array($this->cellSlbIaasIdMap)) {
                $n = 0;
                foreach ($this->cellSlbIaasIdMap as $item) {
                    $res['cell_slb_iaas_id_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cellLbVipMap) {
            $res['cell_lb_vip_map'] = [];
            if (null !== $this->cellLbVipMap && \is_array($this->cellLbVipMap)) {
                $n = 0;
                foreach ($this->cellLbVipMap as $item) {
                    $res['cell_lb_vip_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->useFedLoadbalancer) {
            $res['use_fed_loadbalancer'] = $this->useFedLoadbalancer;
        }
        if (null !== $this->fedLoadbalancerName) {
            $res['fed_loadbalancer_name'] = $this->fedLoadbalancerName;
        }
        if (null !== $this->enableGracefulShutdownWaiting) {
            $res['enable_graceful_shutdown_waiting'] = $this->enableGracefulShutdownWaiting;
        }
        if (null !== $this->gracefulShutdownWaitingTime) {
            $res['graceful_shutdown_waiting_time'] = $this->gracefulShutdownWaitingTime;
        }
        if (null !== $this->enableInClusterForwardOptimization) {
            $res['enable_in_cluster_forward_optimization'] = $this->enableInClusterForwardOptimization;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancerService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['listeners'])) {
            if (!empty($map['listeners'])) {
                $model->listeners = [];
                $n                = 0;
                foreach ($map['listeners'] as $item) {
                    $model->listeners[$n++] = null !== $item ? LoadBalancerListener::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['load_balancer_iaas_id'])) {
            $model->loadBalancerIaasId = $map['load_balancer_iaas_id'];
        }
        if (isset($map['load_balancer_name'])) {
            $model->loadBalancerName = $map['load_balancer_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['spanner_cluster_id'])) {
            $model->spannerClusterId = $map['spanner_cluster_id'];
        }
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['cell_slb_iaas_id_map'])) {
            if (!empty($map['cell_slb_iaas_id_map'])) {
                $model->cellSlbIaasIdMap = [];
                $n                       = 0;
                foreach ($map['cell_slb_iaas_id_map'] as $item) {
                    $model->cellSlbIaasIdMap[$n++] = null !== $item ? MapStringToString::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cell_lb_vip_map'])) {
            if (!empty($map['cell_lb_vip_map'])) {
                $model->cellLbVipMap = [];
                $n                   = 0;
                foreach ($map['cell_lb_vip_map'] as $item) {
                    $model->cellLbVipMap[$n++] = null !== $item ? MapStringToString::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['use_fed_loadbalancer'])) {
            $model->useFedLoadbalancer = $map['use_fed_loadbalancer'];
        }
        if (isset($map['fed_loadbalancer_name'])) {
            $model->fedLoadbalancerName = $map['fed_loadbalancer_name'];
        }
        if (isset($map['enable_graceful_shutdown_waiting'])) {
            $model->enableGracefulShutdownWaiting = $map['enable_graceful_shutdown_waiting'];
        }
        if (isset($map['graceful_shutdown_waiting_time'])) {
            $model->gracefulShutdownWaitingTime = $map['graceful_shutdown_waiting_time'];
        }
        if (isset($map['enable_in_cluster_forward_optimization'])) {
            $model->enableInClusterForwardOptimization = $map['enable_in_cluster_forward_optimization'];
        }

        return $model;
    }
}
