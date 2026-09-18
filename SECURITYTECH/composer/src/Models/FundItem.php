<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FundItem extends Model {
    protected $_name = [
        'fundType' => 'fund_type',
        'availableAmount' => 'available_amount',
        'canRefundAmount' => 'can_refund_amount',
        'frozenAmount' => 'frozen_amount',
    ];
    public function validate() {
        Model::validateRequired('fundType', $this->fundType, true);
        Model::validateRequired('availableAmount', $this->availableAmount, true);
        Model::validateRequired('frozenAmount', $this->frozenAmount, true);
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
        return $res;
    }
    /**
     * @param array $map
     * @return FundItem
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
        return $model;
    }
    // fund_type
    /**
     * @example PET
     * @var string
     */
    public $fundType;

    // available_amount
    /**
     * @example 300.00
     * @var string
     */
    public $availableAmount;

    // frozen_amount
    /**
     * @example 300.00
     * @var string
     */
    public $canRefundAmount;

    // frozen_amount
    /**
     * @example 300.00
     * @var string
     */
    public $frozenAmount;

}
