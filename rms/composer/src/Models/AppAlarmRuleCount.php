<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppAlarmRuleCount extends Model
{
    // 应用名称
    /**
     * @example RMS-monitorprod
     *
     * @var string
     */
    public $appName;

    // 应用告警规则总数
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmRuleCount;
    protected $_name = [
        'appName'        => 'app_name',
        'alarmRuleCount' => 'alarm_rule_count',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('alarmRuleCount', $this->alarmRuleCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->alarmRuleCount) {
            $res['alarm_rule_count'] = $this->alarmRuleCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppAlarmRuleCount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['alarm_rule_count'])) {
            $model->alarmRuleCount = $map['alarm_rule_count'];
        }

        return $model;
    }
}
