<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class TripInfo extends Model
{
    // tripList
    /**
     * @example METL202004041220123456
     *
     * @var string
     */
    public $tripId;

    // 开始时间
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @example 2000-10-10 00:00:00
     *
     * @var string
     */
    public $endTime;

    // 起点位置
    /**
     * @example 7FA1316252F6DDA22176ED13DBA4EF65
     *
     * @var string
     */
    public $startLocation;

    // 终点位置
    /**
     * @example 7FA1316252F6DDA22176ED13DBA4EF65
     *
     * @var string
     */
    public $endLocation;

    // 行驶里程（km）
    /**
     * @example 5
     *
     * @var string
     */
    public $mileage;
    protected $_name = [
        'tripId'        => 'trip_id',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'startLocation' => 'start_location',
        'endLocation'   => 'end_location',
        'mileage'       => 'mileage',
    ];

    public function validate()
    {
        Model::validateRequired('tripId', $this->tripId, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->startLocation) {
            $res['start_location'] = $this->startLocation;
        }
        if (null !== $this->endLocation) {
            $res['end_location'] = $this->endLocation;
        }
        if (null !== $this->mileage) {
            $res['mileage'] = $this->mileage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripInfo
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
        if (isset($map['start_location'])) {
            $model->startLocation = $map['start_location'];
        }
        if (isset($map['end_location'])) {
            $model->endLocation = $map['end_location'];
        }
        if (isset($map['mileage'])) {
            $model->mileage = $map['mileage'];
        }

        return $model;
    }
}
