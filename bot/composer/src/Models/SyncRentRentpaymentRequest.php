<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncRentRentpaymentRequest extends Model
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

    // 租金缴纳账单ID
    /**
     * @var string
     */
    public $leaseBillId;

    // 租约分期ID
    /**
     * @var string
     */
    public $billItemId;

    // 租约支付状态
    /**
     * @var string
     */
    public $paymentState;

    // 支付操作日期，已支付或支付失败需要有值
    /**
     * @var string
     */
    public $paymentDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leaseBillId'       => 'lease_bill_id',
        'billItemId'        => 'bill_item_id',
        'paymentState'      => 'payment_state',
        'paymentDate'       => 'payment_date',
    ];

    public function validate()
    {
        Model::validateRequired('leaseBillId', $this->leaseBillId, true);
        Model::validateRequired('billItemId', $this->billItemId, true);
        Model::validateRequired('paymentState', $this->paymentState, true);
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
        if (null !== $this->leaseBillId) {
            $res['lease_bill_id'] = $this->leaseBillId;
        }
        if (null !== $this->billItemId) {
            $res['bill_item_id'] = $this->billItemId;
        }
        if (null !== $this->paymentState) {
            $res['payment_state'] = $this->paymentState;
        }
        if (null !== $this->paymentDate) {
            $res['payment_date'] = $this->paymentDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncRentRentpaymentRequest
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
        if (isset($map['lease_bill_id'])) {
            $model->leaseBillId = $map['lease_bill_id'];
        }
        if (isset($map['bill_item_id'])) {
            $model->billItemId = $map['bill_item_id'];
        }
        if (isset($map['payment_state'])) {
            $model->paymentState = $map['payment_state'];
        }
        if (isset($map['payment_date'])) {
            $model->paymentDate = $map['payment_date'];
        }

        return $model;
    }
}
