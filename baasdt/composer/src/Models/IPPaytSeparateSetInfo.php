<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPPaytSeparateSetInfo extends Model
{
    // 授权品类
    /**
     * @example 服装
     *
     * @var string
     */
    public $category;

    // 单件单价
    /**
     * @example 5
     *
     * @var string
     */
    public $unitPrice;

    // 保底商品数量
    /**
     * @example 100
     *
     * @var string
     */
    public $guaranteeGoodsNumber;
    protected $_name = [
        'category'             => 'category',
        'unitPrice'            => 'unit_price',
        'guaranteeGoodsNumber' => 'guarantee_goods_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->guaranteeGoodsNumber) {
            $res['guarantee_goods_number'] = $this->guaranteeGoodsNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPPaytSeparateSetInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
        }
        if (isset($map['guarantee_goods_number'])) {
            $model->guaranteeGoodsNumber = $map['guarantee_goods_number'];
        }

        return $model;
    }
}
