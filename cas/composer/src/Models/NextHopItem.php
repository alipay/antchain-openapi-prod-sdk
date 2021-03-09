<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class NextHopItem extends Model
{
    //
    // 下一跳的类型。
    //
    // Instance：ECS实例。
    // HaVip：高可用虚拟IP。
    // VpnGateway：VPN网关。
    // NatGateway：NAT网关。
    // NetworkInterface：辅助弹性网卡。
    // RouterInterface：路由器接口。
    // IPv6Gateway：IPv6网关。
    /**
     * @example HaVip
     *
     * @var string
     */
    public $nextHopType;

    // 下一跳实例的ID。
    /**
     * @example ri-2zeo3xzyf38r4urzdpvqw
     *
     * @var string
     */
    public $nextHopId;

    // 是否启用下一跳。
    //
    // 0：不启用。
    // 1：启用。
    /**
     * @example 0
     *
     * @var int
     */
    public $enable;

    // 下一跳的路由权重。
    /**
     * @example 80
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'nextHopType' => 'next_hop_type',
        'nextHopId'   => 'next_hop_id',
        'enable'      => 'enable',
        'weight'      => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nextHopType) {
            $res['next_hop_type'] = $this->nextHopType;
        }
        if (null !== $this->nextHopId) {
            $res['next_hop_id'] = $this->nextHopId;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NextHopItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['next_hop_type'])) {
            $model->nextHopType = $map['next_hop_type'];
        }
        if (isset($map['next_hop_id'])) {
            $model->nextHopId = $map['next_hop_id'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
