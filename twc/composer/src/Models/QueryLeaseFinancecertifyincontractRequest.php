<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseFinancecertifyincontractRequest extends Model
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

    // 核验id
    /**
     * @var string
     */
    public $leaseCertifyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'orderId'           => 'order_id',
        'leaseCertifyId'    => 'lease_certify_id',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('leaseCertifyId', $this->leaseCertifyId, true);
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
        if (null !== $this->leaseCertifyId) {
            $res['lease_certify_id'] = $this->leaseCertifyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseFinancecertifyincontractRequest
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
        if (isset($map['lease_certify_id'])) {
            $model->leaseCertifyId = $map['lease_certify_id'];
        }

        return $model;
    }
}
