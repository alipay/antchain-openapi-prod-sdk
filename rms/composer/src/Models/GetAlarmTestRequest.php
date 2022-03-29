<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetAlarmTestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 告警规则的唯一名称
    /**
     * @var string
     */
    public $alarmUniqueName;

    // 类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'       => 'auth_token',
        'workspaceName'   => 'workspace_name',
        'alarmUniqueName' => 'alarm_unique_name',
        'type'            => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('alarmUniqueName', $this->alarmUniqueName, true);
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
        if (null !== $this->alarmUniqueName) {
            $res['alarm_unique_name'] = $this->alarmUniqueName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAlarmTestRequest
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
        if (isset($map['alarm_unique_name'])) {
            $model->alarmUniqueName = $map['alarm_unique_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
