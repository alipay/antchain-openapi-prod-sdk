<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateOrderResult extends Model
{
    // 下单时指定的业务流水号。二级订单号
    /**
     * @example 2088****
     *
     * @var string
     */
    public $bsnNo;

    // 一级订单号
    /**
     * @example 2088*****
     *
     * @var string
     */
    public $orderId;

    // 二级订单号
    /**
     * @example 2088*****
     *
     * @var string
     */
    public $normalOrderLineId;

    // 订单状态
    /**
     * @example ORDER_INIT
     *
     * @var string
     */
    public $orderStatus;

    // 实例列表
    /**
     * @example A0****
     *
     * @var string
     */
    public $instanceIds;

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
        'bsnNo'                 => 'bsn_no',
        'orderId'               => 'order_id',
        'normalOrderLineId'     => 'normal_order_line_id',
        'orderStatus'           => 'order_status',
        'instanceIds'           => 'instance_ids',
        'orderErrorCode'        => 'order_error_code',
        'orderErrorDescription' => 'order_error_description',
    ];

    public function validate()
    {
        Model::validateRequired('bsnNo', $this->bsnNo, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('normalOrderLineId', $this->normalOrderLineId, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('instanceIds', $this->instanceIds, true);
        Model::validateRequired('orderErrorCode', $this->orderErrorCode, true);
        Model::validateRequired('orderErrorDescription', $this->orderErrorDescription, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bsnNo) {
            $res['bsn_no'] = $this->bsnNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->normalOrderLineId) {
            $res['normal_order_line_id'] = $this->normalOrderLineId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->instanceIds) {
            $res['instance_ids'] = $this->instanceIds;
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
     * @return CreateOrderResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bsn_no'])) {
            $model->bsnNo = $map['bsn_no'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['normal_order_line_id'])) {
            $model->normalOrderLineId = $map['normal_order_line_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['instance_ids'])) {
            $model->instanceIds = $map['instance_ids'];
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
