<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoTradeFullRequest extends Model
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

    // 购买用户信息
    /**
     * @var UserSyncInfo
     */
    public $userInfo;

    // 主订单信息
    /**
     * @var OrderInfo
     */
    public $orderInfo;

    // 订单包含的商品信息列表
    /**
     * @var GoodsInfo
     */
    public $goodsInfo;

    // 订单还款计划
    /**
     * @var PromiseInfo
     */
    public $promiseInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userInfo'          => 'user_info',
        'orderInfo'         => 'order_info',
        'goodsInfo'         => 'goods_info',
        'promiseInfo'       => 'promise_info',
    ];

    public function validate()
    {
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('orderInfo', $this->orderInfo, true);
        Model::validateRequired('goodsInfo', $this->goodsInfo, true);
        Model::validateRequired('promiseInfo', $this->promiseInfo, true);
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
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->orderInfo) {
            $res['order_info'] = null !== $this->orderInfo ? $this->orderInfo->toMap() : null;
        }
        if (null !== $this->goodsInfo) {
            $res['goods_info'] = null !== $this->goodsInfo ? $this->goodsInfo->toMap() : null;
        }
        if (null !== $this->promiseInfo) {
            $res['promise_info'] = null !== $this->promiseInfo ? $this->promiseInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoTradeFullRequest
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
        if (isset($map['user_info'])) {
            $model->userInfo = UserSyncInfo::fromMap($map['user_info']);
        }
        if (isset($map['order_info'])) {
            $model->orderInfo = OrderInfo::fromMap($map['order_info']);
        }
        if (isset($map['goods_info'])) {
            $model->goodsInfo = GoodsInfo::fromMap($map['goods_info']);
        }
        if (isset($map['promise_info'])) {
            $model->promiseInfo = PromiseInfo::fromMap($map['promise_info']);
        }

        return $model;
    }
}
