<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CancelAntchainAtoWithholdPlanRequest extends Model
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

    // 当发现跨天继续提交
    /**
     * @var string
     */
    public $orderId;

    // 取消原因
    // RENTING_OUT:退租
    // RENTING_AND_RESALE:租转售
    //
    //
    /**
     * @var string
     */
    public $cancelReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'cancelReason'      => 'cancel_reason',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('cancelReason', $this->cancelReason, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('cancelReason', $this->cancelReason, 64);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->cancelReason) {
            $res['cancel_reason'] = $this->cancelReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelAntchainAtoWithholdPlanRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['cancel_reason'])) {
            $model->cancelReason = $map['cancel_reason'];
        }

        return $model;
    }
}
