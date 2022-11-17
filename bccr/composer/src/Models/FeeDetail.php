<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class FeeDetail extends Model
{
    // 费用描述
    /**
     * @example 网页取证起步费用
     *
     * @var string
     */
    public $feeDesc;

    // 费用
    /**
     * @example xxxx
     *
     * @var string
     */
    public $amount;
    protected $_name = [
        'feeDesc' => 'fee_desc',
        'amount'  => 'amount',
    ];

    public function validate()
    {
        Model::validateRequired('feeDesc', $this->feeDesc, true);
        Model::validateRequired('amount', $this->amount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->feeDesc) {
            $res['fee_desc'] = $this->feeDesc;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FeeDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fee_desc'])) {
            $model->feeDesc = $map['fee_desc'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
