<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateTransactionsCorrectionsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 分支事务上下文
    /**
     * @var string
     */
    public $actionContext;

    // PCREDITBILL_TRANS_TRANSFER_FOR_TRADE
    /**
     * @var string
     */
    public $actionName;

    // 操作类型；1、提交，2、回滚
    /**
     * @var int
     */
    public $actionType;

    // 主事务上下文
    /**
     * @var string
     */
    public $activityContext;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 1：提交，2：回滚
    /**
     * @var int
     */
    public $isCommit;

    // 是否同步主账务；0、不同步，1、同步
    /**
     * @var int
     */
    public $syncAcctrans;

    // 是否同步统一支付；0、不同步，1同步
    /**
     * @var int
     */
    public $syncPaycore;

    // 事务id
    /**
     * @var string
     */
    public $txId;

    // tracer上下文
    /**
     * @var string
     */
    public $tracerContext;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionContext'     => 'action_context',
        'actionName'        => 'action_name',
        'actionType'        => 'action_type',
        'activityContext'   => 'activity_context',
        'instanceId'        => 'instance_id',
        'isCommit'          => 'is_commit',
        'syncAcctrans'      => 'sync_acctrans',
        'syncPaycore'       => 'sync_paycore',
        'txId'              => 'tx_id',
        'tracerContext'     => 'tracer_context',
    ];

    public function validate()
    {
        Model::validateRequired('actionContext', $this->actionContext, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('activityContext', $this->activityContext, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isCommit', $this->isCommit, true);
        Model::validateRequired('syncAcctrans', $this->syncAcctrans, true);
        Model::validateRequired('syncPaycore', $this->syncPaycore, true);
        Model::validateRequired('txId', $this->txId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->actionContext) {
            $res['action_context'] = $this->actionContext;
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isCommit) {
            $res['is_commit'] = $this->isCommit;
        }
        if (null !== $this->syncAcctrans) {
            $res['sync_acctrans'] = $this->syncAcctrans;
        }
        if (null !== $this->syncPaycore) {
            $res['sync_paycore'] = $this->syncPaycore;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->tracerContext) {
            $res['tracer_context'] = $this->tracerContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTransactionsCorrectionsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['action_context'])) {
            $model->actionContext = $map['action_context'];
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_commit'])) {
            $model->isCommit = $map['is_commit'];
        }
        if (isset($map['sync_acctrans'])) {
            $model->syncAcctrans = $map['sync_acctrans'];
        }
        if (isset($map['sync_paycore'])) {
            $model->syncPaycore = $map['sync_paycore'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['tracer_context'])) {
            $model->tracerContext = $map['tracer_context'];
        }

        return $model;
    }
}
