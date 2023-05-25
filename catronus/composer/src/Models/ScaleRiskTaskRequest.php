<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ScaleRiskTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险任务ID
    /**
     * @var string
     */
    public $riskTaskId;

    // 延期时间
    /**
     * @var string
     */
    public $deadlineTime;

    // comment描述
    /**
     * @var string
     */
    public $comment;
    protected $_name = [
        'authToken'    => 'auth_token',
        'riskTaskId'   => 'risk_task_id',
        'deadlineTime' => 'deadline_time',
        'comment'      => 'comment',
    ];

    public function validate()
    {
        Model::validateRequired('riskTaskId', $this->riskTaskId, true);
        Model::validateRequired('deadlineTime', $this->deadlineTime, true);
        Model::validatePattern('deadlineTime', $this->deadlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->riskTaskId) {
            $res['risk_task_id'] = $this->riskTaskId;
        }
        if (null !== $this->deadlineTime) {
            $res['deadline_time'] = $this->deadlineTime;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScaleRiskTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['risk_task_id'])) {
            $model->riskTaskId = $map['risk_task_id'];
        }
        if (isset($map['deadline_time'])) {
            $model->deadlineTime = $map['deadline_time'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
