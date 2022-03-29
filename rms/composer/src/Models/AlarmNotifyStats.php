<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmNotifyStats extends Model
{
    // alarm_time
    /**
     * @example alarm_time
     *
     * @var int
     */
    public $alarmTime;

    // count
    /**
     * @example count
     *
     * @var int
     */
    public $count;

    // notify_channel
    /**
     * @example notify_channel
     *
     * @var string
     */
    public $notifyChannel;
    protected $_name = [
        'alarmTime'     => 'alarm_time',
        'count'         => 'count',
        'notifyChannel' => 'notify_channel',
    ];

    public function validate()
    {
        Model::validateRequired('alarmTime', $this->alarmTime, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('notifyChannel', $this->notifyChannel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->notifyChannel) {
            $res['notify_channel'] = $this->notifyChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmNotifyStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['notify_channel'])) {
            $model->notifyChannel = $map['notify_channel'];
        }

        return $model;
    }
}
