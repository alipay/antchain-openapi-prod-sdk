<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RouteTable extends Model
{
    // 路由表的创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $creationTime;

    // 路由表所属的路由器类型，取值：
    //
    // VRouter：VPC路由器。
    // VBR：边界路由器。
    /**
     * @example VRouter
     *
     * @var string
     */
    public $routerType;

    //
    // 路由条目的详细信息。
    /**
     * @example
     *
     * @var VRouteEntry[]
     */
    public $entryVOs;

    // 要查询的路由表的ID。
    /**
     * @example rtb-bp12mw1f8k3jgygk9****
     *
     * @var string
     */
    public $routeTableId;

    // 要查询的路由表所属的VPC路由器的ID。
    /**
     * @example vtb-bp1krxxzp0c29fmon****
     *
     * @var string
     */
    public $vRouterId;
    protected $_name = [
        'creationTime' => 'creation_time',
        'routerType'   => 'router_type',
        'entryVOs'     => 'entry_v_os',
        'routeTableId' => 'route_table_id',
        'vRouterId'    => 'v_router_id',
    ];

    public function validate()
    {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->routerType) {
            $res['router_type'] = $this->routerType;
        }
        if (null !== $this->entryVOs) {
            $res['entry_v_os'] = [];
            if (null !== $this->entryVOs && \is_array($this->entryVOs)) {
                $n = 0;
                foreach ($this->entryVOs as $item) {
                    $res['entry_v_os'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->routeTableId) {
            $res['route_table_id'] = $this->routeTableId;
        }
        if (null !== $this->vRouterId) {
            $res['v_router_id'] = $this->vRouterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouteTable
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['router_type'])) {
            $model->routerType = $map['router_type'];
        }
        if (isset($map['entry_v_os'])) {
            if (!empty($map['entry_v_os'])) {
                $model->entryVOs = [];
                $n               = 0;
                foreach ($map['entry_v_os'] as $item) {
                    $model->entryVOs[$n++] = null !== $item ? VRouteEntry::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['route_table_id'])) {
            $model->routeTableId = $map['route_table_id'];
        }
        if (isset($map['v_router_id'])) {
            $model->vRouterId = $map['v_router_id'];
        }

        return $model;
    }
}
