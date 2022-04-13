<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedLoadBalancer extends Model
{
    // 联邦负载均衡实例名称
    /**
     * @example fed-lb-example
     *
     * @var string
     */
    public $name;

    // 地址类型，比如公网、内网
    /**
     * @example internet, intranet
     *
     * @var string
     */
    public $addrType;

    // 联邦负载均衡实例的状态，由多个local 负载均衡实例的状态汇聚计算而来
    /**
     * @example success
     *
     * @var string
     */
    public $state;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // 关联的应用服务情况
    /**
     * @example
     *
     * @var FedLoadBalancerContainerServiceRel[]
     */
    public $containerServicesInfo;

    // local lb实例信息
    /**
     * @example
     *
     * @var LocalLoadBalancer[]
     */
    public $localLoadbalancerInstances;
    protected $_name = [
        'name'                       => 'name',
        'addrType'                   => 'addr_type',
        'state'                      => 'state',
        'createTime'                 => 'create_time',
        'containerServicesInfo'      => 'container_services_info',
        'localLoadbalancerInstances' => 'local_loadbalancer_instances',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('addrType', $this->addrType, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->addrType) {
            $res['addr_type'] = $this->addrType;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->containerServicesInfo) {
            $res['container_services_info'] = [];
            if (null !== $this->containerServicesInfo && \is_array($this->containerServicesInfo)) {
                $n = 0;
                foreach ($this->containerServicesInfo as $item) {
                    $res['container_services_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->localLoadbalancerInstances) {
            $res['local_loadbalancer_instances'] = [];
            if (null !== $this->localLoadbalancerInstances && \is_array($this->localLoadbalancerInstances)) {
                $n = 0;
                foreach ($this->localLoadbalancerInstances as $item) {
                    $res['local_loadbalancer_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedLoadBalancer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['addr_type'])) {
            $model->addrType = $map['addr_type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['container_services_info'])) {
            if (!empty($map['container_services_info'])) {
                $model->containerServicesInfo = [];
                $n                            = 0;
                foreach ($map['container_services_info'] as $item) {
                    $model->containerServicesInfo[$n++] = null !== $item ? FedLoadBalancerContainerServiceRel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['local_loadbalancer_instances'])) {
            if (!empty($map['local_loadbalancer_instances'])) {
                $model->localLoadbalancerInstances = [];
                $n                                 = 0;
                foreach ($map['local_loadbalancer_instances'] as $item) {
                    $model->localLoadbalancerInstances[$n++] = null !== $item ? LocalLoadBalancer::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
