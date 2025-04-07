<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripView extends Model
{
    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tripBeginTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tripEndTime;

    // 行驶公里数
    /**
     * @example 22
     *
     * @var int
     */
    public $tripTotalDistance;

    // 用时
    /**
     * @example
     *
     * @var int
     */
    public $tripTime;
    protected $_name = [
        'tripBeginTime'     => 'trip_begin_time',
        'tripEndTime'       => 'trip_end_time',
        'tripTotalDistance' => 'trip_total_distance',
        'tripTime'          => 'trip_time',
    ];

    public function validate()
    {
        Model::validateRequired('tripBeginTime', $this->tripBeginTime, true);
        Model::validateRequired('tripEndTime', $this->tripEndTime, true);
        Model::validateRequired('tripTotalDistance', $this->tripTotalDistance, true);
        Model::validateRequired('tripTime', $this->tripTime, true);
        Model::validatePattern('tripBeginTime', $this->tripBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tripEndTime', $this->tripEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tripBeginTime) {
            $res['trip_begin_time'] = $this->tripBeginTime;
        }
        if (null !== $this->tripEndTime) {
            $res['trip_end_time'] = $this->tripEndTime;
        }
        if (null !== $this->tripTotalDistance) {
            $res['trip_total_distance'] = $this->tripTotalDistance;
        }
        if (null !== $this->tripTime) {
            $res['trip_time'] = $this->tripTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trip_begin_time'])) {
            $model->tripBeginTime = $map['trip_begin_time'];
        }
        if (isset($map['trip_end_time'])) {
            $model->tripEndTime = $map['trip_end_time'];
        }
        if (isset($map['trip_total_distance'])) {
            $model->tripTotalDistance = $map['trip_total_distance'];
        }
        if (isset($map['trip_time'])) {
            $model->tripTime = $map['trip_time'];
        }

        return $model;
    }
}
