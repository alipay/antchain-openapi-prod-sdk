<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class AlarmTest extends Model
{
    // 工作空间名称
    /**
     * @example test
     *
     * @var string
     */
    public $workspaceName;

    // 告警规则id
    /**
     * @example test
     *
     * @var int
     */
    public $alarmRuleId;
    protected $_name = [
        'workspaceName' => 'workspace_name',
        'alarmRuleId'   => 'alarm_rule_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('alarmRuleId', $this->alarmRuleId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmTest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }

        return $model;
    }
}
