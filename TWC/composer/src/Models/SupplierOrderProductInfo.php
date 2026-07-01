<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SupplierOrderProductInfo extends Model
{
    // 商品id
    /**
     * @example product_id_123
     *
     * @var string
     */
    public $productId;

    // 商品采购单价，单位：毫厘
    /**
     * @example 10000
     *
     * @var int
     */
    public $productPrice;

    // 商品的sn信息
    /**
     * @example ["sn1","sn2"]
     *
     * @var string[]
     */
    public $snList;
    protected $_name = [
        'productId'    => 'product_id',
        'productPrice' => 'product_price',
        'snList'       => 'sn_list',
    ];

    public function validate()
    {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateRequired('snList', $this->snList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->snList) {
            $res['sn_list'] = $this->snList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupplierOrderProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['sn_list'])) {
            if (!empty($map['sn_list'])) {
                $model->snList = $map['sn_list'];
            }
        }

        return $model;
    }
}
