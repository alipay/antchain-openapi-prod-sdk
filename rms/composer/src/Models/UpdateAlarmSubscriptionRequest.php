<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAlarmSubscriptionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 告警订阅主键 ID
    /**
     * @var int
     */
    public $id;

    // 告警级别
    /**
     * @var int
     */
    public $alarmLevel;

    // 降频通知开关
    /**
     * @var int
     */
    public $notifyReduceSwitch;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceName'      => 'workspace_name',
        'id'                 => 'id',
        'alarmLevel'         => 'alarm_level',
        'notifyReduceSwitch' => 'notify_reduce_switch',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('notifyReduceSwitch', $this->notifyReduceSwitch, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->notifyReduceSwitch) {
            $res['notify_reduce_switch'] = $this->notifyReduceSwitch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAlarmSubscriptionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['notify_reduce_switch'])) {
            $model->notifyReduceSwitch = $map['notify_reduce_switch'];
        }

        return $model;
    }
}
