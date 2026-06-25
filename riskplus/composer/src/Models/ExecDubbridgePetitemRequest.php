<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecDubbridgePetitemRequest extends Model
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

    // 商城余额
    /**
     * @var string
     */
    public $goodsBalance;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'trafficPlatform'   => 'traffic_platform',
        'storeId'           => 'store_id',
        'bizOrderNo'        => 'biz_order_no',
        'goodsBalance'      => 'goods_balance',
        'channelCode'       => 'channel_code',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('goodsBalance', $this->goodsBalance, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->goodsBalance) {
            $res['goods_balance'] = $this->goodsBalance;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDubbridgePetitemRequest
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['goods_balance'])) {
            $model->goodsBalance = $map['goods_balance'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }

        return $model;
    }
}
