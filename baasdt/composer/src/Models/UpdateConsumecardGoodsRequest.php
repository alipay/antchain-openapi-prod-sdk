<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateConsumecardGoodsRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 默认价格
    /**
     * @var string
     */
    public $defaultPrice;

    // 商品描述
    /**
     * @var string
     */
    public $description;

    // 描述图片url
    /**
     * @var string
     */
    public $descImages;

    // 商品标价
    /**
     * @var string
     */
    public $displayPrice;

    // 商品ID
    /**
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;

    // 主图片url
    /**
     * @var string
     */
    public $images;

    // 商品每日上限
    /**
     * @var int
     */
    public $limitPerUserAndDay;

    // 商品每月上限
    /**
     * @var int
     */
    public $limitPerUserAndMonth;

    // 商品库存
    /**
     * @var int
     */
    public $totalCount;

    // 商品有效结束时间(UNIX毫秒时间戳)
    /**
     * @var int
     */
    public $validNotAfter;

    // 商品有效开始时间(UNIX毫秒时间戳)
    /**
     * @var int
     */
    public $validNotBefore;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'baseRequest'          => 'base_request',
        'defaultPrice'         => 'default_price',
        'description'          => 'description',
        'descImages'           => 'desc_images',
        'displayPrice'         => 'display_price',
        'goodsId'              => 'goods_id',
        'goodsName'            => 'goods_name',
        'images'               => 'images',
        'limitPerUserAndDay'   => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'totalCount'           => 'total_count',
        'validNotAfter'        => 'valid_not_after',
        'validNotBefore'       => 'valid_not_before',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('defaultPrice', $this->defaultPrice, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('descImages', $this->descImages, true);
        Model::validateRequired('displayPrice', $this->displayPrice, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('limitPerUserAndDay', $this->limitPerUserAndDay, true);
        Model::validateRequired('limitPerUserAndMonth', $this->limitPerUserAndMonth, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('validNotAfter', $this->validNotAfter, true);
        Model::validateRequired('validNotBefore', $this->validNotBefore, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->displayPrice) {
            $res['display_price'] = $this->displayPrice;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->limitPerUserAndDay) {
            $res['limit_per_user_and_day'] = $this->limitPerUserAndDay;
        }
        if (null !== $this->limitPerUserAndMonth) {
            $res['limit_per_user_and_month'] = $this->limitPerUserAndMonth;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->validNotAfter) {
            $res['valid_not_after'] = $this->validNotAfter;
        }
        if (null !== $this->validNotBefore) {
            $res['valid_not_before'] = $this->validNotBefore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateConsumecardGoodsRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['default_price'])) {
            $model->defaultPrice = $map['default_price'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['desc_images'])) {
            $model->descImages = $map['desc_images'];
        }
        if (isset($map['display_price'])) {
            $model->displayPrice = $map['display_price'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['limit_per_user_and_day'])) {
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if (isset($map['limit_per_user_and_month'])) {
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['valid_not_after'])) {
            $model->validNotAfter = $map['valid_not_after'];
        }
        if (isset($map['valid_not_before'])) {
            $model->validNotBefore = $map['valid_not_before'];
        }

        return $model;
    }
}
