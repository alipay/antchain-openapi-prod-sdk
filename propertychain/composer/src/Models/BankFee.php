<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BankFee extends Model
{
    // 融资编号
    /**
     * @example financialNo
     *
     * @var string
     */
    public $financialNo;

    // 产品编号
    /**
     * @example productNo
     *
     * @var string
     */
    public $productNo;

    // 应付银行本金
    /**
     * @example
     *
     * @var int
     */
    public $capitalAmount;

    // 应付银行利息
    /**
     * @example
     *
     * @var int
     */
    public $interestAmount;

    // 应付总金额
    /**
     * @example
     *
     * @var int
     */
    public $totalAmount;

    // 记账日期 yyyy-MM-dd
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $accountDate;
    protected $_name = [
        'financialNo'    => 'financial_no',
        'productNo'      => 'product_no',
        'capitalAmount'  => 'capital_amount',
        'interestAmount' => 'interest_amount',
        'totalAmount'    => 'total_amount',
        'accountDate'    => 'account_date',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('capitalAmount', $this->capitalAmount, true);
        Model::validateRequired('interestAmount', $this->interestAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('accountDate', $this->accountDate, true);
        Model::validatePattern('accountDate', $this->accountDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->capitalAmount) {
            $res['capital_amount'] = $this->capitalAmount;
        }
        if (null !== $this->interestAmount) {
            $res['interest_amount'] = $this->interestAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->accountDate) {
            $res['account_date'] = $this->accountDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BankFee
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['capital_amount'])) {
            $model->capitalAmount = $map['capital_amount'];
        }
        if (isset($map['interest_amount'])) {
            $model->interestAmount = $map['interest_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['account_date'])) {
            $model->accountDate = $map['account_date'];
        }

        return $model;
    }
}
