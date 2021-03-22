<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class GoodsResponse extends Model
{
    // 商品归属的账户ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb166486abcdf
     *
     * @var string
     */
    public $accountId;

    // 商品名称
    /**
     * @example 商品001
     *
     * @var string
     */
    public $goodsName;

    // 商品类型
    /**
     * @example 0100020001
     *
     * @var string
     */
    public $goodsType;

    // 商品描述信息
    /**
     * @example 商品描述信息
     *
     * @var string
     */
    public $description;

    // 商品库存
    /**
     * @example 10000
     *
     * @var int
     */
    public $totalCount;

    // 显示价格
    /**
     * @example 100.01
     *
     * @var string
     */
    public $displayPrice;

    // 默认价格
    /**
     * @example 100.01
     *
     * @var string
     */
    public $defaultPrice;

    // 是否公开商品
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ifPublic;

    // 商品主图片URL
    /**
     * @example image://***
     *
     * @var string
     */
    public $images;

    // 商品描述图片，每个图片URL用:隔开
    /**
     * @example image://0001:image://0002:image://0003
     *
     * @var string
     */
    public $descImages;

    // 商品状态 0可用，1下线
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 商品开始时间
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $validNotBefore;

    // 商品结束时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $validNotAfter;

    // 商品每日上限
    /**
     * @example 100
     *
     * @var int
     */
    public $limitPerUserAndDay;

    // 商品每月上限
    /**
     * @example 1000
     *
     * @var int
     */
    public $limitPerUserAndMonth;

    // 商品备注信息
    /**
     * @example 商品备注信息
     *
     * @var string
     */
    public $memo;

    // 授权类型
    /**
     * @example 0
     *
     * @var int
     */
    public $authType;

    // 商品类型
    /**
     * @example 0100002000001
     *
     * @var string
     */
    public $categoryId;

    // 商品ID
    /**
     * @example 1456483e1702bef7fd3cceb5e7154b9880ef637daa1fb651e95c20c9f0c929cc
     *
     * @var string
     */
    public $goodsId;
    protected $_name = [
        'accountId'            => 'account_id',
        'goodsName'            => 'goods_name',
        'goodsType'            => 'goods_type',
        'description'          => 'description',
        'totalCount'           => 'total_count',
        'displayPrice'         => 'display_price',
        'defaultPrice'         => 'default_price',
        'ifPublic'             => 'if_public',
        'images'               => 'images',
        'descImages'           => 'desc_images',
        'status'               => 'status',
        'validNotBefore'       => 'valid_not_before',
        'validNotAfter'        => 'valid_not_after',
        'limitPerUserAndDay'   => 'limit_per_user_and_day',
        'limitPerUserAndMonth' => 'limit_per_user_and_month',
        'memo'                 => 'memo',
        'authType'             => 'auth_type',
        'categoryId'           => 'category_id',
        'goodsId'              => 'goods_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsType', $this->goodsType, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('displayPrice', $this->displayPrice, true);
        Model::validateRequired('defaultPrice', $this->defaultPrice, true);
        Model::validateRequired('ifPublic', $this->ifPublic, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('descImages', $this->descImages, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('validNotBefore', $this->validNotBefore, true);
        Model::validateRequired('validNotAfter', $this->validNotAfter, true);
        Model::validateRequired('limitPerUserAndDay', $this->limitPerUserAndDay, true);
        Model::validateRequired('limitPerUserAndMonth', $this->limitPerUserAndMonth, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->displayPrice) {
            $res['display_price'] = $this->displayPrice;
        }
        if (null !== $this->defaultPrice) {
            $res['default_price'] = $this->defaultPrice;
        }
        if (null !== $this->ifPublic) {
            $res['if_public'] = $this->ifPublic;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->validNotBefore) {
            $res['valid_not_before'] = $this->validNotBefore;
        }
        if (null !== $this->validNotAfter) {
            $res['valid_not_after'] = $this->validNotAfter;
        }
        if (null !== $this->limitPerUserAndDay) {
            $res['limit_per_user_and_day'] = $this->limitPerUserAndDay;
        }
        if (null !== $this->limitPerUserAndMonth) {
            $res['limit_per_user_and_month'] = $this->limitPerUserAndMonth;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['display_price'])) {
            $model->displayPrice = $map['display_price'];
        }
        if (isset($map['default_price'])) {
            $model->defaultPrice = $map['default_price'];
        }
        if (isset($map['if_public'])) {
            $model->ifPublic = $map['if_public'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['desc_images'])) {
            $model->descImages = $map['desc_images'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['valid_not_before'])) {
            $model->validNotBefore = $map['valid_not_before'];
        }
        if (isset($map['valid_not_after'])) {
            $model->validNotAfter = $map['valid_not_after'];
        }
        if (isset($map['limit_per_user_and_day'])) {
            $model->limitPerUserAndDay = $map['limit_per_user_and_day'];
        }
        if (isset($map['limit_per_user_and_month'])) {
            $model->limitPerUserAndMonth = $map['limit_per_user_and_month'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }

        return $model;
    }
}
