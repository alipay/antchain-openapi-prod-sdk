<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DebugParticipator extends Model
{
    // 主事务id
    /**
     * @example b3f0f17e45d54d56967a5bd6dd1a28c501-0000000000
     *
     * @var string
     */
    public $txId;

    // 分支事务id
    /**
     * @example -3953949181472325518
     *
     * @var string
     */
    public $actionId;

    // 参与者名称
    /**
     * @example IINNERTRANS_TRANS_INNER_ACCOUNT_TALLY
     *
     * @var string
     */
    public $actionName;

    // 1：提交，2：回滚
    /**
     * @example 1
     *
     * @var int
     */
    public $actionType;

    // 主事务上下文
    /**
     * @example a=b;
     *
     * @var string
     */
    public $activityContext;

    // 分支事务上下文
    /**
     * @example c=d;
     *
     * @var string
     */
    public $actionContext;
    protected $_name = [
        'txId'            => 'tx_id',
        'actionId'        => 'action_id',
        'actionName'      => 'action_name',
        'actionType'      => 'action_type',
        'activityContext' => 'activity_context',
        'actionContext'   => 'action_context',
    ];

    public function validate()
    {
        Model::validateRequired('txId', $this->txId, true);
        Model::validateRequired('actionId', $this->actionId, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('activityContext', $this->activityContext, true);
        Model::validateRequired('actionContext', $this->actionContext, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->activityContext) {
            $res['activity_context'] = $this->activityContext;
        }
        if (null !== $this->actionContext) {
            $res['action_context'] = $this->actionContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebugParticipator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['action_id'])) {
            $model->actionId = $map['action_id'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['activity_context'])) {
            $model->activityContext = $map['activity_context'];
        }
        if (isset($map['action_context'])) {
            $model->actionContext = $map['action_context'];
        }

        return $model;
    }
}
