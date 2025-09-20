<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OperateDivideTransInModel extends Model
{
    // 分账收入方支付宝用户id, 支付宝2088id
    /**
     * @example 2088id
     *
     * @var string
     */
    public $transInUserId;

    // 分账金额，单位为分 大于0
    /**
     * @example 12324
     *
     * @var int
     */
    public $divideAmount;
    protected $_name = [
        'transInUserId' => 'trans_in_user_id',
        'divideAmount'  => 'divide_amount',
    ];

    public function validate()
    {
        Model::validateRequired('transInUserId', $this->transInUserId, true);
        Model::validateRequired('divideAmount', $this->divideAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transInUserId) {
            $res['trans_in_user_id'] = $this->transInUserId;
        }
        if (null !== $this->divideAmount) {
            $res['divide_amount'] = $this->divideAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDivideTransInModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trans_in_user_id'])) {
            $model->transInUserId = $map['trans_in_user_id'];
        }
        if (isset($map['divide_amount'])) {
            $model->divideAmount = $map['divide_amount'];
        }

        return $model;
    }
}
