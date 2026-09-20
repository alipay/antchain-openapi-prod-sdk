<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class FundItemDetail extends Model {
    protected $_name = [
        'fundType' => 'fund_type',
        'availableAmount' => 'available_amount',
        'canRefundAmount' => 'can_refund_amount',
        'frozenAmount' => 'frozen_amount',
        'merchantId' => 'merchant_id',
        'originalAmount' => 'original_amount',
    ];
    public function validate() {
        Model::validateRequired('fundType', $this->fundType, true);
        Model::validateRequired('availableAmount', $this->availableAmount, true);
        Model::validateRequired('canRefundAmount', $this->canRefundAmount, true);
        Model::validateRequired('frozenAmount', $this->frozenAmount, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('originalAmount', $this->originalAmount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->fundType) {
            $res['fund_type'] = $this->fundType;
        }
        if (null !== $this->availableAmount) {
            $res['available_amount'] = $this->availableAmount;
        }
        if (null !== $this->canRefundAmount) {
            $res['can_refund_amount'] = $this->canRefundAmount;
        }
        if (null !== $this->frozenAmount) {
            $res['frozen_amount'] = $this->frozenAmount;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->originalAmount) {
            $res['original_amount'] = $this->originalAmount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FundItemDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['fund_type'])){
            $model->fundType = $map['fund_type'];
        }
        if(isset($map['available_amount'])){
            $model->availableAmount = $map['available_amount'];
        }
        if(isset($map['can_refund_amount'])){
            $model->canRefundAmount = $map['can_refund_amount'];
        }
        if(isset($map['frozen_amount'])){
            $model->frozenAmount = $map['frozen_amount'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['original_amount'])){
            $model->originalAmount = $map['original_amount'];
        }
        return $model;
    }
    // 账户类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（储值卡）
    /**
     * @example POINT_PACKAGE
     * @var string
     */
    public $fundType;

    // 可用金额，不含冻结占用，无可用返回0，单位元
    /**
     * @example 199.68
     * @var string
     */
    public $availableAmount;

    // 最高可退金额，涵盖了手续费，无可用返回0，单位元
    /**
     * @example 199.68
     * @var string
     */
    public $canRefundAmount;

    // 冻结金额，无冻结返回0，单位元
    /**
     * @example 199.68
     * @var string
     */
    public $frozenAmount;

    // 账户归属的入驻id
    /**
     * @example xxx
     * @var string
     */
    public $merchantId;

    // 原支付金额
    /**
     * @example 199.68
     * @var string
     */
    public $originalAmount;

}
