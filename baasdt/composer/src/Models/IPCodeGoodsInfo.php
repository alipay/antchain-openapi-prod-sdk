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

    // 商品店铺名称
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
    protected $_name = [
        'goodsName'      => 'goods_name',
        'goodsUrl'       => 'goods_url',
        'goodsImage'     => 'goods_image',
        'goodsStore'     => 'goods_store',
        'goodsStoreLogo' => 'goods_store_logo',
    ];

    public function validate()
    {
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
        if (null !== $this->goodsStore) {
            $res['goods_store'] = $this->goodsStore;
        }
        if (null !== $this->goodsStoreLogo) {
            $res['goods_store_logo'] = $this->goodsStoreLogo;
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
        if (isset($map['goods_store'])) {
            $model->goodsStore = $map['goods_store'];
        }
        if (isset($map['goods_store_logo'])) {
            $model->goodsStoreLogo = $map['goods_store_logo'];
        }

        return $model;
    }
}
