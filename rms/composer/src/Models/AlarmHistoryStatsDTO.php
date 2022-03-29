<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmHistoryStatsDTO extends Model
{
    // alarm_time
    /**
     * @example alarm_time
     *
     * @var int
     */
    public $alarmTime;

    // alarm_level
    /**
     * @example alarm_level
     *
     * @var int
     */
    public $alarmLevel;

    // count
    /**
     * @example count
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
        Model::validateRequired('alarmTime', $this->alarmTime, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('count', $this->count, true);
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
     * @return AlarmHistoryStatsDTO
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
