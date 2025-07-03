<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class RepayAntchainAtoFundPlanRequest extends Model
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

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 融资单的资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户履约的期数
    /**
     * @var int
     */
    public $termIndex;

    // 还款金额
    /**
     * @var int
     */
    public $amount;

    // 支付描述
    /**
     * @var string
     */
    public $paymentDescription;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderId'            => 'order_id',
        'merchantId'         => 'merchant_id',
        'fundId'             => 'fund_id',
        'termIndex'          => 'term_index',
        'amount'             => 'amount',
        'paymentDescription' => 'payment_description',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('termIndex', $this->termIndex, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('paymentDescription', $this->paymentDescription, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMaxLength('paymentDescription', $this->paymentDescription, 64);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('paymentDescription', $this->paymentDescription, 0);
        Model::validateMinimum('termIndex', $this->termIndex, 1);
        Model::validateMinimum('amount', $this->amount, 0);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->paymentDescription) {
            $res['payment_description'] = $this->paymentDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayAntchainAtoFundPlanRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['payment_description'])) {
            $model->paymentDescription = $map['payment_description'];
        }

        return $model;
    }
}
