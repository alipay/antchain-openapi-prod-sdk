<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmhistoryAlarmtrendsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // alarm_type
    /**
     * @var string
     */
    public $alarmType;

    // group_by
    /**
     * @var string
     */
    public $groupBy;

    // from
    /**
     * @var int
     */
    public $from;

    // to
    /**
     * @var int
     */
    public $to;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'alarmType'     => 'alarm_type',
        'groupBy'       => 'group_by',
        'from'          => 'from',
        'to'            => 'to',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('alarmType', $this->alarmType, true);
        Model::validateRequired('groupBy', $this->groupBy, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alarmType) {
            $res['alarm_type'] = $this->alarmType;
        }
        if (null !== $this->groupBy) {
            $res['group_by'] = $this->groupBy;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmhistoryAlarmtrendsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['alarm_type'])) {
            $model->alarmType = $map['alarm_type'];
        }
        if (isset($map['group_by'])) {
            $model->groupBy = $map['group_by'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
