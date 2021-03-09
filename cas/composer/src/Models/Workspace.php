<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Workspace extends Model
{
    // id
    /**
     * @example 12345
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example prod
     *
     * @var string
     */
    public $name;

    // 网络类型
    /**
     * @example VPC
     *
     * @var string
     */
    public $networkType;

    // 租户
    /**
     * @example XDOE
     *
     * @var string
     */
    public $tenant;

    // 可用区 id
    /**
     * @example ["12345"]
     *
     * @var string
     */
    public $zoneIds;

    // region id
    /**
     * @example 123456
     *
     * @var string
     */
    public $regionId;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'networkType' => 'network_type',
        'tenant'      => 'tenant',
        'zoneIds'     => 'zone_ids',
        'regionId'    => 'region_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Workspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['zone_ids'])) {
            $model->zoneIds = $map['zone_ids'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
