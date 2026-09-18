<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class NotifyPoiTradeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'bizOrderNo' => 'biz_order_no',
        'status' => 'status',
        'tradeNo' => 'trade_no',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('extraInfo', $this->extraInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotifyPoiTradeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
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

    // 渠道Code
    /**
     * @var string
     */
    public $channelCode;

    // 子渠道Code
    /**
     * @var string
     */
    public $trafficPlatform;

    // 原始订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 交易状态
    /**
     * @var string
     */
    public $status;

    // 交易订单号
    /**
     * @var string
     */
    public $tradeNo;

    // 拓展字段
    /**
     * @var string
     */
    public $extraInfo;

}
