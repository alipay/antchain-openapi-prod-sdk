<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ItemDetail extends Model
{
    // 租赁商品类目，可选类型：
    // RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
    /**
     * @example RENT_PHONE
     *
     * @var string
     */
    public $goodsCategory;

    // 租赁商品名称
    /**
     * @example 全新国行iPhone15Pro A17Pro处理器
     *
     * @var string
     */
    public $itemName;

    // 租赁商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $quantity;
    protected $_name = [
        'goodsCategory' => 'goods_category',
        'itemName'      => 'item_name',
        'quantity'      => 'quantity',
    ];

    public function validate()
    {
        Model::validateMaxLength('goodsCategory', $this->goodsCategory, 30);
        Model::validateMaxLength('itemName', $this->itemName, 128);
        Model::validateMaximum('quantity', $this->quantity, 10000);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsCategory) {
            $res['goods_category'] = $this->goodsCategory;
        }
        if (null !== $this->itemName) {
            $res['item_name'] = $this->itemName;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_category'])) {
            $model->goodsCategory = $map['goods_category'];
        }
        if (isset($map['item_name'])) {
            $model->itemName = $map['item_name'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }

        return $model;
    }
}
