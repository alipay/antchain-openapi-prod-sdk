<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SwitchOpsAlarmRequest extends Model
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

    // DATA_OPS： 诊断告警
    // AGENT：agent告警
    //
    /**
     * @var string
     */
    public $alarmTargetType;

    // 1：开启告警
    // 0：暂停告警
    /**
     * @var int
     */
    public $status;

    // 应用
    /**
     * @var string
     */
    public $alarmTargetIdentity;
    protected $_name = [
        'authToken'           => 'auth_token',
        'workspaceName'       => 'workspace_name',
        'alarmTargetType'     => 'alarm_target_type',
        'status'              => 'status',
        'alarmTargetIdentity' => 'alarm_target_identity',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('alarmTargetType', $this->alarmTargetType, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alarmTargetIdentity) {
            $res['alarm_target_identity'] = $this->alarmTargetIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SwitchOpsAlarmRequest
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
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['alarm_target_identity'])) {
            $model->alarmTargetIdentity = $map['alarm_target_identity'];
        }

        return $model;
    }
}
