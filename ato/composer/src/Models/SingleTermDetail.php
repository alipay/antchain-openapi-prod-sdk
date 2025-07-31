<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SingleTermDetail extends Model
{
    // 期数
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 支付金额
    /**
     * @example 1
     *
     * @var int
     */
    public $payAmount;
    protected $_name = [
        'periodNum' => 'period_num',
        'payAmount' => 'pay_amount',
    ];

    public function validate()
    {
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('payAmount', $this->payAmount, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleTermDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }

        return $model;
    }
}
