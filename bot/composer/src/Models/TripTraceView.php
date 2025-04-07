<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripTraceView extends Model
{
    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $beginTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 平均速度
    /**
     * @example
     *
     * @var int
     */
    public $avgSpeed;

    // 最大速度
    /**
     * @example
     *
     * @var int
     */
    public $maxSpeed;

    // 最后定位时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastLocationTime;

    // 最后定位地址
    /**
     * @example 河南省郑州市
     *
     * @var string
     */
    public $lastLocation;
    protected $_name = [
        'beginTime'        => 'begin_time',
        'endTime'          => 'end_time',
        'avgSpeed'         => 'avg_speed',
        'maxSpeed'         => 'max_speed',
        'lastLocationTime' => 'last_location_time',
        'lastLocation'     => 'last_location',
    ];

    public function validate()
    {
        Model::validateRequired('beginTime', $this->beginTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('avgSpeed', $this->avgSpeed, true);
        Model::validateRequired('maxSpeed', $this->maxSpeed, true);
        Model::validateRequired('lastLocationTime', $this->lastLocationTime, true);
        Model::validateRequired('lastLocation', $this->lastLocation, true);
        Model::validatePattern('beginTime', $this->beginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastLocationTime', $this->lastLocationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->avgSpeed) {
            $res['avg_speed'] = $this->avgSpeed;
        }
        if (null !== $this->maxSpeed) {
            $res['max_speed'] = $this->maxSpeed;
        }
        if (null !== $this->lastLocationTime) {
            $res['last_location_time'] = $this->lastLocationTime;
        }
        if (null !== $this->lastLocation) {
            $res['last_location'] = $this->lastLocation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripTraceView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['avg_speed'])) {
            $model->avgSpeed = $map['avg_speed'];
        }
        if (isset($map['max_speed'])) {
            $model->maxSpeed = $map['max_speed'];
        }
        if (isset($map['last_location_time'])) {
            $model->lastLocationTime = $map['last_location_time'];
        }
        if (isset($map['last_location'])) {
            $model->lastLocation = $map['last_location'];
        }

        return $model;
    }
}
