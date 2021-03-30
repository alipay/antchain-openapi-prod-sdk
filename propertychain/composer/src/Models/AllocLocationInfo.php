<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AllocLocationInfo extends Model
{
    // 仓位ID
    /**
     * @example locationId
     *
     * @var string
     */
    public $locationId;

    // 仓位名称
    /**
     * @example locationName
     *
     * @var string
     */
    public $locationName;

    // 仓位容量
    /**
     * @example 100
     *
     * @var int
     */
    public $capacity;

    // 已用容量
    /**
     * @example 10.55
     *
     * @var string
     */
    public $usedCapacity;

    // 监控等级【VIDEOREGULATORY：视频监控】
    /**
     * @example VIDEOREGULATORY
     *
     * @var string
     */
    public $monitorCapacity;

    // 监控水平【STANDARD：标准版，UPGRADED：升级版】
    /**
     * @example STANDARD
     *
     * @var string
     */
    public $monitorLevel;
    protected $_name = [
        'locationId'      => 'location_id',
        'locationName'    => 'location_name',
        'capacity'        => 'capacity',
        'usedCapacity'    => 'used_capacity',
        'monitorCapacity' => 'monitor_capacity',
        'monitorLevel'    => 'monitor_level',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->locationId) {
            $res['location_id'] = $this->locationId;
        }
        if (null !== $this->locationName) {
            $res['location_name'] = $this->locationName;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->usedCapacity) {
            $res['used_capacity'] = $this->usedCapacity;
        }
        if (null !== $this->monitorCapacity) {
            $res['monitor_capacity'] = $this->monitorCapacity;
        }
        if (null !== $this->monitorLevel) {
            $res['monitor_level'] = $this->monitorLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllocLocationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location_id'])) {
            $model->locationId = $map['location_id'];
        }
        if (isset($map['location_name'])) {
            $model->locationName = $map['location_name'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['used_capacity'])) {
            $model->usedCapacity = $map['used_capacity'];
        }
        if (isset($map['monitor_capacity'])) {
            $model->monitorCapacity = $map['monitor_capacity'];
        }
        if (isset($map['monitor_level'])) {
            $model->monitorLevel = $map['monitor_level'];
        }

        return $model;
    }
}
