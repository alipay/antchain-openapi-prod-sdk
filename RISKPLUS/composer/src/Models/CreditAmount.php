<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreditAmount extends Model
{
    // 授信额度
    /**
     * @example 1
     *
     * @var int
     */
    public $creditAmount;

    // 授信余额
    /**
     * @example 1
     *
     * @var int
     */
    public $restAmount;

    // 发放日期
    /**
     * @example
     *
     * @var string
     */
    public $payDate;

    // 到期日期
    /**
     * @example
     *
     * @var string
     */
    public $expireDate;

    // 利率单位(1:年，2：月，3：日)
    /**
     * @example 1
     *
     * @var string
     */
    public $rateUnit;

    // 执行利率,利率值，单位%
    // 年化5%，rateValue=5
    //
    /**
     * @example
     *
     * @var int
     */
    public $rateValue;

    // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
    /**
     * @example 1
     *
     * @var string
     */
    public $repayWay;

    // 状态0-正常 1-冻结 2-终止
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 发放日期（兼容字段）
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $payDateSup;

    // 到期日期（兼容字段）
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $expireDateSup;
    protected $_name = [
        'creditAmount'  => 'credit_amount',
        'restAmount'    => 'rest_amount',
        'payDate'       => 'pay_date',
        'expireDate'    => 'expire_date',
        'rateUnit'      => 'rate_unit',
        'rateValue'     => 'rate_value',
        'repayWay'      => 'repay_way',
        'status'        => 'status',
        'payDateSup'    => 'pay_date_sup',
        'expireDateSup' => 'expire_date_sup',
    ];

    public function validate()
    {
        Model::validateRequired('creditAmount', $this->creditAmount, true);
        Model::validateRequired('restAmount', $this->restAmount, true);
        Model::validateRequired('payDate', $this->payDate, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
        Model::validateRequired('rateUnit', $this->rateUnit, true);
        Model::validateRequired('rateValue', $this->rateValue, true);
        Model::validateRequired('repayWay', $this->repayWay, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('payDate', $this->payDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('expireDate', $this->expireDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('payDateSup', $this->payDateSup, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('expireDateSup', $this->expireDateSup, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->rateUnit) {
            $res['rate_unit'] = $this->rateUnit;
        }
        if (null !== $this->rateValue) {
            $res['rate_value'] = $this->rateValue;
        }
        if (null !== $this->repayWay) {
            $res['repay_way'] = $this->repayWay;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->payDateSup) {
            $res['pay_date_sup'] = $this->payDateSup;
        }
        if (null !== $this->expireDateSup) {
            $res['expire_date_sup'] = $this->expireDateSup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreditAmount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['rate_unit'])) {
            $model->rateUnit = $map['rate_unit'];
        }
        if (isset($map['rate_value'])) {
            $model->rateValue = $map['rate_value'];
        }
        if (isset($map['repay_way'])) {
            $model->repayWay = $map['repay_way'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['pay_date_sup'])) {
            $model->payDateSup = $map['pay_date_sup'];
        }
        if (isset($map['expire_date_sup'])) {
            $model->expireDateSup = $map['expire_date_sup'];
        }

        return $model;
    }
}
