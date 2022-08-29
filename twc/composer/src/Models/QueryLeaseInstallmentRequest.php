<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseInstallmentRequest extends Model
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

    // 合约id
    /**
     * @var string
     */
    public $applicationId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 归还的第几期
    /**
     * @var string
     */
    public $term;

    // 商家租户id
    /**
     * @var string
     */
    public $leaseId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'orderId'           => 'order_id',
        'term'              => 'term',
        'leaseId'           => 'lease_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('term', $this->term, true);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->term) {
            $res['term'] = $this->term;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseInstallmentRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['term'])) {
            $model->term = $map['term'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }

        return $model;
    }
}
