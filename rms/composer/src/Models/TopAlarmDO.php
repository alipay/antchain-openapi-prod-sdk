<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TopAlarmDO extends Model
{
    // error
    /**
     * @example error
     *
     * @var string
     */
    public $error;

    // error_count
    /**
     * @example error_count
     *
     * @var int
     */
    public $errorCount;

    // warn
    /**
     * @example warn
     *
     * @var string
     */
    public $warn;

    // warn_count
    /**
     * @example warn_count
     *
     * @var int
     */
    public $warnCount;

    // alarm_level
    /**
     * @example alarm_level
     *
     * @var int
     */
    public $alarmLevel;

    // max_alarm_count
    /**
     * @example max_alarm_count
     *
     * @var int
     */
    public $maxAlarmCount;

    // emergency_copy
    /**
     * @example emergency_copy
     *
     * @var string
     */
    public $emergencyCopy;

    // emergency_url
    /**
     * @example emergency_url
     *
     * @var string
     */
    public $emergencyUrl;
    protected $_name = [
        'error'         => 'error',
        'errorCount'    => 'error_count',
        'warn'          => 'warn',
        'warnCount'     => 'warn_count',
        'alarmLevel'    => 'alarm_level',
        'maxAlarmCount' => 'max_alarm_count',
        'emergencyCopy' => 'emergency_copy',
        'emergencyUrl'  => 'emergency_url',
    ];

    public function validate()
    {
        Model::validateRequired('error', $this->error, true);
        Model::validateRequired('errorCount', $this->errorCount, true);
        Model::validateRequired('warn', $this->warn, true);
        Model::validateRequired('warnCount', $this->warnCount, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('maxAlarmCount', $this->maxAlarmCount, true);
        Model::validateRequired('emergencyCopy', $this->emergencyCopy, true);
        Model::validateRequired('emergencyUrl', $this->emergencyUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->error) {
            $res['error'] = $this->error;
        }
        if (null !== $this->errorCount) {
            $res['error_count'] = $this->errorCount;
        }
        if (null !== $this->warn) {
            $res['warn'] = $this->warn;
        }
        if (null !== $this->warnCount) {
            $res['warn_count'] = $this->warnCount;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->maxAlarmCount) {
            $res['max_alarm_count'] = $this->maxAlarmCount;
        }
        if (null !== $this->emergencyCopy) {
            $res['emergency_copy'] = $this->emergencyCopy;
        }
        if (null !== $this->emergencyUrl) {
            $res['emergency_url'] = $this->emergencyUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopAlarmDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error'])) {
            $model->error = $map['error'];
        }
        if (isset($map['error_count'])) {
            $model->errorCount = $map['error_count'];
        }
        if (isset($map['warn'])) {
            $model->warn = $map['warn'];
        }
        if (isset($map['warn_count'])) {
            $model->warnCount = $map['warn_count'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['max_alarm_count'])) {
            $model->maxAlarmCount = $map['max_alarm_count'];
        }
        if (isset($map['emergency_copy'])) {
            $model->emergencyCopy = $map['emergency_copy'];
        }
        if (isset($map['emergency_url'])) {
            $model->emergencyUrl = $map['emergency_url'];
        }

        return $model;
    }
}
