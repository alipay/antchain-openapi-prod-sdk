<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class GoodsDetail extends Model
{
    // 商品编号
    /**
     * @example apple-01
     *
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @example apple
     *
     * @var string
     */
    public $goodsName;

    // 商品数量
    /**
     * @example 1
     *
     * @var string
     */
    public $quantity;

    // 商品单价
    /**
     * @example 200
     *
     * @var string
     */
    public $price;

    // 商品类目
    /**
     * @example 34543238
     *
     * @var string
     */
    public $goodsCategory;

    // 商品类目树
    /**
     * @example 124868003|126232002|126252004
     *
     * @var string
     */
    public $categoriesTree;

    // 商品的展示地址
    /**
     * @example http://www.alipay.com/xxx.jpg
     *
     * @var string
     */
    public $showUrl;

    // 商品69条码
    /**
     * @example 6972829161111
     *
     * @var string
     */
    public $goodsEanId;

    // 商家侧小程序商品 ID
    /**
     * @example outItem_01
     *
     * @var string
     */
    public $outItemId;

    // 商家侧小程序商品ID
    /**
     * @example outSku_01
     *
     * @var string
     */
    public $outSkuId;
    protected $_name = [
        'goodsId'        => 'goods_id',
        'goodsName'      => 'goods_name',
        'quantity'       => 'quantity',
        'price'          => 'price',
        'goodsCategory'  => 'goods_category',
        'categoriesTree' => 'categories_tree',
        'showUrl'        => 'show_url',
        'goodsEanId'     => 'goods_ean_id',
        'outItemId'      => 'out_item_id',
        'outSkuId'       => 'out_sku_id',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('price', $this->price, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->goodsCategory) {
            $res['goods_category'] = $this->goodsCategory;
        }
        if (null !== $this->categoriesTree) {
            $res['categories_tree'] = $this->categoriesTree;
        }
        if (null !== $this->showUrl) {
            $res['show_url'] = $this->showUrl;
        }
        if (null !== $this->goodsEanId) {
            $res['goods_ean_id'] = $this->goodsEanId;
        }
        if (null !== $this->outItemId) {
            $res['out_item_id'] = $this->outItemId;
        }
        if (null !== $this->outSkuId) {
            $res['out_sku_id'] = $this->outSkuId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['goods_category'])) {
            $model->goodsCategory = $map['goods_category'];
        }
        if (isset($map['categories_tree'])) {
            $model->categoriesTree = $map['categories_tree'];
        }
        if (isset($map['show_url'])) {
            $model->showUrl = $map['show_url'];
        }
        if (isset($map['goods_ean_id'])) {
            $model->goodsEanId = $map['goods_ean_id'];
        }
        if (isset($map['out_item_id'])) {
            $model->outItemId = $map['out_item_id'];
        }
        if (isset($map['out_sku_id'])) {
            $model->outSkuId = $map['out_sku_id'];
        }

        return $model;
    }
}
