<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplySupplierOrderProductInput extends Model
{
    // 采购商品id
    /**
     * @example 202024234234
     *
     * @var string
     */
    public $productId;

    // 采购商品数量
    /**
     * @example 100
     *
     * @var int
     */
    public $productNum;
    protected $_name = [
        'productId'  => 'product_id',
        'productNum' => 'product_num',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productNum', $this->productNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productNum) {
            $res['product_num'] = $this->productNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplySupplierOrderProductInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_num'])) {
            $model->productNum = $map['product_num'];
        }

        return $model;
    }
}
