<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class RepayAntchainAtoWithholdPlanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 第几期
    /**
     * @var int
     */
    public $periodNum;

    // 扣款时间
    /**
     * @var string
     */
    public $gmtPay;

    // 清偿清欠金额，单位为分
    /**
     * @var int
     */
    public $payOffAmount;

    // 清偿清欠方式
    // WECHAT:微信;
    // BANK:银行
    /**
     * @var string
     */
    public $payOffType;

    // 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
    /**
     * @var string
     */
    public $payOffNo;

    // 清偿清欠银行名称,方式为银行时必填
    /**
     * @var string
     */
    public $payOffBankName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'periodNum'         => 'period_num',
        'gmtPay'            => 'gmt_pay',
        'payOffAmount'      => 'pay_off_amount',
        'payOffType'        => 'pay_off_type',
        'payOffNo'          => 'pay_off_no',
        'payOffBankName'    => 'pay_off_bank_name',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('gmtPay', $this->gmtPay, true);
        Model::validateRequired('payOffAmount', $this->payOffAmount, true);
        Model::validateRequired('payOffType', $this->payOffType, true);
        Model::validateRequired('payOffNo', $this->payOffNo, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('payOffType', $this->payOffType, 64);
        Model::validateMaxLength('payOffNo', $this->payOffNo, 64);
        Model::validateMaxLength('payOffBankName', $this->payOffBankName, 64);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('payOffAmount', $this->payOffAmount, 0);
        Model::validatePattern('gmtPay', $this->gmtPay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
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
     * @return RepayAntchainAtoWithholdPlanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
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
