<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripStatistics extends Model
{
    // 行驶天数
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tripDay;

    // 总里程
    /**
     * @example 12
     *
     * @var int
     */
    public $totalDistance;

    // 总用时
    /**
     * @example 2
     *
     * @var int
     */
    public $totalDuration;

    // 行驶次数
    /**
     * @example 12
     *
     * @var int
     */
    public $tripCount;
    protected $_name = [
        'tripDay'       => 'trip_day',
        'totalDistance' => 'total_distance',
        'totalDuration' => 'total_duration',
        'tripCount'     => 'trip_count',
    ];

    public function validate()
    {
        Model::validateRequired('tripDay', $this->tripDay, true);
        Model::validateRequired('totalDistance', $this->totalDistance, true);
        Model::validateRequired('totalDuration', $this->totalDuration, true);
        Model::validateRequired('tripCount', $this->tripCount, true);
        Model::validatePattern('tripDay', $this->tripDay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tripDay) {
            $res['trip_day'] = $this->tripDay;
        }
        if (null !== $this->totalDistance) {
            $res['total_distance'] = $this->totalDistance;
        }
        if (null !== $this->totalDuration) {
            $res['total_duration'] = $this->totalDuration;
        }
        if (null !== $this->tripCount) {
            $res['trip_count'] = $this->tripCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trip_day'])) {
            $model->tripDay = $map['trip_day'];
        }
        if (isset($map['total_distance'])) {
            $model->totalDistance = $map['total_distance'];
        }
        if (isset($map['total_duration'])) {
            $model->totalDuration = $map['total_duration'];
        }
        if (isset($map['trip_count'])) {
            $model->tripCount = $map['trip_count'];
        }

        return $model;
    }
}
