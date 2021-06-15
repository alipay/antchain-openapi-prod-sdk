<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OrderInfo extends Model
{
    // 出租方平台名称
    /**
     * @example 租赁宝
     *
     * @var string
     */
    public $lessorPlatformName;

    // 订单号
    /**
     * @example 232278957595482
     *
     * @var string
     */
    public $orderNumber;

    // 合同编号
    /**
     * @example 232278957595482
     *
     * @var string
     */
    public $contractNo;

    // 合同名称
    /**
     * @example 租赁宝合同
     *
     * @var string
     */
    public $contractName;

    // 订单商品信息
    /**
     * @example
     *
     * @var OrderItem[]
     */
    public $orderItems;

    // 设备及配件总价
    /**
     * @example 123.00
     *
     * @var string
     */
    public $totalDevicePrice;

    // 押金金额
    /**
     * @example 123.00
     *
     * @var string
     */
    public $depositAmount;

    // 免押金额
    /**
     * @example 1123.00
     *
     * @var string
     */
    public $freeDeposit;

    // 签约时间
    /**
     * @example 2021-05-07 17:13:50
     *
     * @var string
     */
    public $signingTime;

    // 租期起始时间
    /**
     * @example 2021-05-07 17:13:50
     *
     * @var string
     */
    public $leaseStartTime;

    // 租期结束时间
    /**
     * @example 2021-05-07 17:13:50
     *
     * @var string
     */
    public $leaseEndTime;

    // 买断金额计算公式
    /**
     * @example 到期转售买断款+未还租金-实付押金
     *
     * @var string
     */
    public $buyoutAmountFormulaCalc;

    // 首付款
    /**
     * @example 123.00
     *
     * @var string
     */
    public $payInAdvance;
    protected $_name = [
        'lessorPlatformName'      => 'lessor_platform_name',
        'orderNumber'             => 'order_number',
        'contractNo'              => 'contract_no',
        'contractName'            => 'contract_name',
        'orderItems'              => 'order_items',
        'totalDevicePrice'        => 'total_device_price',
        'depositAmount'           => 'deposit_amount',
        'freeDeposit'             => 'free_deposit',
        'signingTime'             => 'signing_time',
        'leaseStartTime'          => 'lease_start_time',
        'leaseEndTime'            => 'lease_end_time',
        'buyoutAmountFormulaCalc' => 'buyout_amount_formula_calc',
        'payInAdvance'            => 'pay_in_advance',
    ];

    public function validate()
    {
        Model::validateRequired('lessorPlatformName', $this->lessorPlatformName, true);
        Model::validateRequired('orderNumber', $this->orderNumber, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('orderItems', $this->orderItems, true);
        Model::validateRequired('totalDevicePrice', $this->totalDevicePrice, true);
        Model::validateRequired('depositAmount', $this->depositAmount, true);
        Model::validateRequired('freeDeposit', $this->freeDeposit, true);
        Model::validateRequired('signingTime', $this->signingTime, true);
        Model::validateRequired('leaseStartTime', $this->leaseStartTime, true);
        Model::validateRequired('leaseEndTime', $this->leaseEndTime, true);
        Model::validateRequired('buyoutAmountFormulaCalc', $this->buyoutAmountFormulaCalc, true);
        Model::validateRequired('payInAdvance', $this->payInAdvance, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lessorPlatformName) {
            $res['lessor_platform_name'] = $this->lessorPlatformName;
        }
        if (null !== $this->orderNumber) {
            $res['order_number'] = $this->orderNumber;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->orderItems) {
            $res['order_items'] = [];
            if (null !== $this->orderItems && \is_array($this->orderItems)) {
                $n = 0;
                foreach ($this->orderItems as $item) {
                    $res['order_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalDevicePrice) {
            $res['total_device_price'] = $this->totalDevicePrice;
        }
        if (null !== $this->depositAmount) {
            $res['deposit_amount'] = $this->depositAmount;
        }
        if (null !== $this->freeDeposit) {
            $res['free_deposit'] = $this->freeDeposit;
        }
        if (null !== $this->signingTime) {
            $res['signing_time'] = $this->signingTime;
        }
        if (null !== $this->leaseStartTime) {
            $res['lease_start_time'] = $this->leaseStartTime;
        }
        if (null !== $this->leaseEndTime) {
            $res['lease_end_time'] = $this->leaseEndTime;
        }
        if (null !== $this->buyoutAmountFormulaCalc) {
            $res['buyout_amount_formula_calc'] = $this->buyoutAmountFormulaCalc;
        }
        if (null !== $this->payInAdvance) {
            $res['pay_in_advance'] = $this->payInAdvance;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lessor_platform_name'])) {
            $model->lessorPlatformName = $map['lessor_platform_name'];
        }
        if (isset($map['order_number'])) {
            $model->orderNumber = $map['order_number'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['order_items'])) {
            if (!empty($map['order_items'])) {
                $model->orderItems = [];
                $n                 = 0;
                foreach ($map['order_items'] as $item) {
                    $model->orderItems[$n++] = null !== $item ? OrderItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_device_price'])) {
            $model->totalDevicePrice = $map['total_device_price'];
        }
        if (isset($map['deposit_amount'])) {
            $model->depositAmount = $map['deposit_amount'];
        }
        if (isset($map['free_deposit'])) {
            $model->freeDeposit = $map['free_deposit'];
        }
        if (isset($map['signing_time'])) {
            $model->signingTime = $map['signing_time'];
        }
        if (isset($map['lease_start_time'])) {
            $model->leaseStartTime = $map['lease_start_time'];
        }
        if (isset($map['lease_end_time'])) {
            $model->leaseEndTime = $map['lease_end_time'];
        }
        if (isset($map['buyout_amount_formula_calc'])) {
            $model->buyoutAmountFormulaCalc = $map['buyout_amount_formula_calc'];
        }
        if (isset($map['pay_in_advance'])) {
            $model->payInAdvance = $map['pay_in_advance'];
        }

        return $model;
    }
}
