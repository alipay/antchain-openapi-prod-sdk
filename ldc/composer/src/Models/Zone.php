<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Zone extends Model
{
    // 数据中心名
    /**
     * @example test_idc
     *
     * @var string
     */
    public $dataCenter;

    // 可用区展示名
    /**
     * @example 测试-杭州-A
     *
     * @var string
     */
    public $displayName;

    // 可用区名
    /**
     * @example cn-hangzhou-a
     *
     * @var string
     */
    public $name;

    // 所属地域
    /**
     * @example hangzhou
     *
     * @var string
     */
    public $region;

    // 可用区id
    /**
     * @example 00000001
     *
     * @var string
     */
    public $zoneId;

    // 地域id
    /**
     * @example 000000001
     *
     * @var string
     */
    public $regionId;
    protected $_name = [
        'dataCenter'  => 'data_center',
        'displayName' => 'display_name',
        'name'        => 'name',
        'region'      => 'region',
        'zoneId'      => 'zone_id',
        'regionId'    => 'region_id',
    ];

    public function validate()
    {
        Model::validateRequired('dataCenter', $this->dataCenter, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('regionId', $this->regionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataCenter) {
            $res['data_center'] = $this->dataCenter;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
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
        if (isset($map['data_center'])) {
            $model->dataCenter = $map['data_center'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
