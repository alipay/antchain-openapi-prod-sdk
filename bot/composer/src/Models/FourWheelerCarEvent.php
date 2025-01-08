<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class FourWheelerCarEvent extends Model
{
    // 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
    /**
     * @example 1
     *
     * @var string
     */
    public $eventType;

    // 驾驶事件的结束时间
    /**
     * @example 1736152040551
     *
     * @var int
     */
    public $endTime;

    // 驾驶事件发生地点的经度坐标
    /**
     * @example 121.4737
     *
     * @var string
     */
    public $lng;

    // 驾驶事件发生地点的纬度坐标
    /**
     * @example 31.2304
     *
     * @var string
     */
    public $lat;

    // 驾驶事件开始的速度
    /**
     * @example 60
     *
     * @var string
     */
    public $startSpeed;

    // 驾驶事件结束时的速度
    /**
     * @example 45
     *
     * @var string
     */
    public $endSpeed;

    // 驾驶过程中的平均速度
    /**
     * @example 52.5
     *
     * @var string
     */
    public $averageSpeed;

    // 驾驶过程中车辆的转弯角度
    /**
     * @example 90
     *
     * @var string
     */
    public $turningAngle;

    // 驾驶事件的持续时间（以秒为单位)
    /**
     * @example 10
     *
     * @var string
     */
    public $duration;
    protected $_name = [
        'eventType'    => 'event_type',
        'endTime'      => 'end_time',
        'lng'          => 'lng',
        'lat'          => 'lat',
        'startSpeed'   => 'start_speed',
        'endSpeed'     => 'end_speed',
        'averageSpeed' => 'average_speed',
        'turningAngle' => 'turning_angle',
        'duration'     => 'duration',
    ];

    public function validate()
    {
        Model::validateRequired('eventType', $this->eventType, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('lng', $this->lng, true);
        Model::validateRequired('lat', $this->lat, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventType) {
            $res['event_type'] = $this->eventType;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->lng) {
            $res['lng'] = $this->lng;
        }
        if (null !== $this->lat) {
            $res['lat'] = $this->lat;
        }
        if (null !== $this->startSpeed) {
            $res['start_speed'] = $this->startSpeed;
        }
        if (null !== $this->endSpeed) {
            $res['end_speed'] = $this->endSpeed;
        }
        if (null !== $this->averageSpeed) {
            $res['average_speed'] = $this->averageSpeed;
        }
        if (null !== $this->turningAngle) {
            $res['turning_angle'] = $this->turningAngle;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FourWheelerCarEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['event_type'])) {
            $model->eventType = $map['event_type'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['lng'])) {
            $model->lng = $map['lng'];
        }
        if (isset($map['lat'])) {
            $model->lat = $map['lat'];
        }
        if (isset($map['start_speed'])) {
            $model->startSpeed = $map['start_speed'];
        }
        if (isset($map['end_speed'])) {
            $model->endSpeed = $map['end_speed'];
        }
        if (isset($map['average_speed'])) {
            $model->averageSpeed = $map['average_speed'];
        }
        if (isset($map['turning_angle'])) {
            $model->turningAngle = $map['turning_angle'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }

        return $model;
    }
}
