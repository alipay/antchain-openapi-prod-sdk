<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimOrderInfo extends Model
{
    // 订单ID
    /**
     * @example
     *
     * @var string
     */
    public $orderId;

    // 必填	销售id
    /**
     * @example
     *
     * @var string
     */
    public $salesId;

    // 车辆SN号
    /**
     * @example
     *
     * @var string
     */
    public $sn;

    // 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
    /**
     * @example FULL
     *
     * @var string
     */
    public $paymentType;

    // 支付时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @example 2025-01-01 00:00:00
     *
     * @var string
     */
    public $paymentTime;

    // 总金额，单位元
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $totalAmount;

    // 订单状态，枚举值
    // UNPAID（未支付），
    // PAID（已支付），
    // CANCEL（订单取消），
    // PENDING（支付中），
    // FAILED（支付失败）
    /**
     * @example PAID
     *
     * @var string
     */
    public $status;

    // 车辆SKU名字
    /**
     * @example
     *
     * @var string
     */
    public $skuName;

    // 车型
    /**
     * @example
     *
     * @var string
     */
    public $vehicleModel;

    // 颜色
    /**
     * @example
     *
     * @var string
     */
    public $color;
    protected $_name = [
        'orderId'      => 'order_id',
        'salesId'      => 'sales_id',
        'sn'           => 'sn',
        'paymentType'  => 'payment_type',
        'paymentTime'  => 'payment_time',
        'totalAmount'  => 'total_amount',
        'status'       => 'status',
        'skuName'      => 'sku_name',
        'vehicleModel' => 'vehicle_model',
        'color'        => 'color',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('salesId', $this->salesId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->salesId) {
            $res['sales_id'] = $this->salesId;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->paymentType) {
            $res['payment_type'] = $this->paymentType;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->vehicleModel) {
            $res['vehicle_model'] = $this->vehicleModel;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['sales_id'])) {
            $model->salesId = $map['sales_id'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['payment_type'])) {
            $model->paymentType = $map['payment_type'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['vehicle_model'])) {
            $model->vehicleModel = $map['vehicle_model'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }

        return $model;
    }
}
