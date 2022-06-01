<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CheckAiidentificationGoodspointRequest extends Model
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

    // 用户调用标识
    /**
     * @var string
     */
    public $appKey;

    // 品类
    /**
     * @var string
     */
    public $category;

    // 品牌
    /**
     * @var string
     */
    public $brand;

    // 款式
    /**
     * @var string
     */
    public $style;

    // 鉴定点信息
    /**
     * @var BaiGoodsPoint
     */
    public $pointInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appKey'            => 'app_key',
        'category'          => 'category',
        'brand'             => 'brand',
        'style'             => 'style',
        'pointInfo'         => 'point_info',
    ];

    public function validate()
    {
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('brand', $this->brand, true);
        Model::validateRequired('style', $this->style, true);
        Model::validateRequired('pointInfo', $this->pointInfo, true);
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
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->brand) {
            $res['brand'] = $this->brand;
        }
        if (null !== $this->style) {
            $res['style'] = $this->style;
        }
        if (null !== $this->pointInfo) {
            $res['point_info'] = null !== $this->pointInfo ? $this->pointInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAiidentificationGoodspointRequest
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
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['brand'])) {
            $model->brand = $map['brand'];
        }
        if (isset($map['style'])) {
            $model->style = $map['style'];
        }
        if (isset($map['point_info'])) {
            $model->pointInfo = BaiGoodsPoint::fromMap($map['point_info']);
        }

        return $model;
    }
}
