<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Zone extends Model
{
    // 机房的标识（与阿里云对齐）
    /**
     * @example cn-hz-cm10
     *
     * @var string
     */
    public $identity;

    // 机房的名字
    /**
     * @example cm10
     *
     * @var string
     */
    public $name;

    // 地域的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $regionId;

    // 机房内关联的资源池列表
    /**
     * @example
     *
     * @var ResourcePool[]
     */
    public $resourcePools;

    // 机房的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $zoneId;

    // 显示的名字
    /**
     * @example xx机房
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'identity'      => 'identity',
        'name'          => 'name',
        'regionId'      => 'region_id',
        'resourcePools' => 'resource_pools',
        'zoneId'        => 'zone_id',
        'displayName'   => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('resourcePools', $this->resourcePools, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->resourcePools) {
            $res['resource_pools'] = [];
            if (null !== $this->resourcePools && \is_array($this->resourcePools)) {
                $n = 0;
                foreach ($this->resourcePools as $item) {
                    $res['resource_pools'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Zone
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['resource_pools'])) {
            if (!empty($map['resource_pools'])) {
                $model->resourcePools = [];
                $n                    = 0;
                foreach ($map['resource_pools'] as $item) {
                    $model->resourcePools[$n++] = null !== $item ? ResourcePool::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}
