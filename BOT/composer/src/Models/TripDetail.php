<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripDetail extends Model
{
    // 行程id
    /**
     * @example T20251210140000001
     *
     * @var string
     */
    public $tripId;

    // 开始时间
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $startTime;

    // 结束时间
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $endTime;

    // 行驶里程
    /**
     * @example 36.9
     *
     * @var string
     */
    public $mileage;

    // 单次用时
    /**
     * @example "duration":{ "value":"79", "unit":"h" },
     *
     * @var TripDuration
     */
    public $duration;

    // 最高速度
    /**
     * @example 86
     *
     * @var string
     */
    public $maxSpeed;

    // 平均速度
    /**
     * @example 32
     *
     * @var string
     */
    public $avgSpeed;

    // 开始地址
    /**
     * @example 上海市浦东新区张江高科技园区博云路
     *
     * @var string
     */
    public $firstAddress;

    // 结束地址
    /**
     * @example 上海市浦东新区张江高科技园区博云路
     *
     * @var string
     */
    public $lastAddress;

    // 最开始定位时间
    /**
     * @example 1733841605000
     *
     * @var int
     */
    public $firstLocationTime;

    // 最后结束定位时间
    /**
     * @example 1733845195000
     *
     * @var int
     */
    public $lastLocationTime;
    protected $_name = [
        'tripId'            => 'trip_id',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'mileage'           => 'mileage',
        'duration'          => 'duration',
        'maxSpeed'          => 'max_speed',
        'avgSpeed'          => 'avg_speed',
        'firstAddress'      => 'first_address',
        'lastAddress'       => 'last_address',
        'firstLocationTime' => 'first_location_time',
        'lastLocationTime'  => 'last_location_time',
    ];

    public function validate()
    {
        Model::validateRequired('tripId', $this->tripId, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('mileage', $this->mileage, true);
        Model::validateRequired('duration', $this->duration, true);
        Model::validateRequired('maxSpeed', $this->maxSpeed, true);
        Model::validateRequired('avgSpeed', $this->avgSpeed, true);
        Model::validateRequired('firstAddress', $this->firstAddress, true);
        Model::validateRequired('lastAddress', $this->lastAddress, true);
        Model::validateRequired('firstLocationTime', $this->firstLocationTime, true);
        Model::validateRequired('lastLocationTime', $this->lastLocationTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tripId) {
            $res['trip_id'] = $this->tripId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->mileage) {
            $res['mileage'] = $this->mileage;
        }
        if (null !== $this->duration) {
            $res['duration'] = null !== $this->duration ? $this->duration->toMap() : null;
        }
        if (null !== $this->maxSpeed) {
            $res['max_speed'] = $this->maxSpeed;
        }
        if (null !== $this->avgSpeed) {
            $res['avg_speed'] = $this->avgSpeed;
        }
        if (null !== $this->firstAddress) {
            $res['first_address'] = $this->firstAddress;
        }
        if (null !== $this->lastAddress) {
            $res['last_address'] = $this->lastAddress;
        }
        if (null !== $this->firstLocationTime) {
            $res['first_location_time'] = $this->firstLocationTime;
        }
        if (null !== $this->lastLocationTime) {
            $res['last_location_time'] = $this->lastLocationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trip_id'])) {
            $model->tripId = $map['trip_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['mileage'])) {
            $model->mileage = $map['mileage'];
        }
        if (isset($map['duration'])) {
            $model->duration = TripDuration::fromMap($map['duration']);
        }
        if (isset($map['max_speed'])) {
            $model->maxSpeed = $map['max_speed'];
        }
        if (isset($map['avg_speed'])) {
            $model->avgSpeed = $map['avg_speed'];
        }
        if (isset($map['first_address'])) {
            $model->firstAddress = $map['first_address'];
        }
        if (isset($map['last_address'])) {
            $model->lastAddress = $map['last_address'];
        }
        if (isset($map['first_location_time'])) {
            $model->firstLocationTime = $map['first_location_time'];
        }
        if (isset($map['last_location_time'])) {
            $model->lastLocationTime = $map['last_location_time'];
        }

        return $model;
    }
}
