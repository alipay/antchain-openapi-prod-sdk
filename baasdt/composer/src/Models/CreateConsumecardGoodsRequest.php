<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateConsumecardGoodsRequest extends Model
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

    // 商品授权类型
    /**
     * @var int
     */
    public $authType;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 默认价格(单位:元,精确到分)
    /**
     * @var string
     */
    public $defaultPrice;

    // 代理操作的链上ID
    /**
     * @var string
     */
    public $delegateAccountId;

    // 商品描述
    /**
     * @var string
     */
    public $description;

    // 商品描述图片url，多个图片间用;隔开
    /**
     * @var string
     */
    public $descImages;

    // 商品标价
    /**
     * @var string
     */
    public $displayPrice;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;

    // 商品类型
    /**
     * @var string
     */
    public $goodsType;

    // 是否公开
    /**
     * @var bool
     */
    public $ifPublic;

    // 商品主图片url
    /**
     * @var string
     */
    public $image;

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

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'authType'             => 'auth_type',
        'baseRequest'          => 'base_request',
        'defaultPrice'         => 'default_price',
        'delegateAccountId'    => 'delegate_account_id',
        'description'          => 'description',
        'descImages'           => 'desc_images',
        'displayPrice'         => 'display_price',
        'goodsName'            => 'goods_name',
        'goodsType'            => 'goods_type',
        'ifPublic'             => 'if_public',
        'image'                => 'image',
        'limitPerUserAndDay'   => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'totalCount'           => 'total_count',
        'validNotAfter'        => 'valid_not_after',
        'validNotBefore'       => 'valid_not_before',
        'memo'                 => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('defaultPrice', $this->defaultPrice, true);
        Model::validateRequired('delegateAccountId', $this->delegateAccountId, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('descImages', $this->descImages, true);
        Model::validateRequired('displayPrice', $this->displayPrice, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsType', $this->goodsType, true);
        Model::validateRequired('ifPublic', $this->ifPublic, true);
        Model::validateRequired('image', $this->image, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->delegateAccountId) {
            $res['delegate_account_id'] = $this->delegateAccountId;
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
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->ifPublic) {
            $res['if_public'] = $this->ifPublic;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateConsumecardGoodsRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['default_price'])) {
            $model->defaultPrice = $map['default_price'];
        }
        if (isset($map['delegate_account_id'])) {
            $model->delegateAccountId = $map['delegate_account_id'];
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
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['if_public'])) {
            $model->ifPublic = $map['if_public'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
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
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
