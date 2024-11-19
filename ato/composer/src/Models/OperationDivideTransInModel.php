<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OperationDivideTransInModel extends Model
{
    // 分账收入方支付宝用户id, 支付宝2088id
    /**
     * @example 2088****1
     *
     * @var string
     */
    public $transInUserId;

    // 分账金额，单位为分
    //
    /**
     * @example 100
     *
     * @var int
     */
    public $divideAmount;

    // 分账描述
    /**
     * @example 分账给经营商
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'transInUserId' => 'trans_in_user_id',
        'divideAmount'  => 'divide_amount',
        'desc'          => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('transInUserId', $this->transInUserId, true);
        Model::validateRequired('divideAmount', $this->divideAmount, true);
        Model::validateMaxLength('transInUserId', $this->transInUserId, 64);
        Model::validateMaxLength('desc', $this->desc, 64);
        Model::validateMinLength('transInUserId', $this->transInUserId, 1);
        Model::validateMinLength('desc', $this->desc, 1);
        Model::validateMinimum('divideAmount', $this->divideAmount, 1);
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationDivideTransInModel
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
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
