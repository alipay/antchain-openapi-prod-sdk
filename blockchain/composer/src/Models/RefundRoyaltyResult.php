<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RefundRoyaltyResult extends Model
{
    // 退分账金额
    /**
     * @example 12.50
     *
     * @var string
     */
    public $refundAmount;

    // 退分账结果码
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $resultCode;
    protected $_name = [
        'refundAmount' => 'refund_amount',
        'resultCode'   => 'result_code',
    ];

    public function validate()
    {
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('resultCode', $this->resultCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundRoyaltyResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }

        return $model;
    }
}
