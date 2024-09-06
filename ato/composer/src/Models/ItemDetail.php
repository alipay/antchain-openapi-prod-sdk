<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ItemDetail extends Model
{
    // 租赁商品类目，可选项见 https://opendocs.alipay.com/open/10719
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
        Model::validateRequired('goodsCategory', $this->goodsCategory, true);
        Model::validateRequired('itemName', $this->itemName, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateMaxLength('goodsCategory', $this->goodsCategory, 30);
        Model::validateMaxLength('itemName', $this->itemName, 64);
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
