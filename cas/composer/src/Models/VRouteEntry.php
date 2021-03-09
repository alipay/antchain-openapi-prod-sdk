<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VRouteEntry extends Model
{
    // 路由条目的目标网段。
    /**
     * @example 192.168.0.1/24
     *
     * @var string
     */
    public $desinationCidrBlock;

    // 下一跳的实例ID。
    /**
     * @example ri-2zeo3xzyf38r4urzd****
     *
     * @var string
     */
    public $instanceId;

    // 下一跳的实例名称。
    /**
     * @example instanceName
     *
     * @var string
     */
    public $instanceName;

    // 路由条目ID。
    /**
     * @example rte-bp1mnnr2al0naomnpxxx
     *
     * @var string
     */
    public $nextHopId;

    // 路由的下一跳列表。
    /**
     * @example
     *
     * @var NextHopItem[]
     */
    public $nextHopItemList;

    // 路由类型。
    //
    // local：交换机路由。
    // service：云服务路由。
    // classicLink：开启ClassicLink功能后系统自动添加的路由。
    /**
     * @example local
     *
     * @var string
     */
    public $nextHopType;

    // 路由条目所属路由表的ID。
    /**
     * @example vtb-bp145q7glnuzdvzu2****
     *
     * @var string
     */
    public $routeTableId;

    //
    // 路由条目的状态。
    //
    // Pending：配置中。
    // Available：可用。
    // Modifying：修改中。
    /**
     * @example Pending
     *
     * @var string
     */
    public $status;

    // 路由条目的类型。
    //
    // System：系统路由。
    // Custom：自定义路由。
    // BGP：BGP路由。
    //
    /**
     * @example System
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'desinationCidrBlock' => 'desination_cidr_block',
        'instanceId'          => 'instance_id',
        'instanceName'        => 'instance_name',
        'nextHopId'           => 'next_hop_id',
        'nextHopItemList'     => 'next_hop_item_list',
        'nextHopType'         => 'next_hop_type',
        'routeTableId'        => 'route_table_id',
        'status'              => 'status',
        'type'                => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->desinationCidrBlock) {
            $res['desination_cidr_block'] = $this->desinationCidrBlock;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->nextHopId) {
            $res['next_hop_id'] = $this->nextHopId;
        }
        if (null !== $this->nextHopItemList) {
            $res['next_hop_item_list'] = [];
            if (null !== $this->nextHopItemList && \is_array($this->nextHopItemList)) {
                $n = 0;
                foreach ($this->nextHopItemList as $item) {
                    $res['next_hop_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nextHopType) {
            $res['next_hop_type'] = $this->nextHopType;
        }
        if (null !== $this->routeTableId) {
            $res['route_table_id'] = $this->routeTableId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VRouteEntry
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['desination_cidr_block'])) {
            $model->desinationCidrBlock = $map['desination_cidr_block'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['next_hop_id'])) {
            $model->nextHopId = $map['next_hop_id'];
        }
        if (isset($map['next_hop_item_list'])) {
            if (!empty($map['next_hop_item_list'])) {
                $model->nextHopItemList = [];
                $n                      = 0;
                foreach ($map['next_hop_item_list'] as $item) {
                    $model->nextHopItemList[$n++] = null !== $item ? NextHopItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['next_hop_type'])) {
            $model->nextHopType = $map['next_hop_type'];
        }
        if (isset($map['route_table_id'])) {
            $model->routeTableId = $map['route_table_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
