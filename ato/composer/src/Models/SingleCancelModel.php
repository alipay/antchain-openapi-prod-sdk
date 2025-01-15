<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SingleCancelModel extends Model
{
    // 第几期
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 其他方式还款的时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtPay;

    // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $payOffAmount;

    // 变更其他方式还款WECHAT:微信; BANK:银行
    // ALIPAY:支付宝
    // CASH:现金
    /**
     * @example WECHAT
     *
     * @var string
     */
    public $payOffType;

    // 通过其他方式还款单号;例如银行流水号或微信流水号
    /**
     * @example 1234
     *
     * @var string
     */
    public $payOffNo;

    // 其他方式还款银行名称，还款方式为银行时必填
    /**
     * @example 中国银行
     *
     * @var string
     */
    public $payOffBankName;
    protected $_name = [
        'periodNum'      => 'period_num',
        'gmtPay'         => 'gmt_pay',
        'payOffAmount'   => 'pay_off_amount',
        'payOffType'     => 'pay_off_type',
        'payOffNo'       => 'pay_off_no',
        'payOffBankName' => 'pay_off_bank_name',
    ];

    public function validate()
    {
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('gmtPay', $this->gmtPay, true);
        Model::validateRequired('payOffAmount', $this->payOffAmount, true);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('payOffAmount', $this->payOffAmount, 0);
        Model::validatePattern('gmtPay', $this->gmtPay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMaxLength('payOffType', $this->payOffType, 64);
        Model::validateMaxLength('payOffNo', $this->payOffNo, 64);
        Model::validateMaxLength('payOffBankName', $this->payOffBankName, 64);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->gmtPay) {
            $res['gmt_pay'] = $this->gmtPay;
        }
        if (null !== $this->payOffAmount) {
            $res['pay_off_amount'] = $this->payOffAmount;
        }
        if (null !== $this->payOffType) {
            $res['pay_off_type'] = $this->payOffType;
        }
        if (null !== $this->payOffNo) {
            $res['pay_off_no'] = $this->payOffNo;
        }
        if (null !== $this->payOffBankName) {
            $res['pay_off_bank_name'] = $this->payOffBankName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SingleCancelModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['gmt_pay'])) {
            $model->gmtPay = $map['gmt_pay'];
        }
        if (isset($map['pay_off_amount'])) {
            $model->payOffAmount = $map['pay_off_amount'];
        }
        if (isset($map['pay_off_type'])) {
            $model->payOffType = $map['pay_off_type'];
        }
        if (isset($map['pay_off_no'])) {
            $model->payOffNo = $map['pay_off_no'];
        }
        if (isset($map['pay_off_bank_name'])) {
            $model->payOffBankName = $map['pay_off_bank_name'];
        }

        return $model;
    }
}
