<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RepayWithholdPlanRequest extends Model
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

    // 第几期，单期取消必填
    /**
     * @var int
     */
    public $periodNum;

    // 取消订单某一期代扣计划中以其他方式还款金额，单位为分，单期取消必填
    /**
     * @var string
     */
    public $gmtPay;

    // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
    /**
     * @var int
     */
    public $payOffAmount;

    // 变更其他方式还款
    // WECHAT:微信;
    // BANK:银行
    // ALIPAY:支付宝
    /**
     * @var string
     */
    public $payOffType;

    // 通过其他方式还款单号;例如银行流水号或微信流水号
    /**
     * @var string
     */
    public $payOffNo;

    // 其他方式还款银行名称，还款方式为银行时必填
    /**
     * @var string
     */
    public $payOffBankName;

    // 操作，默认为单期取消；
    // 多期取消：MULTI_CANCEL
    // 单期取消：SINGLE_CANCEL
    /**
     * @var string
     */
    public $operation;

    // 取消列表，多期取消必填
    /**
     * @var SingleCancelModel[]
     */
    public $cancelList;
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
        'operation'         => 'operation',
        'cancelList'        => 'cancel_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('payOffType', $this->payOffType, 64);
        Model::validateMaxLength('payOffNo', $this->payOffNo, 64);
        Model::validateMaxLength('payOffBankName', $this->payOffBankName, 64);
        Model::validateMaxLength('operation', $this->operation, 64);
        Model::validateMinimum('periodNum', $this->periodNum, 1);
        Model::validateMinimum('payOffAmount', $this->payOffAmount, 0);
        Model::validatePattern('gmtPay', $this->gmtPay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMinLength('operation', $this->operation, 0);
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
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->cancelList) {
            $res['cancel_list'] = [];
            if (null !== $this->cancelList && \is_array($this->cancelList)) {
                $n = 0;
                foreach ($this->cancelList as $item) {
                    $res['cancel_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayWithholdPlanRequest
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
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['cancel_list'])) {
            if (!empty($map['cancel_list'])) {
                $model->cancelList = [];
                $n                 = 0;
                foreach ($map['cancel_list'] as $item) {
                    $model->cancelList[$n++] = null !== $item ? SingleCancelModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
