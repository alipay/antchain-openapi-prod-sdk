<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmTrendRequest extends Model
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

    // 开始时间
    /**
     * @var int
     */
    public $start;

    // 结束时间
    /**
     * @var int
     */
    public $end;

    // 告警类型 (固定传入自定义、应用、应用组3个告警类型)
    /**
     * @var string[]
     */
    public $alarmTypes;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'start'         => 'start',
        'end'           => 'end',
        'alarmTypes'    => 'alarm_types',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('alarmTypes', $this->alarmTypes, true);
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
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->alarmTypes) {
            $res['alarm_types'] = $this->alarmTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmTrendRequest
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
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['alarm_types'])) {
            if (!empty($map['alarm_types'])) {
                $model->alarmTypes = $map['alarm_types'];
            }
        }

        return $model;
    }
}
