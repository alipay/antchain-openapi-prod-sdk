<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceSettingDetail extends Model
{
    // old_alarm_lang
    /**
     * @example zh
     *
     * @var string
     */
    public $oldAlarmLang;

    // 旧版告警开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $oldAlarmEnable;

    // unified_alarm_lang
    /**
     * @example zh
     *
     * @var string
     */
    public $unifiedAlarmLang;

    // unified_alarm_enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $unifiedAlarmEnable;

    // trace_enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $traceEnable;

    // 监控诊断开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $diagnoseEnable;
    protected $_name = [
        'oldAlarmLang'       => 'old_alarm_lang',
        'oldAlarmEnable'     => 'old_alarm_enable',
        'unifiedAlarmLang'   => 'unified_alarm_lang',
        'unifiedAlarmEnable' => 'unified_alarm_enable',
        'traceEnable'        => 'trace_enable',
        'diagnoseEnable'     => 'diagnose_enable',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->oldAlarmLang) {
            $res['old_alarm_lang'] = $this->oldAlarmLang;
        }
        if (null !== $this->oldAlarmEnable) {
            $res['old_alarm_enable'] = $this->oldAlarmEnable;
        }
        if (null !== $this->unifiedAlarmLang) {
            $res['unified_alarm_lang'] = $this->unifiedAlarmLang;
        }
        if (null !== $this->unifiedAlarmEnable) {
            $res['unified_alarm_enable'] = $this->unifiedAlarmEnable;
        }
        if (null !== $this->traceEnable) {
            $res['trace_enable'] = $this->traceEnable;
        }
        if (null !== $this->diagnoseEnable) {
            $res['diagnose_enable'] = $this->diagnoseEnable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceSettingDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['old_alarm_lang'])) {
            $model->oldAlarmLang = $map['old_alarm_lang'];
        }
        if (isset($map['old_alarm_enable'])) {
            $model->oldAlarmEnable = $map['old_alarm_enable'];
        }
        if (isset($map['unified_alarm_lang'])) {
            $model->unifiedAlarmLang = $map['unified_alarm_lang'];
        }
        if (isset($map['unified_alarm_enable'])) {
            $model->unifiedAlarmEnable = $map['unified_alarm_enable'];
        }
        if (isset($map['trace_enable'])) {
            $model->traceEnable = $map['trace_enable'];
        }
        if (isset($map['diagnose_enable'])) {
            $model->diagnoseEnable = $map['diagnose_enable'];
        }

        return $model;
    }
}
