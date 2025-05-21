<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CancelAntchainAtoFundPlanRequest extends Model
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

    // 取消原因
    // ACTIVE_REDEEM:自主赎回
    // RENTING_OUT_REDEEM:退租赎回
    // RENTING_AND_RESALE_REDEEM:租转售赎回
    /**
     * @var string
     */
    public $cancelReason;

    // 融资单的资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 操作
    /**
     * @var string
     */
    public $operation;

    // 赎回金额,单位为分,取消并赎回时必填
    /**
     * @var int
     */
    public $redeemAmount;

    // 赎回类型，为空默认为 TRANSFER
    // 转账代偿：TRANSFER
    // 代扣代偿：WITHHOLD
    /**
     * @var string
     */
    public $redeemType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantId'        => 'merchant_id',
        'cancelReason'      => 'cancel_reason',
        'fundId'            => 'fund_id',
        'operation'         => 'operation',
        'redeemAmount'      => 'redeem_amount',
        'redeemType'        => 'redeem_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('cancelReason', $this->cancelReason, true);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMaxLength('operation', $this->operation, 64);
        Model::validateMaxLength('redeemType', $this->redeemType, 64);
        Model::validateMinimum('redeemAmount', $this->redeemAmount, 10);
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
        if (null !== $this->cancelReason) {
            $res['cancel_reason'] = $this->cancelReason;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->redeemAmount) {
            $res['redeem_amount'] = $this->redeemAmount;
        }
        if (null !== $this->redeemType) {
            $res['redeem_type'] = $this->redeemType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelAntchainAtoFundPlanRequest
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
        if (isset($map['cancel_reason'])) {
            $model->cancelReason = $map['cancel_reason'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['redeem_amount'])) {
            $model->redeemAmount = $map['redeem_amount'];
        }
        if (isset($map['redeem_type'])) {
            $model->redeemType = $map['redeem_type'];
        }

        return $model;
    }
}
