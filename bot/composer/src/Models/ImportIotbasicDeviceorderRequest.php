<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportIotbasicDeviceorderRequest extends Model
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

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 订单状态: 已支付
    /**
     * @var string
     */
    public $orderStatus;

    // 订单采购设备清单
    /**
     * @var IotBasicDeviceOrderItem[]
     */
    public $orderDeviceList;

    // 商家ID，唯一编号
    /**
     * @var string
     */
    public $merchantId;

    // 订单总金额，精确到小数后两位
    /**
     * @var string
     */
    public $totalAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'orderId'           => 'order_id',
        'orderStatus'       => 'order_status',
        'orderDeviceList'   => 'order_device_list',
        'merchantId'        => 'merchant_id',
        'totalAmount'       => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('orderDeviceList', $this->orderDeviceList, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIotbasicDeviceorderRequest
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
