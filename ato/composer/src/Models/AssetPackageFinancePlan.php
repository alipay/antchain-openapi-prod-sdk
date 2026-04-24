<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AssetPackageFinancePlan extends Model
{
    // 版本号，从1开始
    /**
     * @example 1
     *
     * @var int
     */
    public $version;

    // 状态，ENABLE：启用，不启用时默认null
    /**
     * @example ENABLE
     *
     * @var string
     */
    public $status;

    // 放款比例
    // 0~100，保留小数2位
    /**
     * @example 75
     *
     * @var string
     */
    public $loanRate;

    // 放款金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $loanMoney;

    // 放款金额，单位元
    /**
     * @example 1.00
     *
     * @var string
     */
    public $loanMoneyYuan;

    // 计息方式，枚举：
    // ● 年化利率：APR
    // ● 固定金额：FIXED_AMOUNT
    // ● 固定比例：FIXED_RATE
    /**
     * @example APR
     *
     * @var string
     */
    public $interestAccrualMethod;

    // 年计息天数
    /**
     * @example 360
     *
     * @var int
     */
    public $dayCountConvention;

    // 息费率
    /**
     * @example 7
     *
     * @var string
     */
    public $allinFinancingCostRate;

    // 还款方式，枚举：
    // ● 等额本息：EQUAL_INSTALLMENT_METHOD
    /**
     * @example EQUAL_INSTALLMENT_METHOD
     *
     * @var string
     */
    public $repaymentMethod;

    // 还款频率，枚举：
    // ● 按月：MONTH
    /**
     * @example MONTH
     *
     * @var string
     */
    public $repaymentFrequency;

    // 融资期数，范围0~36
    /**
     * @example 12
     *
     * @var int
     */
    public $financeNum;

    // 计划还款日期，范围1～28
    /**
     * @example 20
     *
     * @var int
     */
    public $payDay;

    // 触发商家代偿时间，单位天
    /**
     * @example 2
     *
     * @var int
     */
    public $merchantCompensationDay;

    // 订单未还款总金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $unreleasedAmount;
    protected $_name = [
        'version'                 => 'version',
        'status'                  => 'status',
        'loanRate'                => 'loan_rate',
        'loanMoney'               => 'loan_money',
        'loanMoneyYuan'           => 'loan_money_yuan',
        'interestAccrualMethod'   => 'interest_accrual_method',
        'dayCountConvention'      => 'day_count_convention',
        'allinFinancingCostRate'  => 'allin_financing_cost_rate',
        'repaymentMethod'         => 'repayment_method',
        'repaymentFrequency'      => 'repayment_frequency',
        'financeNum'              => 'finance_num',
        'payDay'                  => 'pay_day',
        'merchantCompensationDay' => 'merchant_compensation_day',
        'unreleasedAmount'        => 'unreleased_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->loanRate) {
            $res['loan_rate'] = $this->loanRate;
        }
        if (null !== $this->loanMoney) {
            $res['loan_money'] = $this->loanMoney;
        }
        if (null !== $this->loanMoneyYuan) {
            $res['loan_money_yuan'] = $this->loanMoneyYuan;
        }
        if (null !== $this->interestAccrualMethod) {
            $res['interest_accrual_method'] = $this->interestAccrualMethod;
        }
        if (null !== $this->dayCountConvention) {
            $res['day_count_convention'] = $this->dayCountConvention;
        }
        if (null !== $this->allinFinancingCostRate) {
            $res['allin_financing_cost_rate'] = $this->allinFinancingCostRate;
        }
        if (null !== $this->repaymentMethod) {
            $res['repayment_method'] = $this->repaymentMethod;
        }
        if (null !== $this->repaymentFrequency) {
            $res['repayment_frequency'] = $this->repaymentFrequency;
        }
        if (null !== $this->financeNum) {
            $res['finance_num'] = $this->financeNum;
        }
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }
        if (null !== $this->merchantCompensationDay) {
            $res['merchant_compensation_day'] = $this->merchantCompensationDay;
        }
        if (null !== $this->unreleasedAmount) {
            $res['unreleased_amount'] = $this->unreleasedAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetPackageFinancePlan
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['loan_rate'])) {
            $model->loanRate = $map['loan_rate'];
        }
        if (isset($map['loan_money'])) {
            $model->loanMoney = $map['loan_money'];
        }
        if (isset($map['loan_money_yuan'])) {
            $model->loanMoneyYuan = $map['loan_money_yuan'];
        }
        if (isset($map['interest_accrual_method'])) {
            $model->interestAccrualMethod = $map['interest_accrual_method'];
        }
        if (isset($map['day_count_convention'])) {
            $model->dayCountConvention = $map['day_count_convention'];
        }
        if (isset($map['allin_financing_cost_rate'])) {
            $model->allinFinancingCostRate = $map['allin_financing_cost_rate'];
        }
        if (isset($map['repayment_method'])) {
            $model->repaymentMethod = $map['repayment_method'];
        }
        if (isset($map['repayment_frequency'])) {
            $model->repaymentFrequency = $map['repayment_frequency'];
        }
        if (isset($map['finance_num'])) {
            $model->financeNum = $map['finance_num'];
        }
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }
        if (isset($map['merchant_compensation_day'])) {
            $model->merchantCompensationDay = $map['merchant_compensation_day'];
        }
        if (isset($map['unreleased_amount'])) {
            $model->unreleasedAmount = $map['unreleased_amount'];
        }

        return $model;
    }
}
