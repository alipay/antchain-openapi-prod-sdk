<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetAlarmOverviewRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    //
    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // end_time
    /**
     * @var int
     */
    public $endTime;

    // alarm_type
    /**
     * @var string
     */
    public $alarmType;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'endTime'       => 'end_time',
        'alarmType'     => 'alarm_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('alarmType', $this->alarmType, true);
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->alarmType) {
            $res['alarm_type'] = $this->alarmType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAlarmOverviewRequest
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
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['alarm_type'])) {
            $model->alarmType = $map['alarm_type'];
        }

        return $model;
    }
}
