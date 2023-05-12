<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DebugParticipatorsRequest extends Model
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

    // 分支事务id
    /**
     * @var string
     */
    public $actionId;

    // 参与者名称
    /**
     * @var string
     */
    public $actionName;

    // 操作类型，提交或回滚
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

    // 主事务id
    /**
     * @var string
     */
    public $txId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionContext'     => 'action_context',
        'actionId'          => 'action_id',
        'actionName'        => 'action_name',
        'actionType'        => 'action_type',
        'activityContext'   => 'activity_context',
        'instanceId'        => 'instance_id',
        'txId'              => 'tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('actionContext', $this->actionContext, true);
        Model::validateRequired('actionId', $this->actionId, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('actionType', $this->actionType, true);
        Model::validateRequired('activityContext', $this->activityContext, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebugParticipatorsRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }

        return $model;
    }
}
