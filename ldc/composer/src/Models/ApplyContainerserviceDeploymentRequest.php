<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ApplyContainerserviceDeploymentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单time_series_id
    /**
     * @var string
     */
    public $timeSeriesId;

    // 审批人账号id
    /**
     * @var string[]
     */
    public $assigneeIds;
    protected $_name = [
        'authToken'    => 'auth_token',
        'timeSeriesId' => 'time_series_id',
        'assigneeIds'  => 'assignee_ids',
    ];

    public function validate()
    {
        Model::validateRequired('timeSeriesId', $this->timeSeriesId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->assigneeIds) {
            $res['assignee_ids'] = $this->assigneeIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyContainerserviceDeploymentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['assignee_ids'])) {
            if (!empty($map['assignee_ids'])) {
                $model->assigneeIds = $map['assignee_ids'];
            }
        }

        return $model;
    }
}
