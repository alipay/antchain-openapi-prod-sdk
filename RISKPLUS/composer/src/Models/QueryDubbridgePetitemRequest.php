<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\GoodsOrderInfo;

class QueryDubbridgePetitemRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'trafficPlatform' => 'traffic_platform',
        'storeId' => 'store_id',
        'bizOrderNo' => 'biz_order_no',
        'channelCode' => 'channel_code',
        'mallAvailableBalance' => 'mall_available_balance',
        'mallConsumeUnsettleOrders' => 'mall_consume_unsettle_orders',
        'requestNo' => 'request_no',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('mallAvailableBalance', $this->mallAvailableBalance, true);
        Model::validateRequired('mallConsumeUnsettleOrders', $this->mallConsumeUnsettleOrders, true);
        Model::validateRequired('requestNo', $this->requestNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->mallAvailableBalance) {
            $res['mall_available_balance'] = $this->mallAvailableBalance;
        }
        if (null !== $this->mallConsumeUnsettleOrders) {
            $res['mall_consume_unsettle_orders'] = [];
            if(null !== $this->mallConsumeUnsettleOrders && is_array($this->mallConsumeUnsettleOrders)){
                $n = 0;
                foreach($this->mallConsumeUnsettleOrders as $item){
                    $res['mall_consume_unsettle_orders'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgePetitemRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['store_id'])){
            $model->storeId = $map['store_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['mall_available_balance'])){
            $model->mallAvailableBalance = $map['mall_available_balance'];
        }
        if(isset($map['mall_consume_unsettle_orders'])){
            if(!empty($map['mall_consume_unsettle_orders'])){
                $model->mallConsumeUnsettleOrders = [];
                $n = 0;
                foreach($map['mall_consume_unsettle_orders'] as $item) {
                    $model->mallConsumeUnsettleOrders[$n++] = null !== $item ? GoodsOrderInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['request_no'])){
            $model->requestNo = $map['request_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 小程序客户号
    /**
     * @var string
     */
    public $openId;

    // 子渠道号(唯一标识)
    /**
     * @var string
     */
    public $trafficPlatform;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 分期订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 商城可用余额
    /**
     * @var string
     */
    public $mallAvailableBalance;

    // 商城消费在途未结算订单
    /**
     * @var GoodsOrderInfo[]
     */
    public $mallConsumeUnsettleOrders;

    // 请求流水号(通过此流水号幂等判断是否是同一个请求)
    /**
     * @var string
     */
    public $requestNo;

}
