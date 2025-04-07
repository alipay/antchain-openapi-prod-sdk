<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripStatisticsView extends Model
{
    // 过去七天内所有行驶记录的总里程	，单位km
    /**
     * @example 20km
     *
     * @var string
     */
    public $totalDistance;

    // 行驶总用时
    /**
     * @example 3
     *
     * @var string
     */
    public $totalDuration;

    // 骑行次数
    /**
     * @example 2
     *
     * @var string
     */
    public $tripCount;

    // 最近一次行驶的里程
    /**
     * @example 2
     *
     * @var string
     */
    public $lastTripDistance;

    // 最近一次行驶的平均速度	，单位  km/h
    /**
     * @example 45
     *
     * @var string
     */
    public $lastTripAvgSpeed;

    // 最近一次行驶的最大速度
    /**
     * @example 50
     *
     * @var string
     */
    public $lastTripMaxSpeed;

    // 最后一次行驶用时
    /**
     * @example 8
     *
     * @var string
     */
    public $lastTripSpendTime;
    protected $_name = [
        'totalDistance'     => 'total_distance',
        'totalDuration'     => 'total_duration',
        'tripCount'         => 'trip_count',
        'lastTripDistance'  => 'last_trip_distance',
        'lastTripAvgSpeed'  => 'last_trip_avg_speed',
        'lastTripMaxSpeed'  => 'last_trip_max_speed',
        'lastTripSpendTime' => 'last_trip_spend_time',
    ];

    public function validate()
    {
        Model::validateRequired('totalDistance', $this->totalDistance, true);
        Model::validateRequired('totalDuration', $this->totalDuration, true);
        Model::validateRequired('tripCount', $this->tripCount, true);
        Model::validateRequired('lastTripDistance', $this->lastTripDistance, true);
        Model::validateRequired('lastTripAvgSpeed', $this->lastTripAvgSpeed, true);
        Model::validateRequired('lastTripMaxSpeed', $this->lastTripMaxSpeed, true);
        Model::validateRequired('lastTripSpendTime', $this->lastTripSpendTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalDistance) {
            $res['total_distance'] = $this->totalDistance;
        }
        if (null !== $this->totalDuration) {
            $res['total_duration'] = $this->totalDuration;
        }
        if (null !== $this->tripCount) {
            $res['trip_count'] = $this->tripCount;
        }
        if (null !== $this->lastTripDistance) {
            $res['last_trip_distance'] = $this->lastTripDistance;
        }
        if (null !== $this->lastTripAvgSpeed) {
            $res['last_trip_avg_speed'] = $this->lastTripAvgSpeed;
        }
        if (null !== $this->lastTripMaxSpeed) {
            $res['last_trip_max_speed'] = $this->lastTripMaxSpeed;
        }
        if (null !== $this->lastTripSpendTime) {
            $res['last_trip_spend_time'] = $this->lastTripSpendTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripStatisticsView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_distance'])) {
            $model->totalDistance = $map['total_distance'];
        }
        if (isset($map['total_duration'])) {
            $model->totalDuration = $map['total_duration'];
        }
        if (isset($map['trip_count'])) {
            $model->tripCount = $map['trip_count'];
        }
        if (isset($map['last_trip_distance'])) {
            $model->lastTripDistance = $map['last_trip_distance'];
        }
        if (isset($map['last_trip_avg_speed'])) {
            $model->lastTripAvgSpeed = $map['last_trip_avg_speed'];
        }
        if (isset($map['last_trip_max_speed'])) {
            $model->lastTripMaxSpeed = $map['last_trip_max_speed'];
        }
        if (isset($map['last_trip_spend_time'])) {
            $model->lastTripSpendTime = $map['last_trip_spend_time'];
        }

        return $model;
    }
}
