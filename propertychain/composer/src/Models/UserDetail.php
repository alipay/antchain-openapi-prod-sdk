<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UserDetail extends Model
{
    // 融资编号
    /**
     * @example financingNo
     *
     * @var string
     */
    public $financingNo;

    // 分润金额，乘过分润比例，到记账日的累计值
    /**
     * @example 0
     *
     * @var int
     */
    public $dividedAmount;

    // 分润比例，保留两位小数
    /**
     * @example 10.01
     *
     * @var string
     */
    public $dividedRate;

    // 罚息金额
    /**
     * @example 0
     *
     * @var int
     */
    public $penaltyAmount;

    // 角色编码
    /**
     * @example roleCode
     *
     * @var string
     */
    public $roleCode;

    // 记账日期 yyyy-mm-dd
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $accountDate;

    // 当日还款金额
    /**
     * @example 0
     *
     * @var int
     */
    public $payment;

    // 其他利润(操作费还款日时写到各方记录)
    /**
     * @example 0
     *
     * @var int
     */
    public $otherProfit;
    protected $_name = [
        'financingNo'   => 'financing_no',
        'dividedAmount' => 'divided_amount',
        'dividedRate'   => 'divided_rate',
        'penaltyAmount' => 'penalty_amount',
        'roleCode'      => 'role_code',
        'accountDate'   => 'account_date',
        'payment'       => 'payment',
        'otherProfit'   => 'other_profit',
    ];

    public function validate()
    {
        Model::validateRequired('financingNo', $this->financingNo, true);
        Model::validateRequired('dividedAmount', $this->dividedAmount, true);
        Model::validateRequired('dividedRate', $this->dividedRate, true);
        Model::validateRequired('penaltyAmount', $this->penaltyAmount, true);
        Model::validateRequired('roleCode', $this->roleCode, true);
        Model::validateRequired('accountDate', $this->accountDate, true);
        Model::validateRequired('payment', $this->payment, true);
        Model::validateRequired('otherProfit', $this->otherProfit, true);
        Model::validatePattern('accountDate', $this->accountDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->financingNo) {
            $res['financing_no'] = $this->financingNo;
        }
        if (null !== $this->dividedAmount) {
            $res['divided_amount'] = $this->dividedAmount;
        }
        if (null !== $this->dividedRate) {
            $res['divided_rate'] = $this->dividedRate;
        }
        if (null !== $this->penaltyAmount) {
            $res['penalty_amount'] = $this->penaltyAmount;
        }
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->accountDate) {
            $res['account_date'] = $this->accountDate;
        }
        if (null !== $this->payment) {
            $res['payment'] = $this->payment;
        }
        if (null !== $this->otherProfit) {
            $res['other_profit'] = $this->otherProfit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['financing_no'])) {
            $model->financingNo = $map['financing_no'];
        }
        if (isset($map['divided_amount'])) {
            $model->dividedAmount = $map['divided_amount'];
        }
        if (isset($map['divided_rate'])) {
            $model->dividedRate = $map['divided_rate'];
        }
        if (isset($map['penalty_amount'])) {
            $model->penaltyAmount = $map['penalty_amount'];
        }
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['account_date'])) {
            $model->accountDate = $map['account_date'];
        }
        if (isset($map['payment'])) {
            $model->payment = $map['payment'];
        }
        if (isset($map['other_profit'])) {
            $model->otherProfit = $map['other_profit'];
        }

        return $model;
    }
}
