<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class IngressConfig extends Model
{
    // 统一接入域名。
    /**
     * @example sofastack.alipay.net
     *
     * @var string
     */
    public $domain;

    // 监听及转发规则配置。
    /**
     * @example [{}]
     *
     * @var LoadBalancerListenerWithRule[]
     */
    public $listeners;

    // 关联的负载均衡实例的ID。
    /**
     * @example lb-bp1b6c719dfa08ex
     *
     * @var string
     */
    public $loadBalancerIaasId;

    // 关联负载均衡实例名称。
    /**
     * @example test-lb
     *
     * @var string
     */
    public $loadBalancerName;

    // 负载均衡网络类型。
    /**
     * @example INTRANET
     *
     * @var string
     */
    public $loadBalancerType;

    // ingress名称。
    /**
     * @example test-ingress
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

    // 统一接入协议（http|https）
    /**
     * @example [http,https]
     *
     * @var string[]
     */
    public $unifiedAccessEntries;

    // 与统一接入协议相对应的统一接入实例入端口列表
    /**
     * @example [80, 443]
     *
     * @var int[]
     */
    public $unifiedAccessEntryPorts;

    // 所属统一接入实例
    /**
     * @example uai1
     *
     * @var string
     */
    public $unifiedAccessInstanceName;

    // 统一接入实例联邦负载均衡id
    /**
     * @example fe22312213ddea
     *
     * @var string
     */
    public $unifiedAccessInstanceFederatedId;

    // 监听及转发规则配置 V2
    /**
     * @example [{}]
     *
     * @var LoadBalancerListener[]
     */
    public $listenersV2;

    // 统一接入路由模式（LDC|NONLDC）
    /**
     * @example LDC
     *
     * @var string
     */
    public $unifiedAccessRouteRule;
    protected $_name = [
        'domain'                           => 'domain',
        'listeners'                        => 'listeners',
        'loadBalancerIaasId'               => 'load_balancer_iaas_id',
        'loadBalancerName'                 => 'load_balancer_name',
        'loadBalancerType'                 => 'load_balancer_type',
        'name'                             => 'name',
        'spannerClusterId'                 => 'spanner_cluster_id',
        'unifiedAccessEntries'             => 'unified_access_entries',
        'unifiedAccessEntryPorts'          => 'unified_access_entry_ports',
        'unifiedAccessInstanceName'        => 'unified_access_instance_name',
        'unifiedAccessInstanceFederatedId' => 'unified_access_instance_federated_id',
        'listenersV2'                      => 'listeners_v2',
        'unifiedAccessRouteRule'           => 'unified_access_route_rule',
    ];

    public function validate()
    {
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
        if (null !== $this->loadBalancerType) {
            $res['load_balancer_type'] = $this->loadBalancerType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->spannerClusterId) {
            $res['spanner_cluster_id'] = $this->spannerClusterId;
        }
        if (null !== $this->unifiedAccessEntries) {
            $res['unified_access_entries'] = $this->unifiedAccessEntries;
        }
        if (null !== $this->unifiedAccessEntryPorts) {
            $res['unified_access_entry_ports'] = $this->unifiedAccessEntryPorts;
        }
        if (null !== $this->unifiedAccessInstanceName) {
            $res['unified_access_instance_name'] = $this->unifiedAccessInstanceName;
        }
        if (null !== $this->unifiedAccessInstanceFederatedId) {
            $res['unified_access_instance_federated_id'] = $this->unifiedAccessInstanceFederatedId;
        }
        if (null !== $this->listenersV2) {
            $res['listeners_v2'] = [];
            if (null !== $this->listenersV2 && \is_array($this->listenersV2)) {
                $n = 0;
                foreach ($this->listenersV2 as $item) {
                    $res['listeners_v2'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unifiedAccessRouteRule) {
            $res['unified_access_route_rule'] = $this->unifiedAccessRouteRule;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IngressConfig
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
                    $model->listeners[$n++] = null !== $item ? LoadBalancerListenerWithRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['load_balancer_iaas_id'])) {
            $model->loadBalancerIaasId = $map['load_balancer_iaas_id'];
        }
        if (isset($map['load_balancer_name'])) {
            $model->loadBalancerName = $map['load_balancer_name'];
        }
        if (isset($map['load_balancer_type'])) {
            $model->loadBalancerType = $map['load_balancer_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['spanner_cluster_id'])) {
            $model->spannerClusterId = $map['spanner_cluster_id'];
        }
        if (isset($map['unified_access_entries'])) {
            if (!empty($map['unified_access_entries'])) {
                $model->unifiedAccessEntries = $map['unified_access_entries'];
            }
        }
        if (isset($map['unified_access_entry_ports'])) {
            if (!empty($map['unified_access_entry_ports'])) {
                $model->unifiedAccessEntryPorts = $map['unified_access_entry_ports'];
            }
        }
        if (isset($map['unified_access_instance_name'])) {
            $model->unifiedAccessInstanceName = $map['unified_access_instance_name'];
        }
        if (isset($map['unified_access_instance_federated_id'])) {
            $model->unifiedAccessInstanceFederatedId = $map['unified_access_instance_federated_id'];
        }
        if (isset($map['listeners_v2'])) {
            if (!empty($map['listeners_v2'])) {
                $model->listenersV2 = [];
                $n                  = 0;
                foreach ($map['listeners_v2'] as $item) {
                    $model->listenersV2[$n++] = null !== $item ? LoadBalancerListener::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['unified_access_route_rule'])) {
            $model->unifiedAccessRouteRule = $map['unified_access_route_rule'];
        }

        return $model;
    }
}
