<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServiceInfo extends Model
{
    // 元信息
    /**
     * @example
     *
     * @var ContainerServiceObjectMeta
     */
    public $meta;

    // Service 类型
    /**
     * @example LoadBalancer
     *
     * @var string
     */
    public $type;

    // 负载均衡服务的网络类型（internet | intranet | office | multidomain）
    /**
     * @example intranet
     *
     * @var string
     */
    public $loadBalancerAddressType;

    // Service 状态
    /**
     * @example
     *
     * @var ServiceStatus
     */
    public $status;

    // service端口映射列表
    /**
     * @example [{}, {}]
     *
     * @var ServicePort[]
     */
    public $ports;
    protected $_name = [
        'meta'                    => 'meta',
        'type'                    => 'type',
        'loadBalancerAddressType' => 'load_balancer_address_type',
        'status'                  => 'status',
        'ports'                   => 'ports',
    ];

    public function validate()
    {
        Model::validateRequired('meta', $this->meta, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->meta) {
            $res['meta'] = null !== $this->meta ? $this->meta->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->loadBalancerAddressType) {
            $res['load_balancer_address_type'] = $this->loadBalancerAddressType;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }
        if (null !== $this->ports) {
            $res['ports'] = [];
            if (null !== $this->ports && \is_array($this->ports)) {
                $n = 0;
                foreach ($this->ports as $item) {
                    $res['ports'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['meta'])) {
            $model->meta = ContainerServiceObjectMeta::fromMap($map['meta']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['load_balancer_address_type'])) {
            $model->loadBalancerAddressType = $map['load_balancer_address_type'];
        }
        if (isset($map['status'])) {
            $model->status = ServiceStatus::fromMap($map['status']);
        }
        if (isset($map['ports'])) {
            if (!empty($map['ports'])) {
                $model->ports = [];
                $n            = 0;
                foreach ($map['ports'] as $item) {
                    $model->ports[$n++] = null !== $item ? ServicePort::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
