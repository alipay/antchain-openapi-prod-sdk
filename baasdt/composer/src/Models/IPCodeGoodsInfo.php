<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeGoodsInfo extends Model
{
    // 商品名称
    /**
     * @example 商品名称
     *
     * @var string
     */
    public $goodsName;

    // 商品链接
    /**
     * @example 商品链接
     *
     * @var string
     */
    public $goodsUrl;

    // 商品图片
    /**
     * @example 商品图片
     *
     * @var string
     */
    public $goodsImage;

    // 商品图片临时访问地址，可直接访问
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $goodsImageTmp;

    // 商品店铺名称/商品出品方
    /**
     * @example 商品店铺名称
     *
     * @var string
     */
    public $goodsStore;

    // 店铺logo图片链接
    /**
     * @example oss://myexchange/12566587671fc8f77d37...5dfb67fa1.jpeg
     *
     * @var string
     */
    public $goodsStoreLogo;

    // 店铺logo临时访问地址
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $goodsStoreLogoTmp;

    // 商品描述
    /**
     * @example 这是一段商品描述
     *
     * @var string
     */
    public $goodsDescription;

    // 商品品牌
    /**
     * @example 小龙坎
     *
     * @var string
     */
    public $goodsBrand;

    // 授权过期类型，0：长久有效，1：有效日期内有效
    /**
     * @example 0
     *
     * @var string
     */
    public $authorizationExpiratedType;

    // 授权截止日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $authorizationEndTime;

    // 发售渠道
    /**
     * @example 拼多多;淘宝
     *
     * @var string
     */
    public $goodsSaleChannel;

    // 商品规格
    /**
     * @example
     *
     * @var ProductSpecification[]
     */
    public $goodsSpecifications;

    // 是否展示批次数据
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDisplayBatchdata;

    // 商品售价
    /**
     * @example 1
     *
     * @var string
     */
    public $sellingPrice;

    // 背景氛围图
    /**
     * @example oss://
     *
     * @var string
     */
    public $backgroundPicture;
    protected $_name = [
        'goodsName'                  => 'goods_name',
        'goodsUrl'                   => 'goods_url',
        'goodsImage'                 => 'goods_image',
        'goodsImageTmp'              => 'goods_image_tmp',
        'goodsStore'                 => 'goods_store',
        'goodsStoreLogo'             => 'goods_store_logo',
        'goodsStoreLogoTmp'          => 'goods_store_logo_tmp',
        'goodsDescription'           => 'goods_description',
        'goodsBrand'                 => 'goods_brand',
        'authorizationExpiratedType' => 'authorization_expirated_type',
        'authorizationEndTime'       => 'authorization_end_time',
        'goodsSaleChannel'           => 'goods_sale_channel',
        'goodsSpecifications'        => 'goods_specifications',
        'isDisplayBatchdata'         => 'is_display_batchdata',
        'sellingPrice'               => 'selling_price',
        'backgroundPicture'          => 'background_picture',
    ];

    public function validate()
    {
        Model::validatePattern('authorizationEndTime', $this->authorizationEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsUrl) {
            $res['goods_url'] = $this->goodsUrl;
        }
        if (null !== $this->goodsImage) {
            $res['goods_image'] = $this->goodsImage;
        }
        if (null !== $this->goodsImageTmp) {
            $res['goods_image_tmp'] = $this->goodsImageTmp;
        }
        if (null !== $this->goodsStore) {
            $res['goods_store'] = $this->goodsStore;
        }
        if (null !== $this->goodsStoreLogo) {
            $res['goods_store_logo'] = $this->goodsStoreLogo;
        }
        if (null !== $this->goodsStoreLogoTmp) {
            $res['goods_store_logo_tmp'] = $this->goodsStoreLogoTmp;
        }
        if (null !== $this->goodsDescription) {
            $res['goods_description'] = $this->goodsDescription;
        }
        if (null !== $this->goodsBrand) {
            $res['goods_brand'] = $this->goodsBrand;
        }
        if (null !== $this->authorizationExpiratedType) {
            $res['authorization_expirated_type'] = $this->authorizationExpiratedType;
        }
        if (null !== $this->authorizationEndTime) {
            $res['authorization_end_time'] = $this->authorizationEndTime;
        }
        if (null !== $this->goodsSaleChannel) {
            $res['goods_sale_channel'] = $this->goodsSaleChannel;
        }
        if (null !== $this->goodsSpecifications) {
            $res['goods_specifications'] = [];
            if (null !== $this->goodsSpecifications && \is_array($this->goodsSpecifications)) {
                $n = 0;
                foreach ($this->goodsSpecifications as $item) {
                    $res['goods_specifications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->isDisplayBatchdata) {
            $res['is_display_batchdata'] = $this->isDisplayBatchdata;
        }
        if (null !== $this->sellingPrice) {
            $res['selling_price'] = $this->sellingPrice;
        }
        if (null !== $this->backgroundPicture) {
            $res['background_picture'] = $this->backgroundPicture;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeGoodsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_url'])) {
            $model->goodsUrl = $map['goods_url'];
        }
        if (isset($map['goods_image'])) {
            $model->goodsImage = $map['goods_image'];
        }
        if (isset($map['goods_image_tmp'])) {
            $model->goodsImageTmp = $map['goods_image_tmp'];
        }
        if (isset($map['goods_store'])) {
            $model->goodsStore = $map['goods_store'];
        }
        if (isset($map['goods_store_logo'])) {
            $model->goodsStoreLogo = $map['goods_store_logo'];
        }
        if (isset($map['goods_store_logo_tmp'])) {
            $model->goodsStoreLogoTmp = $map['goods_store_logo_tmp'];
        }
        if (isset($map['goods_description'])) {
            $model->goodsDescription = $map['goods_description'];
        }
        if (isset($map['goods_brand'])) {
            $model->goodsBrand = $map['goods_brand'];
        }
        if (isset($map['authorization_expirated_type'])) {
            $model->authorizationExpiratedType = $map['authorization_expirated_type'];
        }
        if (isset($map['authorization_end_time'])) {
            $model->authorizationEndTime = $map['authorization_end_time'];
        }
        if (isset($map['goods_sale_channel'])) {
            $model->goodsSaleChannel = $map['goods_sale_channel'];
        }
        if (isset($map['goods_specifications'])) {
            if (!empty($map['goods_specifications'])) {
                $model->goodsSpecifications = [];
                $n                          = 0;
                foreach ($map['goods_specifications'] as $item) {
                    $model->goodsSpecifications[$n++] = null !== $item ? ProductSpecification::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['is_display_batchdata'])) {
            $model->isDisplayBatchdata = $map['is_display_batchdata'];
        }
        if (isset($map['selling_price'])) {
            $model->sellingPrice = $map['selling_price'];
        }
        if (isset($map['background_picture'])) {
            $model->backgroundPicture = $map['background_picture'];
        }

        return $model;
    }
}
