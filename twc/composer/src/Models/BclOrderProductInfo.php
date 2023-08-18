<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclOrderProductInfo extends Model
{
    // 创建商品后返回的商品id
    /**
     * @example PROD1223
     *
     * @var string
     */
    public $productId;

    // 商品数量
    // 目前只允许一个商品
    /**
     * @example 1
     *
     * @var int
     */
    public $productNumber;
    protected $_name = [
        'productId'     => 'product_id',
        'productNumber' => 'product_number',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productNumber', $this->productNumber, true);
        Model::validateMaxLength('productId', $this->productId, 32);
        Model::validateMinimum('productNumber', $this->productNumber, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productNumber) {
            $res['product_number'] = $this->productNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclOrderProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_number'])) {
            $model->productNumber = $map['product_number'];
        }

        return $model;
    }
}
