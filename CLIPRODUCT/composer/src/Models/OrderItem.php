<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CLIPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class OrderItem extends Model {
    protected $_name = [
        'itemId' => 'item_id',
        'quantity' => 'quantity',
    ];
    public function validate() {
        Model::validateRequired('itemId', $this->itemId, true);
        Model::validateRequired('quantity', $this->quantity, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['item_id'])){
            $model->itemId = $map['item_id'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        return $model;
    }
    // 商品ID
    /**
     * @example SKU001
     * @var string
     */
    public $itemId;

    // 数量
    /**
     * @example 2
     * @var int
     */
    public $quantity;

}
