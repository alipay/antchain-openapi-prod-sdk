<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UserStatement extends Model
{
    // 融资编号
    /**
     * @example financingNo
     *
     * @var string
     */
    public $financingNo;

    // 产品编号，有的话返回
    /**
     * @example productNo
     *
     * @var string
     */
    public $productNo;

    // 融资金额
    /**
     * @example 0
     *
     * @var int
     */
    public $financialAmount;

    // 分润比例，保留两位小数的百分比
    /**
     * @example 99.99
     *
     * @var string
     */
    public $profitRate;

    // 总分润金额，乘过分润比例
    /**
     * @example 0
     *
     * @var int
     */
    public $totalAmount;

    // 角色名称，按上述角色名称约定
    /**
     * @example roleCode
     *
     * @var string
     */
    public $roleCode;

    // 角色对应的企业
    /**
     * @example companyNo
     *
     * @var string
     */
    public $companyNo;

    // 记账日期 yyyy-MM-dd
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $accountDate;
    protected $_name = [
        'financingNo'     => 'financing_no',
        'productNo'       => 'product_no',
        'financialAmount' => 'financial_amount',
        'profitRate'      => 'profit_rate',
        'totalAmount'     => 'total_amount',
        'roleCode'        => 'role_code',
        'companyNo'       => 'company_no',
        'accountDate'     => 'account_date',
    ];

    public function validate()
    {
        Model::validateRequired('financingNo', $this->financingNo, true);
        Model::validateRequired('productNo', $this->productNo, true);
        Model::validateRequired('financialAmount', $this->financialAmount, true);
        Model::validateRequired('profitRate', $this->profitRate, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('roleCode', $this->roleCode, true);
        Model::validateRequired('companyNo', $this->companyNo, true);
        Model::validateRequired('accountDate', $this->accountDate, true);
        Model::validatePattern('accountDate', $this->accountDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->financingNo) {
            $res['financing_no'] = $this->financingNo;
        }
        if (null !== $this->productNo) {
            $res['product_no'] = $this->productNo;
        }
        if (null !== $this->financialAmount) {
            $res['financial_amount'] = $this->financialAmount;
        }
        if (null !== $this->profitRate) {
            $res['profit_rate'] = $this->profitRate;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->companyNo) {
            $res['company_no'] = $this->companyNo;
        }
        if (null !== $this->accountDate) {
            $res['account_date'] = $this->accountDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserStatement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['financing_no'])) {
            $model->financingNo = $map['financing_no'];
        }
        if (isset($map['product_no'])) {
            $model->productNo = $map['product_no'];
        }
        if (isset($map['financial_amount'])) {
            $model->financialAmount = $map['financial_amount'];
        }
        if (isset($map['profit_rate'])) {
            $model->profitRate = $map['profit_rate'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['company_no'])) {
            $model->companyNo = $map['company_no'];
        }
        if (isset($map['account_date'])) {
            $model->accountDate = $map['account_date'];
        }

        return $model;
    }
}
