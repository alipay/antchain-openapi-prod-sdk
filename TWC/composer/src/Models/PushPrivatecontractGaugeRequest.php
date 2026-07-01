<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PushPrivatecontractGaugeRequest extends Model
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

    // 私有云合同服务实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 计量数量
    /**
     * @var int
     */
    public $amount;

    // 本次上报的唯一订单幂等ID，用流程ID和文件ID拼接生成
    /**
     * @var string
     */
    public $orderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'amount'            => 'amount',
        'orderId'           => 'order_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushPrivatecontractGaugeRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }

        return $model;
    }
}
