<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderProductInfo extends Model
{
    // 商品编码
    /**
     * @example 123456789012446
     *
     * @var string
     */
    public $productId;

    // 商品名称
    /**
     * @example 苹果手机
     *
     * @var string
     */
    public $productName;

    // 商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $productNumber;
    protected $_name = [
        'productId'     => 'product_id',
        'productName'   => 'product_name',
        'productNumber' => 'product_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productNumber) {
            $res['product_number'] = $this->productNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_number'])) {
            $model->productNumber = $map['product_number'];
        }

        return $model;
    }
}
