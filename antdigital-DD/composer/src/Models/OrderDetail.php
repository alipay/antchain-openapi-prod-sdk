<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class OrderDetail extends Model {
    protected $_name = [
        'itemName' => 'item_name',
        'quantity' => 'quantity',
        'price' => 'price',
    ];
    public function validate() {
        Model::validateRequired('itemName', $this->itemName, true);
        Model::validateRequired('quantity', $this->quantity, true);
        Model::validateRequired('price', $this->price, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->itemName) {
            $res['item_name'] = $this->itemName;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['item_name'])){
            $model->itemName = $map['item_name'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['price'])){
            $model->price = $map['price'];
        }
        return $model;
    }
    // 商品名称
    /**
     * @example 商品A
     * @var string
     */
    public $itemName;

    // 数量
    /**
     * @example 2
     * @var int
     */
    public $quantity;

    // 单价
    /**
     * @example 50
     * @var int
     */
    public $price;

}
