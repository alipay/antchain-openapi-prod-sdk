<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ScalperQueryOrderItem extends Model
{
    // 订单商品名称
    /**
     * @example 商品1
     *
     * @var string
     */
    public $orderItemsName;

    // 订单商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $orderItemsQuantity;

    // 订单商品价格，单位：分
    /**
     * @example 20000
     *
     * @var int
     */
    public $orderItemsPrice;
    protected $_name = [
        'orderItemsName'     => 'order_items_name',
        'orderItemsQuantity' => 'order_items_quantity',
        'orderItemsPrice'    => 'order_items_price',
    ];

    public function validate()
    {
        Model::validateMaxLength('orderItemsName', $this->orderItemsName, 256);
        Model::validateMinLength('orderItemsName', $this->orderItemsName, 1);
        Model::validateMaximum('orderItemsQuantity', $this->orderItemsQuantity, 100000);
        Model::validateMaximum('orderItemsPrice', $this->orderItemsPrice, 10000000);
        Model::validateMinimum('orderItemsQuantity', $this->orderItemsQuantity, 1);
        Model::validateMinimum('orderItemsPrice', $this->orderItemsPrice, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderItemsName) {
            $res['order_items_name'] = $this->orderItemsName;
        }
        if (null !== $this->orderItemsQuantity) {
            $res['order_items_quantity'] = $this->orderItemsQuantity;
        }
        if (null !== $this->orderItemsPrice) {
            $res['order_items_price'] = $this->orderItemsPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScalperQueryOrderItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_items_name'])) {
            $model->orderItemsName = $map['order_items_name'];
        }
        if (isset($map['order_items_quantity'])) {
            $model->orderItemsQuantity = $map['order_items_quantity'];
        }
        if (isset($map['order_items_price'])) {
            $model->orderItemsPrice = $map['order_items_price'];
        }

        return $model;
    }
}
