<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class SendRiskTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险工单ID
    /**
     * @var string
     */
    public $riskTaskId;

    // 责任人
    /**
     * @var string
     */
    public $owner;

    // 评论
    /**
     * @var string
     */
    public $comment;
    protected $_name = [
        'authToken'  => 'auth_token',
        'riskTaskId' => 'risk_task_id',
        'owner'      => 'owner',
        'comment'    => 'comment',
    ];

    public function validate()
    {
        Model::validateRequired('riskTaskId', $this->riskTaskId, true);
        Model::validateRequired('owner', $this->owner, true);
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
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendRiskTaskRequest
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
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
