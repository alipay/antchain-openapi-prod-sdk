<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseRentalverifyRequest extends Model
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

    // 约定的合约id
    /**
     * @var string
     */
    public $applicationId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 核验类型
    /**
     * @var string
     */
    public $proofType;

    // 还款流水号
    /**
     * @var string
     */
    public $returnVoucherSerial;

    // 归还期数
    /**
     * @var int
     */
    public $returnTerm;

    // 租赁商户的id
    /**
     * @var string
     */
    public $leaseId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'applicationId'       => 'application_id',
        'orderId'             => 'order_id',
        'proofType'           => 'proof_type',
        'returnVoucherSerial' => 'return_voucher_serial',
        'returnTerm'          => 'return_term',
        'leaseId'             => 'lease_id',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('proofType', $this->proofType, true);
        Model::validateRequired('returnVoucherSerial', $this->returnVoucherSerial, true);
        Model::validateRequired('returnTerm', $this->returnTerm, true);
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
        if (null !== $this->proofType) {
            $res['proof_type'] = $this->proofType;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->returnTerm) {
            $res['return_term'] = $this->returnTerm;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseRentalverifyRequest
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
        if (isset($map['proof_type'])) {
            $model->proofType = $map['proof_type'];
        }
        if (isset($map['return_voucher_serial'])) {
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if (isset($map['return_term'])) {
            $model->returnTerm = $map['return_term'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }

        return $model;
    }
}
