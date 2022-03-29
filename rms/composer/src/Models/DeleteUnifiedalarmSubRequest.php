<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DeleteUnifiedalarmSubRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 通知对象 可能为多个
    /**
     * @var UnifiedAlarmSubDTO
     */
    public $alarmSub;

    // 规则id集合
    /**
     * @var int
     */
    public $ruleId;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'alarmSub'      => 'alarm_sub',
        'ruleId'        => 'rule_id',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('alarmSub', $this->alarmSub, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alarmSub) {
            $res['alarm_sub'] = null !== $this->alarmSub ? $this->alarmSub->toMap() : null;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteUnifiedalarmSubRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['alarm_sub'])) {
            $model->alarmSub = UnifiedAlarmSubDTO::fromMap($map['alarm_sub']);
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
