<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateTradeOrderResult extends Model
{
    // 订单号
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $orderId;

    // 下单时的订单号
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $bizNo;

    // 实例ID列表
    /**
     * @example
     *
     * @var string[]
     */
    public $instanceIds;

    // 订单状态
    /**
     * @example PAY_SUCCESS
     *
     * @var string
     */
    public $payStatus;

    // 订购错误码
    /**
     * @example 订购错误码
     *
     * @var string
     */
    public $orderErrorCode;

    // 订购错误描述
    /**
     * @example 订购错误描述
     *
     * @var string
     */
    public $orderErrorDescription;
    protected $_name = [
        'orderId'               => 'order_id',
        'bizNo'                 => 'biz_no',
        'instanceIds'           => 'instance_ids',
        'payStatus'             => 'pay_status',
        'orderErrorCode'        => 'order_error_code',
        'orderErrorDescription' => 'order_error_description',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('payStatus', $this->payStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->instanceIds) {
            $res['instance_ids'] = $this->instanceIds;
        }
        if (null !== $this->payStatus) {
            $res['pay_status'] = $this->payStatus;
        }
        if (null !== $this->orderErrorCode) {
            $res['order_error_code'] = $this->orderErrorCode;
        }
        if (null !== $this->orderErrorDescription) {
            $res['order_error_description'] = $this->orderErrorDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTradeOrderResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['instance_ids'])) {
            if (!empty($map['instance_ids'])) {
                $model->instanceIds = $map['instance_ids'];
            }
        }
        if (isset($map['pay_status'])) {
            $model->payStatus = $map['pay_status'];
        }
        if (isset($map['order_error_code'])) {
            $model->orderErrorCode = $map['order_error_code'];
        }
        if (isset($map['order_error_description'])) {
            $model->orderErrorDescription = $map['order_error_description'];
        }

        return $model;
    }
}
