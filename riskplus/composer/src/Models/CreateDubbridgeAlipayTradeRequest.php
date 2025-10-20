<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateDubbridgeAlipayTradeRequest extends Model
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

    // request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 门店所属子品牌
    /**
     * @var string
     */
    public $trafficPlatform;

    // 订单归属门店id
    /**
     * @var string
     */
    public $storeId;

    // 订单车辆信息
    /**
     * @var VehicleInfo
     */
    public $vehicleInfo;

    // 订单绝对超时时间 yyyy-MM-dd HH:mm:ss，支付宝结算生成订单二维码时传值（非必填，优先于 timeout_express)
    /**
     * @var string
     */
    public $timeExpire;

    // 订单相对超时时间，从预下单请求时间开始计算，该笔订单允许的最晚付款时间，逾期将关闭交易（非必填）
    /**
     * @var string
     */
    public $timeoutExpress;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'trafficPlatform'   => 'traffic_platform',
        'storeId'           => 'store_id',
        'vehicleInfo'       => 'vehicle_info',
        'timeExpire'        => 'time_expire',
        'timeoutExpress'    => 'timeout_express',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('vehicleInfo', $this->vehicleInfo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->vehicleInfo) {
            $res['vehicle_info'] = null !== $this->vehicleInfo ? $this->vehicleInfo->toMap() : null;
        }
        if (null !== $this->timeExpire) {
            $res['time_expire'] = $this->timeExpire;
        }
        if (null !== $this->timeoutExpress) {
            $res['timeout_express'] = $this->timeoutExpress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDubbridgeAlipayTradeRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['vehicle_info'])) {
            $model->vehicleInfo = VehicleInfo::fromMap($map['vehicle_info']);
        }
        if (isset($map['time_expire'])) {
            $model->timeExpire = $map['time_expire'];
        }
        if (isset($map['timeout_express'])) {
            $model->timeoutExpress = $map['timeout_express'];
        }

        return $model;
    }
}
