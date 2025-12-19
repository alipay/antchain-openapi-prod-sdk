<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class OrgTrendData extends Model
{
    // 日期
    /**
     * @example 20250501
     *
     * @var string
     */
    public $date;

    // 还款金额
    /**
     * @example 100
     *
     * @var string
     */
    public $repaymentAmt;

    // 预算金额
    /**
     * @example 100
     *
     * @var string
     */
    public $budgetAmt;

    // 交易金额
    /**
     * @example 200
     *
     * @var string
     */
    public $tradeAmt;
    protected $_name = [
        'date'         => 'date',
        'repaymentAmt' => 'repayment_amt',
        'budgetAmt'    => 'budget_amt',
        'tradeAmt'     => 'trade_amt',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('repaymentAmt', $this->repaymentAmt, true);
        Model::validateRequired('budgetAmt', $this->budgetAmt, true);
        Model::validateRequired('tradeAmt', $this->tradeAmt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->repaymentAmt) {
            $res['repayment_amt'] = $this->repaymentAmt;
        }
        if (null !== $this->budgetAmt) {
            $res['budget_amt'] = $this->budgetAmt;
        }
        if (null !== $this->tradeAmt) {
            $res['trade_amt'] = $this->tradeAmt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgTrendData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['repayment_amt'])) {
            $model->repaymentAmt = $map['repayment_amt'];
        }
        if (isset($map['budget_amt'])) {
            $model->budgetAmt = $map['budget_amt'];
        }
        if (isset($map['trade_amt'])) {
            $model->tradeAmt = $map['trade_amt'];
        }

        return $model;
    }
}
