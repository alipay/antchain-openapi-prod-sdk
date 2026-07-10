<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class UpdateGoodsRequest extends Model
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

    // 商品id
    /**
     * @var string
     */
    public $goodsId;

    // 商品价格（分）
    /**
     * @var int
     */
    public $standardPriceInCent;

    // 商品状态:上架，下架
    /**
     * @var string
     */
    public $goodsStatus;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'goodsId'             => 'goods_id',
        'standardPriceInCent' => 'standard_price_in_cent',
        'goodsStatus'         => 'goods_status',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
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
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->standardPriceInCent) {
            $res['standard_price_in_cent'] = $this->standardPriceInCent;
        }
        if (null !== $this->goodsStatus) {
            $res['goods_status'] = $this->goodsStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGoodsRequest
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
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['standard_price_in_cent'])) {
            $model->standardPriceInCent = $map['standard_price_in_cent'];
        }
        if (isset($map['goods_status'])) {
            $model->goodsStatus = $map['goods_status'];
        }

        return $model;
    }
}
