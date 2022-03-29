<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmOverviewDTO extends Model
{
    // level1_alarm_count
    /**
     * @example level1_alarm_count
     *
     * @var int
     */
    public $level1AlarmCount;

    // level2_alarm_count
    /**
     * @example level2_alarm_count
     *
     * @var int
     */
    public $level2AlarmCount;

    // level3_alarm_count
    /**
     * @example level3_alarm_count
     *
     * @var int
     */
    public $level3AlarmCount;

    // alarm_sub_count
    /**
     * @example alarm_sub_count
     *
     * @var int
     */
    public $alarmSubCount;

    // alarm_pkg_count
    /**
     * @example alarm_pkg_count
     *
     * @var int
     */
    public $alarmPkgCount;

    // recent_alarms
    /**
     * @example recent_alarms
     *
     * @var AlarmHistoryDTO[]
     */
    public $recentAlarms;
    protected $_name = [
        'level1AlarmCount' => 'level1_alarm_count',
        'level2AlarmCount' => 'level2_alarm_count',
        'level3AlarmCount' => 'level3_alarm_count',
        'alarmSubCount'    => 'alarm_sub_count',
        'alarmPkgCount'    => 'alarm_pkg_count',
        'recentAlarms'     => 'recent_alarms',
    ];

    public function validate()
    {
        Model::validateRequired('level1AlarmCount', $this->level1AlarmCount, true);
        Model::validateRequired('level2AlarmCount', $this->level2AlarmCount, true);
        Model::validateRequired('level3AlarmCount', $this->level3AlarmCount, true);
        Model::validateRequired('alarmSubCount', $this->alarmSubCount, true);
        Model::validateRequired('alarmPkgCount', $this->alarmPkgCount, true);
        Model::validateRequired('recentAlarms', $this->recentAlarms, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->level1AlarmCount) {
            $res['level1_alarm_count'] = $this->level1AlarmCount;
        }
        if (null !== $this->level2AlarmCount) {
            $res['level2_alarm_count'] = $this->level2AlarmCount;
        }
        if (null !== $this->level3AlarmCount) {
            $res['level3_alarm_count'] = $this->level3AlarmCount;
        }
        if (null !== $this->alarmSubCount) {
            $res['alarm_sub_count'] = $this->alarmSubCount;
        }
        if (null !== $this->alarmPkgCount) {
            $res['alarm_pkg_count'] = $this->alarmPkgCount;
        }
        if (null !== $this->recentAlarms) {
            $res['recent_alarms'] = [];
            if (null !== $this->recentAlarms && \is_array($this->recentAlarms)) {
                $n = 0;
                foreach ($this->recentAlarms as $item) {
                    $res['recent_alarms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmOverviewDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['level1_alarm_count'])) {
            $model->level1AlarmCount = $map['level1_alarm_count'];
        }
        if (isset($map['level2_alarm_count'])) {
            $model->level2AlarmCount = $map['level2_alarm_count'];
        }
        if (isset($map['level3_alarm_count'])) {
            $model->level3AlarmCount = $map['level3_alarm_count'];
        }
        if (isset($map['alarm_sub_count'])) {
            $model->alarmSubCount = $map['alarm_sub_count'];
        }
        if (isset($map['alarm_pkg_count'])) {
            $model->alarmPkgCount = $map['alarm_pkg_count'];
        }
        if (isset($map['recent_alarms'])) {
            if (!empty($map['recent_alarms'])) {
                $model->recentAlarms = [];
                $n                   = 0;
                foreach ($map['recent_alarms'] as $item) {
                    $model->recentAlarms[$n++] = null !== $item ? AlarmHistoryDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
