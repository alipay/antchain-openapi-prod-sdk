<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceorderRequest extends Model
{
    // 订单id
    /**
     * @example 20034932
     *
     * @var string
     */
    public $orderId;

    // 支付状态
    /**
     * @example PAID,UNPAID,PAYMENT_FAILED
     *
     * @var string
     */
    public $orderStatus;

    // 商家唯一id
    /**
     * @example 30099234
     *
     * @var string
     */
    public $merchantId;

    // 设备订单元素集合
    /**
     * @example
     *
     * @var IotBasicDeviceOrderItem[]
     */
    public $orderDeviceList;

    // 订单总金额，精确到小数点后两位
    /**
     * @example 22220.98
     *
     * @var string
     */
    public $totalAmount;
    protected $_name = [
        'orderId'         => 'order_id',
        'orderStatus'     => 'order_status',
        'merchantId'      => 'merchant_id',
        'orderDeviceList' => 'order_device_list',
        'totalAmount'     => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderDeviceList', $this->orderDeviceList, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderDeviceList) {
            $res['order_device_list'] = [];
            if (null !== $this->orderDeviceList && \is_array($this->orderDeviceList)) {
                $n = 0;
                foreach ($this->orderDeviceList as $item) {
                    $res['order_device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceorderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_device_list'])) {
            if (!empty($map['order_device_list'])) {
                $model->orderDeviceList = [];
                $n                      = 0;
                foreach ($map['order_device_list'] as $item) {
                    $model->orderDeviceList[$n++] = null !== $item ? IotBasicDeviceOrderItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
