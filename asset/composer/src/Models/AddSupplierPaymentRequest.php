<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class AddSupplierPaymentRequest extends Model
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

    // 打款记录集
    /**
     * @var PaymentRecord[]
     */
    public $paymentRecords;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'paymentRecords'    => 'payment_records',
    ];

    public function validate()
    {
        Model::validateRequired('paymentRecords', $this->paymentRecords, true);
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
        if (null !== $this->paymentRecords) {
            $res['payment_records'] = [];
            if (null !== $this->paymentRecords && \is_array($this->paymentRecords)) {
                $n = 0;
                foreach ($this->paymentRecords as $item) {
                    $res['payment_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSupplierPaymentRequest
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
        if (isset($map['payment_records'])) {
            if (!empty($map['payment_records'])) {
                $model->paymentRecords = [];
                $n                     = 0;
                foreach ($map['payment_records'] as $item) {
                    $model->paymentRecords[$n++] = null !== $item ? PaymentRecord::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
