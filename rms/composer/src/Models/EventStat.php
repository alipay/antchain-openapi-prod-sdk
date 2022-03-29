<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class EventStat extends Model
{
    // 告警时间
    /**
     * @example
     *
     * @var int
     */
    public $alarmTime;

    // 告警等级
    /**
     * @example
     *
     * @var int
     */
    public $alarmLevel;

    // 告警统计数
    /**
     * @example
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'alarmTime'  => 'alarm_time',
        'alarmLevel' => 'alarm_level',
        'count'      => 'count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventStat
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
