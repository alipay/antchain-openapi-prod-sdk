<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateBclInsuranceRequest extends Model
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

    // bcl订单id
    /**
     * @var string
     */
    public $orderId;

    // 保司code
    /**
     * @var string
     */
    public $insuranceCode;

    // 投保人信息
    /**
     * @var BclInsuranceUserInfo
     */
    public $holder;

    // 被保人信息
    /**
     * @var BclInsuranceUserInfo
     */
    public $insured;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'insuranceCode'     => 'insurance_code',
        'holder'            => 'holder',
        'insured'           => 'insured',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateRequired('holder', $this->holder, true);
        Model::validateRequired('insured', $this->insured, true);
        Model::validateMaxLength('orderId', $this->orderId, 32);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 32);
        Model::validateMinLength('orderId', $this->orderId, 16);
        Model::validateMinLength('insuranceCode', $this->insuranceCode, 8);
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
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }
        if (null !== $this->holder) {
            $res['holder'] = null !== $this->holder ? $this->holder->toMap() : null;
        }
        if (null !== $this->insured) {
            $res['insured'] = null !== $this->insured ? $this->insured->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBclInsuranceRequest
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
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }
        if (isset($map['holder'])) {
            $model->holder = BclInsuranceUserInfo::fromMap($map['holder']);
        }
        if (isset($map['insured'])) {
            $model->insured = BclInsuranceUserInfo::fromMap($map['insured']);
        }

        return $model;
    }
}
