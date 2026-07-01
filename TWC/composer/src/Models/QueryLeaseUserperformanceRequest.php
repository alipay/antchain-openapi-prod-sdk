<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseUserperformanceRequest extends Model
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

    // 本次融资的订单号
    /**
     * @var string
     */
    public $orderId;

    // 首租订单号
    /**
     * @var string
     */
    public $firstOrderId;

    // 本次融资双方的合约id
    /**
     * @var string
     */
    public $applicationId;

    // 商家的租户id
    /**
     * @var string
     */
    public $leaseId;

    // 首次融资的合约id
    /**
     * @var string
     */
    public $firstApplicationId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderId'            => 'order_id',
        'firstOrderId'       => 'first_order_id',
        'applicationId'      => 'application_id',
        'leaseId'            => 'lease_id',
        'firstApplicationId' => 'first_application_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('firstOrderId', $this->firstOrderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
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
        if (null !== $this->firstOrderId) {
            $res['first_order_id'] = $this->firstOrderId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->firstApplicationId) {
            $res['first_application_id'] = $this->firstApplicationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseUserperformanceRequest
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
        if (isset($map['first_order_id'])) {
            $model->firstOrderId = $map['first_order_id'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['first_application_id'])) {
            $model->firstApplicationId = $map['first_application_id'];
        }

        return $model;
    }
}
