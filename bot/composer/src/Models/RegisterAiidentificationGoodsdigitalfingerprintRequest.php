<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterAiidentificationGoodsdigitalfingerprintRequest extends Model
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

    // 用户身份标识
    /**
     * @var string
     */
    public $appKey;

    // 商品数字指纹信息
    /**
     * @var GoodsDigitalFingerprintInfo
     */
    public $goodsInfo;

    // 商品数字指纹用户信息
    /**
     * @var GoodsDigitalFingerprintUserInfo
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appKey'            => 'app_key',
        'goodsInfo'         => 'goods_info',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('goodsInfo', $this->goodsInfo, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
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
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->goodsInfo) {
            $res['goods_info'] = null !== $this->goodsInfo ? $this->goodsInfo->toMap() : null;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterAiidentificationGoodsdigitalfingerprintRequest
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
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['goods_info'])) {
            $model->goodsInfo = GoodsDigitalFingerprintInfo::fromMap($map['goods_info']);
        }
        if (isset($map['user_info'])) {
            $model->userInfo = GoodsDigitalFingerprintUserInfo::fromMap($map['user_info']);
        }

        return $model;
    }
}
